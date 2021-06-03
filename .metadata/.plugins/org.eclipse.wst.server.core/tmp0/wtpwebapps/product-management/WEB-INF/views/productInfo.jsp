<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    <%@ taglib prefix="test" uri="http://www.springframework.org/tags" %>  
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>${heading}</h2><br>
<form:form action="submit" method="post" modelAttribute="product">
<a href="?locale=en">English</a> | <a href="?locale=fr">French</a> | <a href="?locale=mr">Spanish</a> | <a href="?locale=it">Italian</a><br><br>

<table>

<tr>
<!-- <td>Product Id</td> -->
<td><test:message code="id"></test:message></td>
<td><form:input type="text"  name="productId" path="productId" ></form:input></td>
<td><form:errors path="productId"></form:errors></td>
</tr>

<tr>
<!-- <td>Product Name</td> -->
<td><test:message code="name"></test:message></td>
<td><form:input type="text"  name="productName" path="productName"></form:input></td>
<td><form:errors path="productName"></form:errors></td>
</tr>

<tr>
<!-- <td>Product Cost</td> -->
<td><test:message code="cost"></test:message></td>
<td><form:input type="text"  name="productCost" path="productCost"></form:input></td>
<td><form:errors path="productCost"></form:errors></td>
</tr>

<tr>
<td colspan="2" align="center"><input type="submit"  value="Insert Product"></td>
</tr>

</table>

</form:form>
</body>
</html>