<%@ page contentType="text/html; charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="ko-KR">
<head>
<title>음성인식 회원관리 기능(개발자-천세진)</title>
<meta name="viewport" content="initial-scale=1.1, width=device-width" />
<meta >
<script src="/css&js/js/speech.js"></script>
<link rel="stylesheet" href="/css&js/css/speech.css" />
</head>
<body class="body">
 <c:if test="${param.memberReg == 'yes'}">
	 <!-- 로그인(회원가입 완료시 이용가능) -->
	 <form class="speechFrm" name="speechLoginFrm">
		<div class="speech_wrapper login_wrapper">
			<fieldset class="fieldset">
				<legend class="legend">로그인(login)</legend>
				<label for="login_label">아이디(id)</label>
				<input type="text" name="login_id" class="login_id"> 
				
				<label for="login_label">암호(pw)</label>
				<input type="password" name="login_pw" class="login_pw">
			    <button class="login_btn" onclick="memberFunction('login');">로그인</button>
			</fieldset>
		 </div>
	 </form>
</c:if>

 <c:if test="${param.memberReg == 'no'}">
	 <!-- 회원가입(로그인 완료시 이용가능) -->
	 <form class="speecMemberhFrm" name="speechMemberFrm">
		 <div class="speech_wrapper memberReg_wrapper">
			<fieldset class="fieldset">
				<legend class="legend">회원가입(MemberRegister)</legend>
				<label for="login_label">아이디(id)</label><input type="text" name="member_id" class="member_id"> 
				<label for="login_label">암호(pw)</label><input type="password" name="member_pw" class="member_pw">
			    <button class="memberReg_btn" onclick="memberFunction('member');">회원가입</button>
			</fieldset>
		 </div>
	 </form>
</c:if>    
     
     <div class="testRecognition"></div>
</body>
</html>
