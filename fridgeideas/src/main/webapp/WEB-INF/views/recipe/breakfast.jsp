<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ file include="../_head.jsp" %>
<link rel="stylesheet" href="../css/style.css">
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
<script src="${ctxPath }/js/login_form.js"></script>
<link rel="stylesheet" href="${ctxPath}/css/style.css"> 
<section id="sub">
  <div class="banner" id="recipe_banner"><span>Recipe</span></div>
  <div class="slider">
    <div><a href="./beginner.html"><img src="../img/beginner.png" alt="beginner" /><span>Beginner</span></a></div>
    <div><a href="./breakfast.html"><img src="../img/breakfast.png" alt="breakfast" /><span>Breakfast & Brunch</span></a></div>
    <div><a href="./dinner.html"><img src="../img/dinner.png" alt="dinner" /><span>Dinner</span></a></div>
    <div><a href="./holiday.html"><img src="../img/holiday.png" alt="holiday" /><span>Holiday</span></a></div>
    <div><a href="./vegan.html"><img src="../img/vegan.png" alt="vegan" /><span>Vegan</span></a></div>
    <div><a href="./dessert.html"><img src="../img/dessert.png" alt="dessert" /><span>Dessert</span></a></div>
    <div><a href="./monthbest.html"><img src="../img/monthbest.png" alt="monthbest" /><span>Recipe of the Month</span></a></div>
  </div>
  <nav>
    <img src="../img/tag.png" alt="tag" />
    <span>Home > Recipe > <strong>Breafast&Brunch</strong></span>
  </nav>
  <div class="content">
    <article></article>
    <article></article>
    <article></article>
  </div>
</section>
<%@ include file="../_tail.jsp" %>