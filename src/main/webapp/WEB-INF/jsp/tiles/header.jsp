<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<!-- 헤더 부분 -->
<header>
    <div class="hd_main">
        <%-- 고양이 대통령 로고를 담는 공간 --%>
        <div id="mainLogo" class="hd_logo">
            <img src="/img/template/Header_Logo.jpg">
        </div>

        <%-- 검색 --%>
        <div class="hd_search input-group">
            <input type="text" id="hd_searchText" class="form-control" placeholder="3만원 이상 구매 시, 무료배송">
            <div class="input-group-append">
                <button type="button" id="hd_searchBtn" class="btn" >
                    <i class="bi bi-search"></i>
                </button>
            </div>
        </div>

        <%-- 알람, 마이페이지, 장바구니 --%>
        <div class="hd_btns">
            <span class="dropdown hd_dropdown"> <%--onclick="location.href='/mypage/main'"--%>
                <button class="btn hd_btn">
                    <i class="bi bi-bell hd_btnIcon"></i>
                    <span class="dropdown-toggle hd_btnTitle">알 림</span>
                </button>
                <div class="dropdown-menu hd_dropdown hd_btnBody">
                    <%-- 비 로그인 시--%>
                    <div class="dropdown-item hd_btnTextEvent">
                        가입하고 고양이 장난감<br>
                        <b>주문하면 오늘 출발!</b>
                    </div>
                    <div class="dropdown-item hd_btnLogin BTN_goLogin">로그인</div><%--member/login--%>
                    <div class="dropdown-item hd_btnSignUp BTN_goSignUp">회원가입</div><%--member/agree--%>
                    <%--<div class="dropdown-divider"></div>--%>
                    <%-- 로그인시 --%>
                    <%--<div class="dropdown-item hd_btnText">로그아웃</div>--%>
                </div>
            </span>


            <span class="dropdown hd_dropdown">
                <button class="btn dropdown hd_btn"> <%--onclick="location.href='/mypage/main'"--%>
                    <i class="bi bi-person hd_btnIcon"></i>
                    <span class="dropdown-toggle hd_btnTitle">M Y</span>
                </button>
                <div class="dropdown-menu hd_dropdown hd_btnBody">
                    <div class="dropdown-item">최근 본</div>
                    <div class="dropdown-item">주문조회</div>
                    <div class="dropdown-item">배송취소</div>
                    <div class="dropdown-item">교환하기</div>
                    <div class="dropdown-item">반품하기</div>
                    <div class="dropdown-item">고객센터</div>
                    <div class="dropdown-divider"></div>
                    <div class="dropdown-item hd_btnTextEvent">
                        가입하고 고양이 장난감<br>
                        <b>주문하면 오늘 출발!</b>
                    </div>
                    <div class="dropdown-item hd_btnLogin BTN_goLogin">로그인</div>
                    <div class="dropdown-item hd_btnSignUp BTN_goSignUp">회원가입</div>
                </div>
            </span>

            <span class="dropdown hd_dropdown">
                <button class="btn dropdown hd_btn"> <%--onclick="location.href='/mypage/main'"--%>
                    <i class="bi bi-cart3 hd_btnIcon"></i>
                    <span class="dropdown-toggle hd_btnTitle">장바구니</span>
                </button>
                <div class="dropdown-menu hd_dropdown hd_btnBody">
                    <div class="dropdown-item">
                        장바구니에 담긴 상품이 없습니다
                    </div>
                </div>
            </span>
        </div>
    </div>
</header>


<%--
<c:if test="${empty user}">
    <a class="dropdown-item" href="/member/login">로그인</a></button>
    <a class="dropdown-item" href="/member/agree">회원가입</a></button>
</c:if>
<c:if test="${not empty user}">
    <a class="dropdown-item" href="/member/logout">로그아웃</a></button>
</c:if>
--%>


<%--
    <c:if test="${not empty user}">
    <a class="dropdown-item" href="/mypage/main">마이 페이지</a>
    <a class="dropdown-item" href="/mypage/add-pet">고양이 등록</a>
    <a class="dropdown-item" href="/">자주구매</a>
    <a class="dropdown-item" href="/">관심</a>
    <div class="dropdown-divider"></div>
    <a class="dropdown-item" href="/">최근 본</a>
    <a class="dropdown-item" href="/">주문조회</a>
    <a class="dropdown-item" href="/">배송취소</a>
    <a class="dropdown-item" href="/">교환하기</a>
    <a class="dropdown-item" href="/">반품하기</a>
    <a class="dropdown-item" href="/">구매후기</a>
    <a class="dropdown-item" href="/">고객센터</a>
    <div class="dropdown-divider"></div>
    <a class="dropdown-item" href="/">스티커</a>
    <a class="dropdown-item" href="/">보유현금</a>
    <div class="dropdown-divider"></div>
    <a class="dropdown-item" href="/member/logout">로그아웃</a></button>
</c:if>
--%>