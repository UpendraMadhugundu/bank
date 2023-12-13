<%@page import="java.util.List"%>
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

<%List<Bank> list =(List<Bank>) request.getAttribute("list"); %>
	
	<table border="2px solid black">
	
		<tr>
			
			<th>First Name</th>
			<th>Last Name</th>
			<th>Account No</th>
			<th>Account Type</th>
			<th>Branch Name</th>
			<th>IFSC Code</th>
			<th>Phone</th>
			<th>Email</th>
			<th>DOB</th>
			<th>Gender</th>
			<th>Password</th>
			<th>Address</th>
			<th>Area</th>
			<th>City</th>
			<th>Pincode</th>
			<th>State</th>
			<th>County</th>
		
		</tr>
		<% for(Bank bank: list){ %>
		<tr>

			<td><%= bank.getFirstName()%></td>
			<td><%= bank.getLastName()%></td>	
			<td><%= bank.getAccountNo()%></td>	
			<td><%= bank.getAccountType()%></td>
			<td><%= bank.getBranchName()%></td>
			<td><%= bank.getIfscCode()%></td>
			<td><%= bank.getPhone()%></td>
			<td><%= bank.getEmail()%></td>
			<td><%= bank.getDob()%></td>
			<td><%= bank.getGender()%></td>
			<td><%= bank.getPassword()%></td>
			<td><%= bank.getAddress()%></td>
			<td><%= bank.getArea()%></td>
			<td><%= bank.getCity()%></td>
			<td><%= bank.getPincode()%></td>
			<td><%= bank.getState()%></td>
			<td><%= bank.getCountry()%></td>										
			<td> <a href="update?id=<%=bank.getId()%>"><button>update</button></a></td>
			<td> <a href="delete?id=<%=bank.getId()%>"><button>delete</button></a></td>
			
		</tr>
		<% } %>
	
	</table>

</body>
</html>