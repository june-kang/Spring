<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <div id="loginLayout">
        <div class="login">
          <p>
            <a><img src="${ctxPath }/img/clear-button.png" class="clear_btn" alt="clear_login" /></a>
            <span>Login</span>
          </p>
          <div class="log_form">
            <form action="#" method="post">
              <table>
                <tr>
                  <td><img src="${ctxPath }/img/id_img.jpg" alt="id" /></td>
                  <td><input type="text" name="uid" /></td>
                </tr>
                <tr>
                  <td><img src="${ctxPath }/img/pw_img.jpg" alt="pass" /></td>
                  <td><input type="password" name="pass" /></td>
                </tr>
              </table>
              <input type="submit" value="Login" class="log_but">
            </form>
          </div>
          <div class="notyet">
            <span>아직 레시피아이디어스의 회원이 아니세요?<br />
            <a href="${ctxPath }/member/terms">>회원가입하기</a></span>
          </div>
          <div class="forgetyourinfo">
            <span>아이디와 비밀번호를 잊으셨나요? <br />
            <a href="#">>아이디/비밀번호 찾기</a></span>
          </div>
        </div>
      </div>
  </div>
  </body>
  <footer>
   <section class="footer_section">
     <div class="sns_icon">
       <a href="#"><img src="${ctxPath }/img/facebook.png" alt="페이스북"></a>
       <a href="#"><img src="${ctxPath }/img/instagram.png" alt="인스타그램"></a>
       <a href="#"><img src="${ctxPath }/img/twitter.png" alt="트위터"></a>
       <a href="#"><img src="${ctxPath }/img/youtube.png" alt="유튜브"></a>
       <a href="#"><img src="${ctxPath }/img/whatsapp.png" alt="whatsapp"></a>
       <a href="#"><img src="${ctxPath }/img/periscope.png" alt="위치"></a>
       <p>
         <a href="#">Support</a><br />
         <a href="#">Site map</a><br />
         <a href="#">Contact Us</a><br />
         <a href="#">Customer Support</a>
       </p>
     </div>
     <div class="comp_info">
       <p>
         <strong>About Us</strong><br />
         <a href="#">Newsroom</a><br />
         <a href="#">Jobs At FridgeIdeas</a>
       </p>
       <p>
         <strong>ⓒ 2019 Fridgeideas<br />
         All Rights reserved</strong><br />
         <a href="#">Privacy Policy</a><br />
         <a href="#">Terms of Service</a><br />
         <a href="#">Data Policy</a>
       </p>
     </div>
     <div class="more_fridgeideas">
       <p>
         <strong>Advertising</strong><br />
         <a href="#">Advertise with Us</a><br />
       </p>
       <p>
         <strong>More FridgeIdeas</strong><br />
         <a href="#">FridgeIdeas Apps</a><br />
         <a href="#">FridgeIdeas Blog</a><br />
         <a href="#">Food Videos</a>
       </p>
     </div>
   </section>
  </footer>
</html>
