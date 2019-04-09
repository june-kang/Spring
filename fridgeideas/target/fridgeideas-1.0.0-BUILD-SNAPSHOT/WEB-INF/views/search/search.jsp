<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_head.jsp" %>
<section id="sub">
  <div class="banner" id="search_banner"><span>Search</span></div>
  <nav id="search">
    <img src="${ctxPath }/img/tag.png" alt="tag" />
    <span>Home > <strong>Search</strong></span>
  </nav>
  <div class="recipe_search">
  <div class="search">
    <form action="${ctxPath }/search" method="get">
      <input type="text" name="ingredients" placeholder="What's in your fridge" />
      
      <select name="category">
        <option value="Breakfast">Breakfast</option>
        <option value="Dessert">Dessert</option>
        <option value="Dinner">Dinner</option>
        <option value="Holiday">Holiday</option>
        <option value="Vegan">Vegan</option>
      </select>
      <select name="cooking_level">
        <option value="Beginner">Beginner</option>
        <option value="Intermediate">Intermediate</option>
        <option value="Advanced">Advanced</option>
      </select>
      <select name="cooking_time">
        <option value="under 30m">under 30m</option>
        <option value="30m-1h">30m-1h</option>
        <option value="over 1h">over 1h</option>
      </select>
      <input type="submit" name="searchbutton" value="Go!" />
    </form>
  </div>
  <div class="search_result">
  
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
</section>
<%@ include file="../_tail.jsp" %>