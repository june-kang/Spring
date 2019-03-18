<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_head.jsp" %>
<article>
  <table class="list_view">
    <tbody align="center">
      <tr style="background:#33ff00">
        <td class="fixed">구분</td>
        <td colspan="2" class="fixed">상품명</td>
        <td>정가</td>
        <td>판매가</td>
        <td>수량</td>
        <td>합계</td>
        <td>주문</td>
      </tr>
      <tr>
        <form name="frm_order_all_cart"></form>
        <td>
          <input type="checkbox" name="checked_goods" />
        </td>
        <td class="goods_image">
          <a href="#">
            <img width="75" alt="" src="/booktopia/goods/thumb_336.png">
          </a>
        </td>
        <td><h2><a href="#">짠테크 가계부</a></h2></td>
        <td class="price"><span>30000원</span></td>
        <td>
          <strong>27,000원(10%할인)</strong>
        </td>
        <td>
          <input type="text" id="cart_goods_qty" name="cart_goods_qty" size="3" value="1" /><br>
          <a href="#"><img width="25" alt="" src="/booktopia/img/btn_modify_qty.jpg"></a>
        </td>
        <td>
          <strong>27,000원</strong>
        </td>
        <td>
          <a href="#"><img width="75" alt="" src="/booktopia/img/btn_order.jpg"></a><br>
          <a href="#"><img width="75" alt="" src="/booktopia/img/btn_order_later.jpg"></a><br>
          <a href="#"><img width="75" alt="" src="/booktopia/img/btn_add_list.jpg"></a><br>
          <a href="#"><img width="75" alt="" src="/booktopia/img/btn_delete.jpg"></a>
        </td>
      </tr>
    </tbody>
  </table>
  <div class="clear"></div>
  <br>
  <br>
  <table width="80%" class="list_view" style="background:#cacaff">
    <tbody>
      <tr align="center" class="fixed">
        <td class="fixed">총 상품수</td>
        <td>총 상품금액</td>
        <td></td>
        <td>총 배송비</td>
        <td></td>
        <td>총 할인 금액 </td>
        <td></td>
        <td>최종 결제금액</td>
      </tr>
      <tr cellpadding="40" align="center">
        <td id="">
          <p id="p_totalGoodsNum">1개 </p>
        </td>
        <td>
          <p id="p_totalGoodsPrice">27,000원</p>
        </td>
        <td>
          <img width="25" alt="" src="/booktopia/img/plus.jpg">
        </td>
        <td>
          <p id="p_totalDeliveryPrice">0원</p>
        </td>
        <td>
          <img width="25" alt="" src="/booktopia/img/minus.jpg">
        </td>
        <td>
          <p id="p_totalSalesPrice">0원</p>
        </td>
        <td>
          <img width="25" alt="" src="/booktopia/img/equal.jpg">
        </td>
        <td>
          <p id="p_final_totalPrice">27,000원</p>
        </td>
      </tr>
    </tbody>
  </table>
  <center>
    <br><br>
    <a href="#"><img width="75" alt="" src="/booktopia/img/btn_order_final.jpg"></a>
    <a href="#"><img width="75" alt="" src="/booktopia/img/btn_shoping_continue.jpg"></a>
    <center></center>
  </center>
</article>
<%@ include file="../_tail.jsp" %>