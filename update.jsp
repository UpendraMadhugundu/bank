<%@page import="Bank.dto.Bank"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%Bank bank =(Bank) request.getAttribute("bank"); %>

	<form action="edit">
	
	<h2>Account Details</h2>
	<b>Id :</b><input type="number" name="id" value="<%=bank.getId() %>" readonly="true">
	<b>First Name :</b><input type="text" name="firstName" value="<%=bank.getFirstName() %>">
	<b>Last Name :</b><input type="text" name="lastName" value="<%= bank.getLastName()%>">
	<b>Account No :</b><input type="number" name="accountno" value="<%= bank.getAccountNo()%>" readonly="true">
	<b>Account Type</b><input type="text" name="account type" value="<%= bank.getAccountType()%>">
	<b>Branch Name :</b><input type="text" name="branchName" value="<%= bank.getBranchName()%>">
	<b>IFSC Code :</b><input type="text" name="ifsc code" value="<%= bank.getIfscCode()%>" readonly="true">
	
	<h2>Personal Details</h2>
	
	<b>Phone No :</b><input type="tel" name="phoneno" value="<%= bank.getPhone()%>">
	<b>Email :</b><input type="text" name="email" value="<%= bank.getEmail()%>" readonly="true">
	<b>DOB :</b><input type="date" name="dob" value="<%= bank.getDob()%>">
	<b>Gender :</b><input type="text" name="gender" value="<%= bank.getGender()%>">
	<b>Password :</b><input type="password" name="password" value="<%= bank.getPassword()%>">
	
	<h2>Address Details</h2> 
	
	<b>Address :</b><input type="text" name="address" value="<%= bank.getAddress()%>">
	<b>Area :</b><input type="text" name="area" value="<%= bank.getArea()%>">
	<b>City :</b><input type="text" name="city" value="<%= bank.getCity()%>">
	<b>Pincode :</b><input type="number" name="pincode" value="<%= bank.getPincode()%>">
	<b>State :</b><input type="text" name="state" value="<%= bank.getState()%>">
	<b>Country :</b><input type="text" name="country" value="<%= bank.getCountry()%>">
	<br>
	<br>
	<button>update</button>
	
	</form>

</body>
</html>