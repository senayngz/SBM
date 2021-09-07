<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
.center {
  text-align: center;
  padding: 50px;
  
}
</style>
 <%@ include file="header.jsp" %> 
<title>Bilgilerim</title>
</head>
<body>
	<div class="center">	
	
	<form action="update" method="get">
	
	<h3>Kişisel Bilgiler:</h3>
	 <label>Adınız ve Soyadınız:</label>
   		 <input type="text"  name="fullName" value="${user.fullName}">
   		 
   		 <br>
   		 <br>
   		 
 	<label>Telefon Numarası:</label>
 		 <input type="text"  name="phoneNo" value="${user.phoneNo}">
 
		 <br>
   		 <br>
	 <label>TC Kimlik Numarası:</label>
   		 <input type="text"  name="TCKN" value="${user.TCKN}">
   		 
   		 <br>
   		 <br>
   	<h3>Araç Bilgileri:</h3>	 
 	<label>Araç Plakası:</label>
 		 <input type="text"  name="plateNo" value="${vehicle.plateNo}">
 
		 <br>
	   	 <br>
	   		 
 	<label>Model:</label>
 		 <input type="text"  name="model" value="${vehicle.model}">
 
		 <br>
   		 <br>
   <label>Marka:</label>
	 <input type="text"  name="brand" value="${vehicle.brand}">

		 <br>
 		 <br>
 		 
	 <label>Şasi Numarası:</label>
   		 <input type="text"  name="chassisNo" value="${vehicle.chassisNo}">
   		 
   		 <br>
   		 <br>
   		 
 	<label>Motor Numarası:</label>
 		 <input type="text"  name="engineNo" value="${vehicle.engineNo}">
 
		 <br>
   		 <br>   		 
	  		 
 	<label>Araç Tipi:</label>
 		 <input type="text"  name="vehicleType" value="${vehicle.vehicleType}">
 
		 <br>
   		 <br>
	 <label>Engelli Aracı mı?(Öyleyse 1 değilse 0 yazın.):</label>
   		 <input type="text"  name="disabled" value="${vehicle.disabled}">
   		 
   		 <br>
   		 <br>
   		 
 	<label>Araç Sınıfı(Otomobil, Kamyonet, Kamyon, Otobüs):</label>
 		 <input type="text"  name="vehicleGrade" value="${vehicle.vehicleGrade}">
 
		 <br>
   		 <br>  
   		 
   	 <label>Kullanım Amacı:</label>
   		 <input type="text"  name="intendedUse" value="${vehicle.intendedUse}">
   		 
   		 <br>
   		 <br>
   		 
 	<label>Şehir Numarası:</label>
 		 <input type="text"  name="provinceNo" value="${vehicle.provinceNo}">
 
		 <br>
   		 <br>   		 
	<h3>Risk Bilgisi:</h3>
		 <br>
   		 
 	<label>Basamak Sayısı:</label>
 		 <input type="text"  name="scaleNo" value="${riskInfo.scaleNo}">
 		 <br>
 		 <br>
 		 
	<input type="submit" value="Bilgilerimi Güncelle">
	</form>
	
	
	</div>
</body>
</html>