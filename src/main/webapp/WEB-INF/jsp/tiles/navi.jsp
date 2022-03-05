<%@ page pageEncoding="UTF-8" %>
<%-- 알림 메시지 --%>
<div class="hd_list4">
    <button type="button" disabled>
        365일 <img src="/img/template/Header_leaf.jpg"> <span>신선한 사료&간식</span> 유통기한 100% 책임제
    </button>
</div>


<%-- 카테고리 --%>
<div class="hd_list5">
    <div class="dropdown ctDropDown hd_category">
        <a href="/category/every">
            <i class="bi bi-justify"></i>
            <span>카테고리</span>
        </a>
        <div class="dropdown-menu ctDropMenu hd_catelist">
            <a class="dropdown-item" href="/category/list?cate=1100&order=time&cp=1">사료</a>
            <a class="dropdown-item" href="/category/list?cate=1200&order=time&cp=1">간식</a>
            <a class="dropdown-item" href="/category/list?cate=1300&order=time&cp=1">건강관리</a>
            <a class="dropdown-item" href="/category/list?cate=1400&order=time&cp=1">모래</a>
            <a class="dropdown-item" href="/category/list?cate=1500&order=time&cp=1">화장실/위생</a>
            <a class="dropdown-item" href="/category/list?cate=1600&order=time&cp=1">미용/목욕</a>
            <a class="dropdown-item" href="/category/list?cate=1700&order=time&cp=1">급식기/급수기</a>
            <a class="dropdown-item" href="/category/list?cate=1800&order=time&cp=1">스크래쳐/캣타워</a>
            <a class="dropdown-item" href="/category/list?cate=1900&order=time&cp=1">하우스</a>
            <a class="dropdown-item" href="/category/list?cate=2000&order=time&cp=1">이동장</a>
            <a class="dropdown-item" href="/category/list?cate=2100&order=time&cp=1">의류/액세서리</a>
            <a class="dropdown-item" href="/category/list?cate=2200&order=time&cp=1">목줄/가슴줄</a>
            <a class="dropdown-item" href="/category/list?cate=2300&order=time&cp=1">장난감</a>
            <a class="dropdown-item" href="/category/list?cate=2400&order=time&cp=1">생활/가전</a>
        </div>
    </div>
    <span class="hd_pdlist">
        <ul class="nav nav-tabs" role="tablist">
            <li class="nav-item"><a class="nav-link" href="/today's/list">오늘의딜</a></li>
            <li class="nav-item"><a class="nav-link" href="/best/list?cate=1000&order=best">랭킹</a></li>
            <li class="nav-item"><a class="nav-link" href="/recent/list?where=recent&order=time&cp=1">신상품</a></li>
            <li class="nav-item"><a class="nav-link" href="/planned/page">기획전</a></li>
            <li class="nav-item"><a class="nav-link" href="/knowHow/page">노하우</a></li>
            <li class="nav-item"><a class="nav-link" href="/sticker/list?cate=1000&order=time&cp=1">스티커샵</a></li>
        </ul>
    </span>
</div>
<br class="clear">