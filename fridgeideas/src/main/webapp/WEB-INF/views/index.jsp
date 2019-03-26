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
          <a href="${ctxPath }/recipe/recipe_view"><article>
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
          <article></article>
          <article></article>
          <article></article>
          <article></article>
          <article></article>
          <article></article>
          <article></article>
          <article></article>
          <article></article>
          <article></article>
          <article></article>
        </div>
      </div>
      
<%@ include file="./_tail.jsp" %>