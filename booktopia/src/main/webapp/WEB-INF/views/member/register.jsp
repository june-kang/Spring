<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_head.jsp" %>
<article>
  <h3>필수입력사항</h3>
  <form action="${ctxPath }/member/register" method="post">
    <div id="detail_table">
      <table>
        <tbody>
          <tr class="dot_line">
            <td class="fixed_join">아이디</td>
            <td>
              <input type="text" name="_member_id" id="_member_id" size="20">

              <input type="button" id="btnOverlapped" value="중복체크" onclick="fn_overlapped()">
            </td>
          </tr>
          <tr class="dot_line">
            <td class="fixed_join">비밀번호</td>
            <td><input name="member_pw" type="password" size="20"></td>
          </tr>
          <tr class="dot_line">
            <td class="fixed_join">이름</td>
            <td><input name="member_name" type="text" size="20"></td>
          </tr>
          <tr class="dot_line">
            <td class="fixed_join">성별</td>
            <td><input type="radio" name="member_gender" value="102">
              여성<span style="padding-left:120px"></span>
              <input type="radio" name="member_gender" value="101" checked="">남성
            </td>
          </tr>
          <tr class="dot_line">
            <td class="fixed_join">법정생년월일</td>
            <td>
              <select name="member_birth_y">
                <option value="1921">1921</option>
                <option value="1967">1967</option>
                <option value="1968">1968</option>
                <option value="1969">1969</option>
                <option value="1970">1970</option>
                <option value="1971">1971</option>
                <option value="1972">1972</option>
                <option value="1973">1973</option>
                <option value="1974">1974</option>
                <option value="1975">1975</option>
                <option value="1976">1976</option>
                <option value="1977">1977</option>
                <option value="1978">1978</option>
                <option value="1979">1979</option>
                <option value="1980">1980</option>
                <option value="1981">1981</option>
                <option value="1982">1982</option>
                <option value="1983">1983</option>
                <option value="1984">1984</option>
                <option value="1985">1985</option>
                <option value="1986">1986</option>
                <option value="1987">1987</option>
                <option value="1988">1988</option>
                <option value="1989">1989</option>
                <option value="1990">1990</option>
                <option value="1991">1991</option>
                <option value="1992">1992</option>
                <option value="1993">1993</option>
                <option value="1994">1994</option>
                <option value="1995">1995</option>
                <option value="1996">1996</option>
                <option value="1997">1997</option>
                <option value="1998">1998</option>
                <option value="1999">1999</option>
                <option value="2000" selected>2000</option>
                <option value="2001">2001</option>
                <option value="2002">2002</option>
                <option value="2003">2003</option>
                <option value="2004">2004</option>
                <option value="2005">2005</option>
                <option value="2006">2006</option>
                <option value="2007">2007</option>
                <option value="2008">2008</option>
                <option value="2009">2009</option>
                <option value="2010">2010</option>
                <option value="2011">2011</option>
                <option value="2012">2012</option>
                <option value="2013">2013</option>
                <option value="2014">2014</option>
                <option value="2015">2015</option>
                <option value="2016">2016</option>
                <option value="2017">2017</option>
                <option value="2018">2018</option>
                <option value="2019">2019</option>
                <option value="2020">2020</option>
              </select>년
              <select name="member_birth_m">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5" selected>5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10">10</option>
                <option value="11">11</option>
                <option value="12">12</option>
              </select>월
              <select name="member_birth_d">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10" selected>10</option>
                <option value="11">11</option>
                <option value="12">12</option>
                <option value="13">13</option>
                <option value="14">14</option>
                <option value="15">15</option>
                <option value="16">16</option>
                <option value="17">17</option>
                <option value="18">18</option>
                <option value="19">19</option>
                <option value="20">20</option>
                <option value="21">21</option>
                <option value="22">22</option>
                <option value="23">23</option>
                <option value="24">24</option>
                <option value="25">25</option>
                <option value="26">26</option>
                <option value="27">27</option>
                <option value="28">28</option>
                <option value="29">29</option>
                <option value="30">30</option>
                <option value="31">31</option>
              </select>일 <span style="padding-left:50px"></span>
              <input type="radio" name="member_birth_gn" value="2" checked="">양력
              <span style="padding-left:50px"></span>
              <input type="radio" name="member_birth_gn" value="1">음력
            </td>
          </tr>
          <tr class="dot_line">
            <td class="fixed_join">전화번호</td>
            <td><select name="tel1">
                <option>없음</option>
                <option value="02">02</option>
                <option value="031">031</option>
                <option value="032">032</option>
                <option value="033">033</option>
                <option value="041">041</option>
                <option value="042">042</option>
                <option value="043">043</option>
                <option value="044">044</option>
                <option value="051">051</option>
                <option value="052">052</option>
                <option value="053">053</option>
                <option value="054">054</option>
                <option value="055">055</option>
                <option value="061">061</option>
                <option value="062">062</option>
                <option value="063">063</option>
                <option value="064">064</option>
                <option value="0502">0502</option>
                <option value="0503">0503</option>
                <option value="0505">0505</option>
                <option value="0506">0506</option>
                <option value="0507">0507</option>
                <option value="0508">0508</option>
                <option value="070">070</option>
              </select> - <input size="10px" type="text" name="tel2"> - <input size="10px" type="text" name="tel3">
            </td>
          </tr>
          <tr class="dot_line">
            <td class="fixed_join">휴대폰번호</td>
            <td><select name="hp1">
                <option>없음</option>
                <option selected="" value="010">010</option>
                <option value="011">011</option>
                <option value="016">016</option>
                <option value="017">017</option>
                <option value="018">018</option>
                <option value="019">019</option>
              </select> - <input size="10px" type="text" name="hp2"> - <input size="10px" type="text" name="hp3"><br> <br>
              <input type="checkbox" name="smssts_yn" value="Y" checked=""> 쇼핑몰에서 발송하는 SMS 소식을 수신합니다.</td>
          </tr>
          <tr class="dot_line">
            <td class="fixed_join">이메일<br>(e-mail)</td>
            <td><input size="10px" type="text" name="email1"> @ <input size="10px" type="text" name="email2">
              <select name="email2" onchange="" title="직접입력">
                <option value="non">직접입력</option>
                <option value="hanmail.net">hanmail.net</option>
                <option value="naver.com">naver.com</option>
                <option value="yahoo.co.kr">yahoo.co.kr</option>
                <option value="hotmail.com">hotmail.com</option>
                <option value="paran.com">paran.com</option>
                <option value="nate.com">nate.com</option>
                <option value="google.com">google.com</option>
                <option value="gmail.com">gmail.com</option>
                <option value="empal.com">empal.com</option>
                <option value="korea.com">korea.com</option>
                <option value="freechal.com">freechal.com</option>
              </select><br> <br> <input type="checkbox" name="emailsts_yn" value="Y" checked=""> 쇼핑몰에서 발송하는 e-mail을 수신합니다.</td>
          </tr>
          <tr class="dot_line">
            <td class="fixed_join">주소</td>
            <td>
              <input type="text" id="zipcode" name="zipcode" size="10">
              <a href="#">우편번호검색</a>
              <br>
              <p>
                기본주소:<br><input type="text" id="address" name="address" size="50"><br><br>
                나머지 주소:<input type="text" name="namujiAddress" size="50">
              </p>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
    <div class="clear">
      <br><br>
      <table align="center">
        <tbody>
          <tr>
            <td>
              <input type="submit" value="회원 가입">
              <input type="reset" value="다시입력">
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  </form>
</article>

<%@ include file="../_tail.jsp" %>
