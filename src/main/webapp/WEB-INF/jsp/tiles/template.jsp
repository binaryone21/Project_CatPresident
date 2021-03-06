<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>고양이 대통령</title>

    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
    <link rel="stylesheet" href="/css/basic.css">
    <link rel="stylesheet" href="/css/layout/header.css">
    <link rel="stylesheet" href="/css/layout/navi.css">



    <link rel="stylesheet" href="/css/template/footer.css">
    <link rel="stylesheet" href="/css/register.css">
    <link rel="stylesheet" href="/css/category.css">
    <link rel="stylesheet" href="/css/products.css">
    <link rel="stylesheet" href="/css/board.css">

    <link rel="stylesheet" href="/css/mypage.css">
    <link rel="stylesheet" href="/css/orderview.css">
    <link rel="stylesheet" href="/css/order.css">

    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="/js/bootstrap.bundle.min.js"></script>
    <script src="/js/layout/header.js" defer></script>
</head>
<body>
    <div>

        <tiles:insertAttribute name="header"/>
        <tiles:insertAttribute name="navi"/>

        <tiles:insertAttribute name="main"/>

        <tiles:insertAttribute name="footer"/>

    </div>
    <script src="/js/product.js"></script>
    <script src="/js/register.js"></script>

    <script src="/js/mypage.js"></script>
    <script src="/js/planKnow.js"></script>
    <script src="/js/order.js"></script>
</body>
</html>
