<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="FDF5E6">
	<h1 align="center">A Sample Form</h1>
	<form action="DoOrder" method="post">
		Item Number: <input type="text" name="itemnum"><br>
		Description: <input type="text" name="description"><br>
		Price Each: <input type="text" name="price"><br>
		<hr>
		First Name: <input type="text" name="firstname"><br>
		Last Name: <input type="text" name="lastname"><br>
		Middle Name: <input type="text" name="midname"><br>
		Shipping Address: <textarea name="address" rows="3" cols="40"></textarea><br>
		Credit Card: <br>
		<input type="radio" name="card" value="visa"/>Visa<br>
		<input type="radio" name="card" value="mastercard"/>MasterCard<br>
		<input type="radio" name="card" value="americanexpress"/>American Express<br>
		<input type="radio" name="card" value="discover"/>Discover<br>
		<input type="radio" name="card" value="javasmartcard"/>Java SmartCard<br>
		Credit Card Number: <input type="password" name="cardnum"><br>
		Repeat Credit Card Number: <input type="password" name="recardnum"><br>
		<input type="submit" style="position: absolute; right: 0;" value="Submit Order">
	</form>
</body>
</html>