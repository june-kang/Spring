<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_head.jsp"%>
<script>
	var loginResult = "${result}";
	
	if(loginResult == 'fail'){
		alert('로그인에 실패했습니다.\n 아이디와 비밀번호를 다시 확인하시기 바랍니다.');
	}
</script>
      <article>
        <h3>회원 로그인 창</h3>
        <div id="detail_table">
          <form action="/booktopia/member/login" method="post">
            <table>
              <tbody>
                <tr class="dot_line">
                  <td class="fixed_join">아이디</td>
                  <td><input name="member_id" type="text" size="20"></td>
                </tr>
                <tr class="solid_line">
                  <td class="fixed_join">비밀번호</td>
                  <td><input name="member_pw" type="password" size="20"></td>
                </tr>
              </tbody>
            </table>
            <br><br>
            <input type="submit" value="로그인">
            <input type="reset" value="초기화">
            <br><br>
            <a href="#">아이디 찾기</a> |
            <a href="#">비밀번호 찾기</a> |
            <a href="{ctxPath}/member/register">회원가입</a> |
            <a href="#">고객 센터</a>
          </form>
        </div>
      </article>

<%@ include file="../_tail.jsp"%>