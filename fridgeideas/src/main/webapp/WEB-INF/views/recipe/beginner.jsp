<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_head.jsp" %>
<link rel="stylesheet" type="text/css" href="http://kenwheeler.github.io/slick/slick/slick.css" />
<link rel="stylesheet" type="text/css" href="http://kenwheeler.github.io/slick/slick/slick-theme.css" />
<script type="text/javascript" src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="http://kenwheeler.github.io/slick/slick/slick.min.js"></script>
<script>
  $(document).ready(function(){
      $('.slider').slick({
        dots: false,
        arrows: true,
        infinite: false,
        slidesToShow: 5,
        slidesToScroll: 1,
        cssEase: "ease",
        autoplay: false
  });
});
</script>
    <link rel="stylesheet" href="${ctxPath }/css/style.css" />
    <script src="${ctxPath }/js/login_form.js"></script>
      <section id="sub">
        <div class="banner" id="recipe_banner"><span>Recipe</span></div>
        <div class="slider">
          <div><a href="${ctxPath }/beginner"><img src="${ctxPath }/img/beginner.png" alt="beginner" /><span>Beginner</span></a></div>
          <div><a href="${ctxPath }/breakfast"><img src="${ctxPath }/img/breakfast.png" alt="breakfast" /><span>Breakfast & Brunch</span></a></div>
          <div><a href="${ctxPath }/dinner"><img src="${ctxPath }/img/dinner.png" alt="dinner" /><span>Dinner</span></a></div>
          <div><a href="${ctxPath }/holiday"><img src="${ctxPath }/img/holiday.png" alt="holiday" /><span>Holiday</span></a></div>
          <div><a href="${ctxPath }/vegan"><img src="${ctxPath }/img/vegan.png" alt="vegan" /><span>Vegan</span></a></div>
          <div><a href="${ctxPath }/dessert"><img src="${ctxPath }/img/dessert.png" alt="dessert" /><span>Dessert</span></a></div>
          <div><a href="./monthbest.html"><img src="${ctxPath }/img/monthbest.png" alt="monthbest" /><span>Recipe of the Month</span></a></div>
        </div>
        <nav>
          <img src="${ctxPath }/img/tag.png" alt="tag" />
          <span>Home > Recipe > <strong>Beginner</strong></span>
        </nav>
        <div class="content">
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
          <article></article>
          <article></article>
        </div>
      </section>
<%@ include file="../_tail.jsp" %>