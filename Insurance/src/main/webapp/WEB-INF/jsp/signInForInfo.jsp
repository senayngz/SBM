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
<title>TCKN</title>
</head>
<body>
	<div class="center">	
	
	<label class="error"> ${message}	</label>
	
	<form action="information" method="post">
	
	 <label for="tckn">Bilgilerini görüntülemek istediğiniz kişinin TC Kimlik Numarasını Giriniz:</label>
	 <br>
	 <br>
   		 <input type="text"  name="TCKN" placeholder="TCKN Giriniz...">
   		 
    <br>
    <br>
   		 
	
	<input type="submit" value="Bilgileri Görüntüle">
	</form>
	
	
	</div>
</body>
</html>