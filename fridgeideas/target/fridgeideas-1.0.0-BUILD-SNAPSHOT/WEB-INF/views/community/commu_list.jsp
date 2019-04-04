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
      <c:forEach var="vo" items="${list}">
        <div>
          <a href="${ctxPath }/community/commu_view?seq=${vo.seq}"><p>${vo.title }</p></a>
          <p>${vo.nick }</p>
          <p>${vo.rdate.substring(2,10) }</p>
          <p>${vo.comment }<br />answers</p>
          <p>${vo.view }<br />view</p>
          <p>${vo.hit }<br />hit</p>
        </div>
       </c:forEach>
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
