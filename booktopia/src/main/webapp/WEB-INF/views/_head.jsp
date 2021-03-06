<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%--컨텍스트 루트 패스 전역설정 --%>
<c:set var="ctxPath" value="${pageContext.request.contextPath}" />
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width">
  <link href="${ctxPath}/css/style.css" rel="stylesheet" type="text/css" media="screen">
  <link href="${ctxPath}/css/basic-jquery-slider.css" rel="stylesheet" type="text/css" media="screen">
  <link href="${ctxPath}/css/mobile.css" rel="stylesheet" type="text/css">
  <script src="${ctxPath}/js/jquery-1.6.2.min.js" type="text/javascript"></script>
  <script src="${ctxPath}/js/jquery.easing.1.3.js" type="text/javascript"></script>
  <script src="${ctxPath}/js/stickysidebar.jquery.js" type="text/javascript"></script>
  <script src="${ctxPath}/js/basic-jquery-slider.js" type="text/javascript"></script>
  <script src="${ctxPath}/js/tabs.js" type="text/javascript"></script>
  <script src="${ctxPath}/js/carousel.js" type="text/javascript"></script>
  <script>
  	$(function(){
  		var input = $('input[name=searchWord]');
  		
  		input.keyup(function(){
  			
  			
  			var value = input.val();
  			if(value == ''){
  				$('#suggest').hide();
  				return false;
  			}
  			
  			$.ajax({
  				type:"get",
  				async : true, // false인 경우 동기식으로 처리한다.
  				url : "${ctxPath}/shop/keywordAutoComplete",
  				data : {keyword:value},
  				success : function(data){
  					
  					if(data.keyword.length > 0){
  						$('#suggestList').children().remove();
  						$('#suggest').show();
  						html = '';
  						
  						for(var i in data.keyword){
  							html += "<a href='${ctxPath}/shop/search?searchWord="+data.keyword[i]+"'>"+data.keyword[i]+"</a>";
  						}
  						$('#suggestList').append(html);
  						
  					} else{
  						$('#suggest').hide();
  						$('#suggestList').children().remove();
  					}
  				}
  					
  				
  			}); // end ajax
  		});
  		
  	});
  
  </script>

  <title>북토피아::메인</title>
</head>
<body>
  <div id="outer_wrap">
    <div id="wrap">
      <header>
        <div id="logo">
          <a href="${ctxPath}/index"><img width="176" height="80" alt="booktopia" src="${ctxPath}/img/Booktopia_Logo.jpg"></a>
        </div>
        <div id="head_link">
          <ul>
          	<c:if test="${sessionScope.memberVO==null }">
            <li><a href="${ctxPath}/member/login">로그인</a></li>
            <li><a href="${ctxPath}/member/register">회원가입</a></li>
            </c:if>
            <c:if test="${sessionScope.memberVO != null }">
            <li><a href="${ctxPath}/member/logout">로그아웃</a></li>
            <li><a href="${ctxPath}/shop/cart">장바구니</a></li>
            </c:if>
            <c:if test="${memberVO.member_id eq 'admin' }" >
            <li><a href="${ctxPath }/admin">관리자페이지</a></li>
            </c:if>
            <li><a href="#">고객센터</a></li>
          </ul>
        </div>
        <br>
        <div id="search">
          <form name="frmSearch" action="${ctxPath }/shop/search" autocomplete="off">
			<input name="searchWord" class="main_input" type="text" />
            <input type="submit" name="search" class="btn1" value="검 색">
          </form>
          <div id="suggest">
          	<div id="suggestList"></div>
        	</div>
        </div>
        
      
      
      </header>
      <div class="clear"></div>
      <aside>
        <nav>
          <ul>
            <li>
              <h3>국내외 도서</h3>
              <ul>
                <li><a href="#">IT/인터넷</a></li>
                <li><a href="#">경제/경영</a></li>
                <li><a href="#">대학교재</a></li>
                <li><a href="#">자기계발</a></li>
                <li><a href="#">자연과학/공학</a></li>
                <li><a href="#">역사/인문학</a></li>
              </ul>
            </li>
            <li>
              <h3>음반</h3>
              <ul>
                <li><a href="#">가요</a></li>
                <li><a href="#">록</a></li>
                <li><a href="#">클래식</a></li>
                <li><a href="#">뉴에이지</a></li>
                <li><a href="#">재즈</a></li>
                <li><a href="#">기타</a></li>
              </ul>
            </li>

          </ul>
        </nav>
        <div class="clear"></div>
        <div id="banner">
          <a href="#"><img width="190" height="163" src="${ctxPath}/img/n-pay.jpg"> </a>
        </div>
        <div id="notice">
          <h2>공지사항</h2>
          <ul>
            <li><a href="#">공지사항입니다.1</a></li>
            <li><a href="#">공지사항입니다.2</a></li>
            <li><a href="#">공지사항입니다.3</a></li>
            <li><a href="#">공지사항입니다.4</a></li>
            <li><a href="#">공지사항입니다.5</a></li>
          </ul>
        </div>
        <div id="banner">
          <a href="#"><img width="190" height="362" src="${ctxPath}/img/side_banner1.jpg"></a>
        </div>
        <div id="banner">
          <a href="#"><img width="190" height="104" src="${ctxPath}/img/call_center_logo.jpg"></a>
        </div>
        <div id="banner">
          <a href="#"><img width="190" height="69" src="${ctxPath}/img/QnA_logo.jpg"></a>
        </div>
      </aside>