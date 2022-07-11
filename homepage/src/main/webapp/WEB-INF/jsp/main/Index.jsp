<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>

<%@ include file="/WEB-INF/jsp/main/inc/Header.jsp" %>
    
    <section class="banner-area">
        <div class="banner-img"></div>
            <p>1인가구 <span>원/투룸 A to Z</span></p>
            <!-- <h1><span>샤방샤방</span>과 함께<br> 당신의 <span>생활을 만듭니다</span></h1> -->
        <h1 class="text"><span>샤방샤방</span>과 함께<br>당신의 <span>생활을 만듭니다</span></h1>
        
            <a href="/room/selectList.do" class="banner-btn">매물찾기</a>

        <div class="container">
            <div class="col">
                <div class="card card1">
                    <h3>제품구매</h3>
                    <p>(공동구매)가전제품 구매</p>
                </div>
                <div class="card card2">
                    <h3>기사호출</h3>
                    <p>인터넷, TV, 청소, 집수리 A/S</p>
                </div>
                <div class="card card3">
                    <h3>이사 정산</h3>
                    <p>한국전력공사, 이삿짐 센터 연결</p>
                </div>
                <!-- <div class="card card4">
                        <h3>건물 관리</h3>
                        <p>건물 관리 설명</p>
                    </div> -->
            </div>
        </div> 
    </section>    


    <section class="about-area" id="about">
        <h3 class="section-title">소개</h3>
        <ul class="about-content">
            <li class="about-left"></li>
            <li class="about-right">
                <h2>About our Company</h2>
                <p>샤방샤방은 세입자와 임대인 모두 선진적인 주거문화 정착을 위해 함께합니다.
                    세입자는 원하는 집을 임대인과 1:1로 연결하고 사는 동안 필요한 모든 생활을 함께하며
                    임대인은 매물 업로드부터 세입자 관리까지 한번에 관리할 수 있습니다.</p>
                <a href="#" class="about-btn">Learn more</a>
            </li>
        </ul>
    </section>

    <section class="services-area" id="services">
        <h3 class="section-title">Services</h3>
        <ul class="services-content">
            <li>
                <i class="fa-solid fa-people-roof"></i>
                <h4>임대차 관리</h4>
                <p>임대인은 자신의 방을 홍보하고, 임차인 내역을 관리합니다.</p>
                <p>임차인은 자신의 방을 알아보고, 생활에 필요한 것들을 해결합니다.</p>
            </li>
            <li>
                <i class="fa-solid fa-house"></i>
                <h4>건물관리</h4>
                <p>임대인과 임차인 모두 생활에 필요한 청소, 집수리 A/S, 빨래, 공동구매 등을<br> 해결합니다.</p>
            </li>
            <li>
                <i class="fa-solid fa-suitcase-rolling"></i>
                <h4>이사 정산</h4>
                <p>이사 시, 해당 날짜의 전기/가스/통신 등의 정산을 한번에 해결합니다.</p>
            </li>
        </ul>
    </section>

    <section class="contact-area" id="contact">
        <h3 class="section-title">Contact</h3>
        <ul class="contact-content">
            <li>
                <i class="fa fa-map-marker"></i>
                <p>[34516]대전광역시 동구 백룡로 11번길 8</p>
            </li>
            <li>
                <i class="fa fa-phone"></i>
                <p>010-4848-4848 <br> 010-4040-4040</p>
            </li>
            <li>
                <i class="fa fa-envelope"></i>
                <p>twinkle@naver.com
            </li>
        </ul>
    </section>

    <%@ include file="/WEB-INF/jsp/main/inc/Footer.jsp" %>



<div class="dim"></div>
<!-- 로그인 -->
<div class="layer-popup layer-login" style="display:none;">
	<header class="layer-header">
		<span class="logo">
			<span class="img-logo"> <img alt="" src='<c:url value="/asset/front/images/common/my_logo.png"/>'></span>
		</span>
		<button type="button" class="layer-close"><span>팝업 닫기</span></button>
	</header>
	<div class="layer-body">
		<form action="/login/actionLogin.do" id="frmLogin" name="frmLogin" method="post" onsubmit="return vali()">
			<input type="hidden" name="userSe" value="USR"/>
			<fieldset>
				<!-- <legend>로그인을 위한 아아디/비밀번호 입력</legend> -->
				<div class="ipt-row">
					<input type="text" id="loginId" name="id" placeholder="아이디" required="required">
				</div>
				<div class="ipt-row">
					<input type="password" id="loginPw" name="password" placeholder="비밀번호" required="required">
				</div>
				<button type="submit" class="btn-login"><span>로그인</span></button>
			</fieldset>
		</form>
	</div>
</div>

<script>
$(document).ready(function(){
	//로그인
	$(".login").click(function(){
		$(".dim, .layer-login").fadeIn();
		return false;
	});
	
	//레이어닫기
	$(".layer-close").click(function(){
		$(".dim, .layer-login").fadeOut();
		return false;
	});
});

function vali(){
	if(!$("#loginId").val()){
		alert("아이디를 입력해주세요.");
		$("#loginId").focus();
		return false;
	}
	
	if(!$("#loginPw").val()){
		alert("비밀번호를 입력해주세요.");
		$("#loginPw").focus();
		return false;
	}
}

<c:if test="${not empty loginMessage}">
	alert("${loginMessage}");
</c:if>

</script>
</body>
</html>