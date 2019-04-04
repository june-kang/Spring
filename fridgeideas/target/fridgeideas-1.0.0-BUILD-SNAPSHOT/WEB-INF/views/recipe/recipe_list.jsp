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
          <div><a href="${ctxPath }/recipe?cate=Beginner"><img src="${ctxPath }/img/beginner.png" alt="beginner" /><span>Beginner</span></a></div>
          <div><a href="${ctxPath }/recipe?cate=Breakfast"><img src="${ctxPath }/img/breakfast.png" alt="breakfast" /><span>Breakfast & Brunch</span></a></div>
          <div><a href="${ctxPath }/recipe?cate=Dinner"><img src="${ctxPath }/img/dinner.png" alt="dinner" /><span>Dinner</span></a></div>
          <div><a href="${ctxPath }/recipe?cate=Holiday"><img src="${ctxPath }/img/holiday.png" alt="holiday" /><span>Holiday</span></a></div>
          <div><a href="${ctxPath }/recipe?cate=Vegan"><img src="${ctxPath }/img/vegan.png" alt="vegan" /><span>Vegan</span></a></div>
          <div><a href="${ctxPath }/recipe?cate=Dessert"><img src="${ctxPath }/img/dessert.png" alt="dessert" /><span>Dessert</span></a></div>
          <div><a href="${ctxPath }/recipe?cate=Recipe of the Month"><img src="${ctxPath }/img/monthbest.png" alt="monthbest" /><span>Recipe of the Month</span></a></div>
        </div>
        <nav>
          <img src="${ctxPath }/img/tag.png" alt="tag" />
          <span>Home > Recipe > <strong>${cate }</strong></span>
        </nav>
        <div class="content">
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
      </section>
<%@ include file="../_tail.jsp" %>