<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Product Information</h2>
<c:forEach var="product" items="${products}">
  <c:out value="${product.productId}"></c:out>
   <c:out value="${product.productName}"></c:out>
   <c:out value="${product.productCost}"></c:out>
</c:forEach>
</body>
</html>