<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
.center {
  text-align: center;
  padding: 50px;
  
}
.error{
		color: red;
		font-style: italic;
	}
</style>
 <%@ include file="header.jsp" %> 
<title>Kasko</title>
</head>
<body>
	<div class="center">	
	
	<label class="error"> ${message}</label>	
	
	
	<form action="kaskoPol" method="get">
	
	 <label for="tckn">TC Kimlik Numarası:</label>
   		 <input type="text"  name="TCKN" placeholder="TCKN Giriniz">
   		 
   		 <br>
   		 <br>
   		 
 	<label for="plate">Araç Plakası:</label>
 		 <input type="text"  name="plateNo" placeholder="Araç plakası..">
 
		 <br>
   		 <br>
   		 
	
	<input type="submit" value="Kasko Sigortası Teklifi Al">
	</form>
	
	
	</div>

</body>
</html>