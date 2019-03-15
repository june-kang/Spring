<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>글보기</title> 
		<link rel="stylesheet" href="/sboard/css/style.css" />
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script>
			$(document).ready(function(){
				var comments = $('.comments');
				var comment = $('.comments>.comment');
				var empty = $('.empty');
				var parent = $('#seq').val();
				
				$.ajax({
					url:'/sboard/commentList',
					data:{"parent":parent},
					dataType:'json',
					success: function(result){
						//alert(result[0].nick);
						
						if(result.length == 0){
							comment.remove();
						} else {
							empty.remove();
						}
						
						for(var i in result){
							
							var delUrl = "/sboard/commentDelete?seq="+result[i].seq+"&parent="+result[i].parent;
							var modUrl = "/sboard/commentModify?seq="+result[i].seq;
							
							if(i > 0){
								var commentCloned = comment.clone();
								commentCloned.find('span > .nick').text(result[i].nick);
								commentCloned.find('span > .date').text(result[i].rdate.toString().substring(2,10)); // comment 자식의 span의 date 클래스 찾아서 값입력
								commentCloned.find('textarea').text(result[i].content);
								commentCloned.find('.del').attr('href', delUrl);
								
								comments.append(commentCloned);
								
							} else {
								comment.find('span > .nick').text(result[i].nick);
								comment.find('span > .date').text(result[i].rdate.toString().substring(2,10)); // comment 자식의 span의 date 클래스 찾아서 값입력
								comment.find('textarea').text(result[i].content);
								comment.find('.del').attr('href', delUrl);
							}
						}
						
					}
					
				});
			});
			
			
			// 댓글 수정하기
			function modify(){
				alert('수정버튼 !!!!');
			}
		
		</script>
	</head>
	<body>
		<div id="board">
			<h3>글보기</h3>
			<div class="view">
				<form action="#" method="post">
				<input type="hidden" id="seq" value=${boardVO.seq } readonly />
					<table>
						<tr>
							<td>제목</td>
							<td>${boardVO.title }</td>
						</tr>
						<c:if test="${boardVO.file!=0 }">
						<tr>
							<td>첨부파일</td>
							<td>
								<img src="/sboard/img/file_ico.png" alt="파일" />
								<a href="/sboard/fileDownload?parent=${boardVO.seq }">${boardVO.oldName }</a>
								<span>${boardVO.download }회 다운로드</span>
							</td>
						</tr>
						</c:if>
						
						<tr>
							<td>내용</td>
							<td>
								<textarea name="content" rows="20" readonly>${boardVO.content }</textarea>
							</td>
						</tr>
					</table>
					<div class="btns">
						<c:if test="${boardVO.uid==sessionScope.member.uid}">
						<a href="/sboard/delete?seq=${boardVO.seq}" class="cancel del">삭제</a>
						<a href="#" class="cancel mod">수정</a>
						</c:if>
						<a href="/sboard/list" class="cancel">목록</a>
					</div>
				</form>
			</div><!-- view 끝 -->
			
			<!-- 댓글리스트 -->
			<section class="comments">
				<h3>댓글목록</h3>
				
				<div class="comment">
					<span>
						<span class="nick">홍길동</span>
						<span class="date">18-03-01</span>
					</span>
					<textarea>테스트 댓글입니다.</textarea>
					<div>
						<a href="/sboard/commentDelete" class="del">삭제</a>
						<a href="#" onclick="javascript:modify(this);" class="mod">수정</a>
					</div>
				</div>
			
				<p class="empty">등록된 댓글이 없습니다.</p>
				
			</section>
			
			<!-- 댓글쓰기 -->
			<section class="comment_write">
				<h3>댓글쓰기</h3>
				<div>
					<form action="/sboard/commentWrite" method="post">
					<input type="hidden" name="parent" value="${boardVO.getSeq() }" />
					<input type="hidden" name="uid" value="${member.getUid() }" />
						<textarea name="content" rows="5"></textarea>
						<div class="btns">
							<input type="reset" class="cancel" value="취소" />
							<input type="submit" class="submit" value="작성완료" />
						</div>
					</form>
				</div>
			</section>
		</div><!-- board 끝 -->
	</body>

</html>










