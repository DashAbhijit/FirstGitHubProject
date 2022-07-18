<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>report On Last Month OrderDetails For a Specific Product</h2>
		<form action="./allproductInTable">
			<label>Product Name:</label>
			<select name="prodId">
                  <option value="0">--select--</option>
                  <c:forEach items="${productList}" var="prod">
                      <option value="${prod.prodId}">${prod.prodName}</option>
                  </c:forEach>
              </select>
              
              <div>
			<input type="submit" value="Fetch orders">
		</div>
		</form>
	</div>
	<center><h3>All Order Details</h3></center>
	<table border="1" align="center">
		<thead>
			<tr>
				<th>Sl.#</th>
				<th>Product Name</th>
				<th>Order Date</th>
				<th>Order Qty</th>
				<th>Order Value(ruppees)</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ordertableList}" varStatus="count" var="order" > 
				<tr>
					<td>${count.count}</td>
					<td>${order.prodName}</td>
					<td>${order.orderDate }</td>
					<td>${order.orderQty }</td>
					<td>${order.orderValue }</td>
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
	
	
</body>
</html>