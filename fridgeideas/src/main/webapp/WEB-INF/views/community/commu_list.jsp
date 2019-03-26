<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_head.jsp" %>
<section id="sub">
  <div class="banner" id="community_banner">
  	<span>Community</span>
  </div>
  <nav>
    <img src="${ctxPath }/img/tag.png" alt="tag" />
    <span>Home > <strong>Community</strong></span>
  </nav>
  <div class="commu_list">
      <div class="list_fnc">
        <input type="text" name="searchQnA" placeholder="Search What You Want to Ask" />
        <input type="button" name="QnAbtn" onclick="searchList()" />
        <a href="${ctxPath }/community/commu_write"><input type="button" name="writeBtn" value="write" /></a>
      </div>
      <div class="board_list">
        <div>
          <a href="${ctxPath }/community/commu_view"><p>글제목입니다.길게 작성해봅시다.얼마나더 길게 작성해볼까 overflow되고있나</p></a>
          <p>닉네임입니다.</p>
          <p>19-03-21</p>
          <p>0<br />answers</p>
          <p>1<br />view</p>
          <p>0<br />hit</p>
        </div>
        <div>
          <a href="#"><p>글제목입니다.길게 작성해봅시다.얼마나 더 길게 작성해볼까 가</p></a>
          <p>닉네임입니다.</p>
          <p>19-03-21</p>
          <p>0<br />answers</p>
          <p>1<br />view</p>
          <p>0<br />hit</p>
        </div>
        <div>3</div>
        <div>4</div>
        <div>5</div>
        <div>6</div>
        <div>7</div>
        <div>8</div>
        <div>9</div>
        <div>10</div>
      </div>
      <div class="paging">
		<span>
		<a href="#" class="Prev">prev</a>
		<a href="#" class="num">1</a>
		<a href="#" class="next">Next</a>
		</span>
   	 </div>
  </div>
</section>
<%@ include file="../_tail.jsp" %>
