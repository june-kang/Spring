<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_head.jsp" %>
<article>
   <h1>최근주문내역<a href="#"><img src="/booktopia/img/btn_more_see.jpg"></a></h1>
   <table class="list_view">
     <tbody align="center">
       <tr style="background:#33ff00">
          <td>주문번호</td>
          <td>주문일자</td>
          <td>주문상품</td>
          <td>주문상태</td>
          <td>주문취소</td>
        </tr>
        <tr>
          <td colspan="5" class="fixed">
            <strong>주문한 상품이 없습니다.</strong>
          </td>
        </tr>
      </tbody>
    </table>
    <br><br><br>
    <h1>계좌내역<a href="#"><img src="/booktopia/img/btn_more_see.jpg"></a></h1>
    <table border="0" width="100%" cellpadding="10" cellspacing="10">
      <tbody>
        <tr>
          <td>예치금 &nbsp;&nbsp; <strong>10000원</strong></td>
          <td>쇼핑머니 &nbsp;&nbsp; <strong>9000원</strong></td>
        </tr>
        <tr>
          <td>쿠폰 &nbsp;&nbsp; <strong>6000원</strong></td>
          <td>포인트 &nbsp;&nbsp; <strong>2000원</strong></td>
        </tr>
        <tr>
          <td>상품권 &nbsp;&nbsp; <strong>4000원</strong></td>
          <td>디지털머니 &nbsp;&nbsp; <strong>9000원</strong></td>
        </tr>
      </tbody>
    </table>
    <br><br><br>
    <h1>나의 정보<a href="#"><img src="/booktopia/img/btn_more_see.jpg"></a></h1>
    <table border="0" width="100%" cellpadding="10" cellspacing="10">
      <tbody>
        <tr>
          <td>이메일:</td>
          <td><strong>hong@test.com</strong></td>
        </tr>
        <tr>
          <td>전화번호</td>
          <td><strong>010-1111-2222</strong></td>
        </tr>
        <tr>
          <td>주소</td>
          <td><strong>서울 강남구 강남대로 298 (역삼동)</strong></td>
        </tr>
      </tbody>
    </table>
  </article>
<%@ include file="../_tail.jsp" %>
