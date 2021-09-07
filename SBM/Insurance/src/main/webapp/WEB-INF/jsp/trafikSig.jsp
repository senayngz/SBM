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
</style>
 <%@ include file="header.jsp" %> 
<title>Trafik Sigortası</title>
</head>
<body>

	<div class="center">	
	
	<form action="trafikSigPol" method="get">
	
	 <label for="tckn">TC Kimlik Numarası:</label>
   		 <input type="text" name="TCKN" placeholder="TCKN Giriniz">
   		 
   		 <br>
   		 <br>
   		 
 	<label for="plate">Araç Plakası:</label>
 		 <input type="text" name="plateNo" placeholder="Araç plakası..">
	
		 <br>
   		 <br>
   		 
	
	<input type="submit" value="Trafik Sigortası Teklifi Al">
	</form>
	
	
	</div>

</body>
</html>