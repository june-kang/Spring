<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<c:set var="ctxPath" value="${pageContext.request.contextPath}" />
<html>
  <head>
    <meta charset="utf-8">
    <title>냉장고 아이디어스</title>
    <link href="${ctxPath }/css/style.css" rel="stylesheet" type="text/css" media="screen">
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="${ctxPath }/js/login_form.js"></script>
  <body>
    <div id="wrapper">
      <header>
        <p>
          <a href="${ctxPath }/member/myrecipe"><img src="${ctxPath }/img/writing.png" title="글쓰기" alt="글쓰기" /></a>
          <c:if test="${memberVO == null }">
          <a href="${ctxPath }/member/terms"><img src="${ctxPath }/img/register.png" title="회원가입" alt="회원가입" /></a>
          <a href="#"><img id="login_btn" src="${ctxPath }/img/login.png" title="로그인" alt="로그인" /></a>
          </c:if>
          <c:if test="${memberVO != null }">
          <a href="${ctxPath }/member/logout"><img src="${ctxPath }/img/logout.png" title="로그아웃" alt="로그아웃"></a>
          </c:if>
          <a href="${ctxPath }/"><img src="${ctxPath }/img/home.png" title="홈" alt="홈" /></a>
        </p>
        <a href="${ctxPath }/"><img src="${ctxPath }/img/logo.png" alt="로고"></a>
        <ul class="gnb">
          <li><a href="${ctxPath }/search">Search</a></li>
          <li><a href="${ctxPath }/recipe?cate=Beginner">Recipe</a></li>
          <li><a href="${ctxPath }/tips/usingtools">Tips</a></li>
          <li><a href="${ctxPath }/community/commu_list">Community</a></li>
          <li><a href="${ctxPath }/notice/notice">Notice</a></li>
          <li><a href="${ctxPath }/member/mypage">My page</a></li>
        </ul>
      </header>