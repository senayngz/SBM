<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <%@ include file="header.jsp" %> 
<title>Kasko</title>
</head>
<body>
	<div class="container text-center">	
	
	<form action="kaskoPol" method="get">
	
	 <label for="tckn">TC Kimlik Numarası:</label>
   		 <input type="text" id="tckn" name="TCKN" placeholder="TCKN Giriniz">
   		 
   		 <br>
   		 <br>
   		 
 	<label for="plate">Araç Plakası</label>
 		 <input type="text" id="plate" name="plateNo" placeholder="Your address..">
 
		 <br>
   		 <br>
   		 
	
	<input type="submit" value="Kasko Sigortası Teklifi Al">
	</form>
	
	
	</div>

</body>
</html>