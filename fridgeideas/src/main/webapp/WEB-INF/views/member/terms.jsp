<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_head.jsp" %>
<div id="terms">
  <div>
    <img src="${ctxPath }/img/bu01.gif" alt="1.약관동의">
    <img src="${ctxPath }/img/bu02_.gif" alt="2.정보입력">
  </div>
  <div>
    <img src="${ctxPath }/img/login_agree.jpg" alt="이용약관동의">
    </div>
	<section>
		<table>
			<caption>사이트 이용약관</caption>
			<tr>
				<td>
					<textarea readonly></textarea>
					<div>
						<label><input type="checkbox" name="chk1" />&nbsp;동의합니다.</label>
					</div>
				</td>
			</tr>
		</table>
	</section>
	<section>
		<table>
			<caption>개인정보 취급방침</caption>
			<tr>
				<td>
					<textarea readonly></textarea>
					<div>
						<label><input type="checkbox" name="chk2" />&nbsp;동의합니다.</label>
					</div>
				</td>
			</tr>
		</table>
	</section>
	<div id="btn">
      <a href="${ctxPath }/index"><input type="button" class="cancel"></a>
      <a href="${ctxPath }/member/register"><input type="button" class="next"></a>
	</div>
</div>
<%@ include file="../_tail.jsp" %>