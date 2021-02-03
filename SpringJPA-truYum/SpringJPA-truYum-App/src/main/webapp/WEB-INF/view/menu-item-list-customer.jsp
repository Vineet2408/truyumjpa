<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Menu Item List</title>
<link rel="stylesheet" type="text/css" href="/style/style.css">
</head>
<body>
<header>
<div><div class="header-div1"><label class="header-label">truYum</label>
<img src="/images/truyumlogo.png" class="header-image"></div>
<div class="header-div2"><nav>
<ul class="header-nav">
<li><a href="/show-menu-list-customer" class="navlink">Menu</a></li>
<li><a href="/show-cart?userId=1" class="navlink">Cart</a></li>
</ul>
</nav></div></div>
</header>
<section>
<h2>Menu Items</h2>
<p class="msgdisplay"><c:if test="${addCartStatus}">Item added to Cart Successfully</c:if></p>

<table>
<tr><th><label>Name</label></th>
<th><label>Free Delivery</label></th>
<th><label>Price</label></th>
<th><label>Category</label></th>
<th><label>Action</label></th></tr>

<c:forEach var="menuItem" items="${menuItemListCustomer}">
<tr><td>${menuItem.name}</td>
<td><c:if test="${menuItem.freeDelivery=='Yes'}">Yes</c:if>
<c:if test="${menuItem.freeDelivery=='No'}">No</c:if></td>
<td>Rs. ${menuItem.price}</td>
<td>${menuItem.category}</td>
<td><a href="/add-to-cart?menuItemId=${menuItem.id}">Add to Cart</a></td></tr>
</c:forEach>

</table>

</section>
<footer>Copyright &copy; 2019</footer>
</body>
</html>