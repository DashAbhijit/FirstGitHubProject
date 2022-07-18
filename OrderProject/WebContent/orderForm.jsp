<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Form</title>
</head>
<body>

	<div align="center">
		<h2>Order Details During Date Interval Report</h2>
	
	<form action="./orderDetails">
		<div>
			<label>Date Between</label> <input type="date" name="fDate">
			<label>and</label> <input type="date" name="sDate">
		</div>
		<div>
			<input type="submit" value="Fetch orders">
		</div>
	</form>
	</div>


	<div align="center">
		<h4>Order-Product Details</h4>
	 <table border="1" >
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
	</div>
	
	<button><a href="./ordersByName">GetAllOrderById</a></button>


</body>
</html>