<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type = "text/javascript">
	function validate() {
		if( document.myForm.store.value == "") {
			alert( "Please provide a Part")
			document.myForm.store.focus() ;
			return false;
		}
		return(true);
	}
</script>
</head>
<body>
	<form action = "editItemServlet" method = "post" name="myForm">
		Part: <input type = "text" name = "store" value = "${itemToEdit.part}">
		Price: <input type = "text" name = "item" value = "${itemToEdit.price}">
		<input type = "hidden" name = "id" value = "${itemToEdit.id}">
		<input type = "submit" value = "Save Edited Item">
	</form>
</body>
</html>