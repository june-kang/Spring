<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>초보자 요리</title>
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
    <style>

    </style>
    <link rel="stylesheet" href="../css/style.css" />
    <script src="../js/login_form.js"></script>
  </head>

  <body>
    <div id="wrapper">
      <header>
        <p>
          <a href="#"><img src="../img/writing.png" title="글쓰기" alt="글쓰기" /></a>
          <a href="../member/terms.html"><img src="../img/register.png" title="회원가입" alt="회원가입" /></a>
          <a href="#"><img id="login_btn" src="../img/login.png" title="로그인" alt="로그인" /></a>
          <a href="#"><img src="../img/logout.png" alt="로그아웃"></a>
          <a href="../index.html"><img src="../img/home.png" title="홈" alt="홈" /></a>
        </p>
        <a href="../index.html"><img src="../img/logo.png" alt="로고"></a>
        <ul class="gnb">
          <li><a href="#">Search</a></li>
          <li><a href="./beginner.html">Recipe</a></li>
          <li><a href="../tips/usingtools.html">Tips</a></li>
          <li><a href="../community/list.html">Community</a></li>
          <li><a href="#">Notice</a></li>
          <li><a href="#">My page</a></li>
        </ul>
      </header>
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
          <span>Home > Recipe > <strong>Holiday</strong></span>
        </nav>
        <div class="content">
          <article></article>
          <article></article>
          <article></article>
        </div>
      </section>

      <div id="loginLayout">
        <div class="login">
          <p>
            <a><img src="../img/clear-button.png" class="clear_btn" alt="clear_login" /></a>
            <span>Login</span>
          </p>
          <div class="log_form">
            <form action="#" method="post">
              <table>
                <tr>
                  <td><img src="../img/id_img.jpg" alt="id" /></td>
                  <td><input type="text" name="uid" /></td>
                </tr>
                <tr>
                  <td><img src="../img/pw_img.jpg" alt="pass" /></td>
                  <td><input type="password" name="pass" /></td>
                </tr>
              </table>
              <input type="submit" value="Login" class="log_but">
            </form>
          </div>
          <div class="notyet">
            <span>아직 레시피아이디어스의 회원이 아니세요?<br />
            <a href="#">>회원가입하기</a></span>
          </div>
          <div class="forgetyourinfo">
            <span>아이디와 비밀번호를 잊으셨나요? <br />
            <a href="#">>아이디/비밀번호 찾기</a></span>
          </div>
        </div>
      </div>

    </div>
  </body>
</html>
