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
<title>Profile</title>
</head>
<body>
	<div class="center">	
	

	
	<form action="enroll" method="get">
	
	<h3>Kişisel Bilgiler:</h3>
	 <label>Adınız ve Soyadınız:</label>
   		 <input type="text"  name="fullName" placeholder="Ad ve Soyad...">
   		 
   		 <br>
   		 <br>
   		 
 	<label>Telefon Numarası:</label>
 		 <input type="text"  name="phoneNo" placeholder="Telefon Numarası...">
 
		 <br>
   		 <br>
	 <label>TC Kimlik Numarası:</label>
   		 <input type="text"  name="TCKN" placeholder="TCKN...">
   		 
   		 <br>
   		 <br>
   	<h3>Araç Bilgileri:</h3>	 
 	<label>Araç Plakası:</label>
 		 <input type="text"  name="plateNo" placeholder="Araç plakası..">
 
		 <br>
	   	 <br>
	   		 
 	<label>Model:</label>
 		 <input type="text"  name="model" placeholder="Model...">
 
		 <br>
   		 <br>
   <label>Marka:</label>
	 <input type="text"  name="brand" placeholder="Marka...">

		 <br>
 		 <br>
 		 
	 <label>Şasi Numarası:</label>
   		 <input type="text"  name="chassisNo" placeholder="Şasi Numarası...">
   		 
   		 <br>
   		 <br>
   		 
 	<label>Motor Numarası:</label>
 		 <input type="text"  name="engineNo" placeholder="Motor Numarası...">
 
		 <br>
   		 <br>   		 
	  		 
 	<label>Araç Tipi:</label>
 		 <input type="text"  name="vehicleType" placeholder="Araç Tipi...">
 
		 <br>
   		 <br>
	 <label>Engelli Aracı mı?(Öyleyse 1 değilse 0 yazın.):</label>
   		 <input type="text"  name="disabled" placeholder="...">
   		 
   		 <br>
   		 <br>
   		 
 	<label>Araç Sınıfı(Otomobil, Kamyonet, Kamyon, Otobüs):</label>
 		 <input type="text"  name="vehicleGrade" placeholder="Araç Sınıfı...">
 
		 <br>
   		 <br>  
   		 
   	 <label>Kullanım Amacı:</label>
   		 <input type="text"  name="intendedUse" placeholder="Kullanım Amacı...">
   		 
   		 <br>
   		 <br>
   		 
 	<label>Şehir Numarası:</label>
 		 <input type="text"  name="provinceNo" placeholder="Şehir Numarası...">
 
		 <br>
   		 <br>   		 
	<h3>Risk Bilgisi:</h3>
		 <br>
   		 
 	<label>Basamak Sayısı:</label>
 		 <input type="text"  name="scaleNo" placeholder="Basamak Sayısı...">
 		 <br>
 		 <br>
 		 
	<input type="submit" value="Bilgileri Kaydet">
	</form>
	
	
	</div>
</body>
</html>