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
      <p>제목입니다. 제목입니다.</p>
      <p>닉네임입니다.</p>
      <p>19-03-25</p>
    </div>
    <div class="content">
      <img src="${ctxPath }/img/recipe.jpg" alt="#" />
      <div>
	        글 내용 입니다.<br />
	        글 내용 입니다.<br />
	        글 내용 입니다.<br />
	        글 내용 입니다.<br />
	        글 내용 입니다.<br />
	        글 내용 입니다.<br />
	        글 내용 입니다.<br />
	        글 내용 입니다.<br />
	        글 내용 입니다.<br />
	        글 내용 입니다.<br />
      </div>
    </div>
  </div>
  
  <!--댓글 리스트-->
  <div class="comment_list">
    <div class="comment">
      <div>
        <p>댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.댓글내용입니다.</p>
        <p>아이디입니다.</p>
        <p>19-03-25</p>
      </div>
    </div>
    <div class="comment">
      <div>
        <p>
          댓글내용입니다.<br/>
          댓글내용입니다.<br/>
          댓글내용입니다.<br/>
          댓글내용입니다.<br/>
          댓글내용입니다.<br/>
          댓글내용입니다.<br/>

        </p>
        <p>아이디입니다.</p>
        <p>19-03-25</p>
      </div>
    </div>
  </div>
  
  <!--댓글 쓰기-->
  <section class="comment_write">
	<h3>댓글쓰기</h3>
	<div>
		<form action="./proc/commentWrite.jsp" method="post">
			<textarea name="comment" rows="5"></textarea>
			<div class="btns">
				<input type="reset" name="reset" value="취소" />
				<input type="submit" name="submit" value="작성완료" />
			</div>
		</form>
	</div>
  </section>
</section>
<%@ include file="../_tail.jsp"%>