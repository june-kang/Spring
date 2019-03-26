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
    <form action="#" method="get">
      <input type="text" name="searchtext" placeholder="What's in your fridge" />
      <input type="button" name="searchbutton"  value="Go!" onclick="alert('hello')"></button>
      <select name="category">
        <option value="breakfast">breakfast</option>
        <option value="dessert">dessert</option>
        <option value="dinner">dinner</option>
        <option value="holiday">holiday</option>
        <option value="vegan">vegan</option>
      </select>
      <select name="cooking_level">
        <option value="beginning">beginning</option>
        <option value="intermediate">intermediate</option>
        <option value="advanced">advanced</option>
      </select>
      <select name="cooking_time">
        <option value="under 30">under 30m</option>
        <option value="30-1h">30m-1h</option>
        <option value="over 1h">over 1h</option>
      </select>
    </form>
  </div>
  <div class="search_result">
    <a href="#"><article>
      <div class="img_container">
        <img class="main_image" src="${ctxPath }/img/notice.jpg" alt="스크랩전" />
        <img class="heart" src="${ctxPath }/img/heart.png" alt="스크랩후" />
      </div>
      <div class="img_info">
        <p>음식이름</p>
        <p>★★★☆☆</p>
        <p>음식정보입니다. 이 음식에 관련된 내용을 입력해주세요.음식정보입니다. 이 음식에 관련된 내용을 입력해주세요.음식정보입니다. 이 음식에 관련된 내용을 입력해주세요.음식정보입니다. 이 음식에 관련된 내용을 입력해주세요.</p>
        <p>by 작성자닉네임</p>
      </div>
    </article></a>
    <a href="#"><article></article></a>
    <a href="#"><article></article></a>
  </div>
</div>
</section>
<%@ include file="../_tail.jsp" %>