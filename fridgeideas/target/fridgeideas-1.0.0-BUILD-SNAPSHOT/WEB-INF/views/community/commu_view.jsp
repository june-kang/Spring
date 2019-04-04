<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="../_head.jsp" %>
<section id="sub">
  <div class="banner" id="community_banner">
  	<span>Community</span>
  </div>
  <nav>
    <img src="${ctxPath }/img/tag.png" alt="tag" />
    <span>Home > <strong>Community</strong></span>
  </nav>
  <div class="view">
    <div class="title">
      <p>${boardVO.title }</p>
      <p>${boardVO.nick }</p>
      <p>${boardVO.rdate.substring(2,10)}</p>
    </div>
    <div class="content">
      <c:forEach var="ivo" items="${list }">
      <img src="${ctxPath }/image/download?seq=${ivo.commu_id}&fileName=${ivo.fileName}&fileType=${ivo.fileType}" alt="이미지" />
      </c:forEach>
      <div>
	        ${boardVO.content}
      </div>
    </div>
  </div>
  
  <!--댓글 리스트-->
  <div class="comments">
    <div class="comment">
      <div>
        <textarea>댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.</textarea>
        <p class="nick">닉네임입니다.</p>
        <p class="date">19-03-25</p>
      </div>
    </div>
    <p class="empty"> 등록된 댓글이 없습니다.</p>
  </div>
  
  <!--댓글 쓰기-->
  <section class="comment_write">
	<h3>댓글쓰기</h3>
	<div>
		<form action="#" method="post">
		<input type="hidden" name="parent" id="parent" value="${boardVO.seq }" />
		<input type="hidden" name="uid" value="${sessionScope.memberVO.uid }" />
		<input type="hidden" name="nick" value="${memberVO.nick }" />
			<textarea name="comment" rows="5"></textarea>
			<div class="btns">
				<input type="reset" name="reset" value="취소" />
				<input type="submit" class="submit" value="작성완료" />
			</div>
		</form>
	</div>
  </section>
  <script>
  	$(function(){
  		
  		var comments = $('.comments');
		var comment = $('.comments>.comment');
		var empty = $('.empty');
		var parent = $('#parent').val();

		console.log('here1');
		
  		$.ajax({
  			url:'/fridgeideas/community/commentList?parent='+parent,
  			type:'GET',
  			dataType:'json',
  			success:function(result){
				if(result.length==0){
					comment.remove();
				} else{
					empty.remove();
				}
				
				for(var i in result){
					
					if(i>0){
						var commentCloned = comment.clone();
						commentCloned.find('div > .nick').text(result[i].nick);
						commentCloned.find('div > .date').text(result[i].rdate.toString().substring(2,10));
						commentCloned.find('textarea').text(result[i].content);
						
						comments.append(commentCloned);
					} else{
						comment.find('div > .nick').text(result[i].nick);
						comment.find('div > .date').text(result[i].rdate.toString().substring(2,10));
						comment.find('textarea').text(result[i].content);
					}
				}
  				
  			}
  		
  			
  			
  		});
  		
  		
  		
  		
  		
  		
  		
  		
  		var btnComment = $('.comment_write .submit');
  		btnComment.click(function(){
  			
  			var parent = $('.comment_write  input[name=parent]').val();
  			var uid = $('.comment_write  input[name=uid]').val();
  			var nick = $('.comment_write  input[name=nick]').val();
  			var content = $('.comment_write  textarea').val();
  			
  			var json = {"parent":parent, "uid":uid, "nick":nick, "content":content};

  			$.ajax({
  				url:'/fridgeideas/community/commentWrite',
  				type:'POST',
  				dataType:'json',
  				data:json,
  				success:function(result){
  					
  					if(empty.is(":visible")==true){
  						empty.hide();
  					}
  					
  					var commentCloned = comment.clone();
  					commentCloned.find('textarea').text(result.content);
  					commentCloned.find('div > .nick').text(result.nick);
  					commentCloned.find('div > .date').text(result.date);
  					
  					comments.append(commentCloned);  					
  				}
  				  				
  			});
  			return false;
  		});
  		
  		
  		
  		
  		
  		
  	});
  
  </script>
</section>
<%@ include file="../_tail.jsp"%>