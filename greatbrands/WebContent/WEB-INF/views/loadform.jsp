<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

	<head>

			<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

			<title>Brand Form</title>

	</head>


	<body>

			<form action="/greatbrands/loadbrandform" modelAttribute = "dbform" action = "post">
			
			<table>
			
				<tr>
				
					<td> Enter Brand Id : </td>
					<td> <input type = "text" name = "BrandId"> </td>
					
				</tr>
				
				<tr>
				
					<td> Enter Brand Name : </td>
					<td> <input type = "text" name = "BrandName"> </td>
				
				</tr>
				
				<tr>
				
					<td> Enter Founded Year : </td>
					<td> <input type = "text" name = "FoundedYear"> </td>
				
				</tr>	
									
				<tr>
				
					<td> Enter Origin Country : </td>
					<td> <input type = "text" name = "OriginCountry"> </td>
				
				</tr>
			
				<tr>
				
					<td> Enter Brand Ambassador : </td>
					<td> <input type = "text" name = "Ambassador"> </td>
				
				</tr>
			
				<tr>
				
					<td> <input type = "submit" value = "Include Brand"> </td>
				
				</tr>	
			
			</table>
			
	</form>

</body>




</html>