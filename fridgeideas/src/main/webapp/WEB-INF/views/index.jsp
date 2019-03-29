<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./_head.jsp" %>

      <div class="main">
        <div class="search">
          <form action="#" method="get">
            <input type="text" name="searchtext" placeholder="What's in your fridge" />
            <input type="button" name="searchbutton"  value="Go!" onclick="alert('hello')"></button>
          </form>
        </div>
        <div class="weektop">
        <c:forEach var="item" items="${list }">
          <a href="${ctxPath }/recipe/recipe_view?seq=${item.seq}"><article>
            <div class="img_container">
              <img class="main_image" width="310px" height="297px" src="${ctxPath }/image/thumbnail?recipe_id=${item.seq}&fileName=${item.fileName}" alt="썸네일" />
              <img class="heart" src="${ctxPath }/img/heart.png" alt="스크랩" />
            </div>
            <div class="img_info">
              <p>${item.recipe_name }</p>
              <p>★★★☆☆</p>
              <p>${item.author_write }</p>
              <p>by ${item.nick }</p>
            </div>
          </article></a>
          </c:forEach>
        </div>
      </div>
      
<%@ include file="./_tail.jsp" %>