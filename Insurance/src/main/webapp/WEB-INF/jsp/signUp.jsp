<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
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
<title>Profile</title>
</head>
<body>
	<div class="center">
	
	<label class="error"> ${message}</label>
	
	<form:form action="enroll" method="post" modelAttribute="register">
	
	<h3>Kişisel Bilgiler:</h3>
	 <label>Adınız ve Soyadınız:</label>
   		 <form:input type="text" path="fullName" placeholder="Ad ve Soyad..."/>
   		 <br>
   		 <form:errors  path="fullName" cssClass="error"/>
   		 
   		 <br>
   		 <br>
   		 
 	<label>Telefon Numarası:</label>
 		 <form:input type="text"  path="phoneNo" placeholder="Telefon Numarası..."/>
 		 <br>
 		 <form:errors  path="phoneNo" cssClass="error"/>
 		 
		 <br>
   		 <br>
	 <label>TC Kimlik Numarası:</label>
   		 <form:input type="text"  path="TCKN" placeholder="TCKN..."/>
   		 <form:errors  path="TCKN" cssClass="error"/>
   		 
   		 <br>
   		 <br>
   		 
   	<h3>Araç Bilgileri:</h3>	 
 	<label>Araç Plakası:</label>
 		 <form:input type="text" id="plateNo" path="plateNo" placeholder="Araç plakası.."/>
 		 <br>
 		 <form:errors  path="plateNo" cssClass="error"/>
 		 
		 <br>
	   	 <br>
	   		 
 	<label>Model:</label>
 		 <form:select path="model" >
			  <form:option value="2021">2021</form:option>
			  <form:option value="2020">2020</form:option>
			  <form:option value="2019">2019</form:option>
			  <form:option value="2019">2018</form:option>
			  <form:option value="2017">2017</form:option>
			  <form:option value="2016">2016</form:option>
			  <form:option value="2015">2015</form:option>
			  <form:option value="2014">2014</form:option>
			  <form:option value="2013">2013</form:option>
			  <form:option value="2012">2012</form:option>
			  <form:option value="2011">2011</form:option>
			  <form:option value="2010">2010</form:option>
			  <form:option value="2009">2009</form:option>
			  <form:option value="2008">2008</form:option>
			  <form:option value="2007">2007</form:option>
			  <form:option value="2006">2006</form:option>
			  <form:option value="2005">2005</form:option>
			  <form:option value="2004">2004</form:option>
			  <form:option value="2003">2003</form:option>
			  <form:option value="2002">2002</form:option>
			  <form:option value="2001">2001</form:option>
			  <form:option value="2000">2000</form:option>

		</form:select>
		<br>
  		 <form:errors  path="model" cssClass="error"/>
 
		 <br>
   		 <br>
   <label>Marka:</label>
	 <form:select path="brand" >
			  <form:option value="Skoda">Skoda</form:option>
			  <form:option value="Renault">Renault</form:option>
			  <form:option value="Mercedes">Mercedes</form:option>
			  <form:option value="Audi">Audi</form:option>
			  <form:option value="BMW">BMW</form:option>
			  <form:option value="Fiat">Fiat</form:option>			  		  
		</form:select>
		<br>
 		 <form:errors  path="brand" cssClass="error"/>

		 <br>
 		 <br>
 		 
	 <label>Şasi Numarası:</label>
   		 <form:input type="text"  path="chassisNo" placeholder="Şasi Numarası..."/>
   		 <br>
   		  <form:errors  path="chassisNo" cssClass="error"/>
   		 
   		 <br>
   		 <br>
   		 
 	<label>Motor Numarası:</label>
 		 <form:input type="text"  path="engineNo" placeholder="Motor Numarası..."/>
 		 <br>
  		 <form:errors  path="engineNo" cssClass="error"/>
 
		 <br>
   		 <br>   		 
	  		 
	 <label>Engelli Aracı mı?:</label>
   		 <form:select path="disabled" >
			  <form:option value="1">1</form:option>
			  <form:option value="0">0</form:option>			  		  
			  			  		  
		</form:select>
		<br>
		<form:errors  path="disabled" cssClass="error"/>
		
   		 
   		 <br>
   		 <br>
   		 
 	<label>Araç Sınıfı:</label>
 		 <form:select path="vehicleGrade" >
			  <form:option value="Otomobil">Otomobil</form:option>	
			  <form:option value="Kamyon">Kamyon</form:option>	
			  <form:option value="Otobüs">Otobüs</form:option>			  		  
			  <form:option value="Kamyonet">Kamyonet</form:option>			  		  
		</form:select>
		<br>
 		<form:errors  path="vehicleGrade" cssClass="error"/>
 	
		 <br>
   		 <br>  
   		 
   	 <label>Kullanım Amacı:</label>
   		 <form:select path="intendedUse" >
			  <form:option value="Hususi Kullanım">Hususi Kullanım</form:option>	
			  <form:option value="Taşımacılık">Taşımacılık</form:option>	
			  <form:option value="Çekme ve Kurtarma">Çekme ve Kurtarma</form:option>			  		  
		</form:select>
		<br>
 		<form:errors  path="intendedUse" cssClass="error"/>	
   		 
   		 <br>
   		 <br>
   		 
 	<label>Şehir Numarası:</label>
   		 <form:select path="provinceNo" >
			  <form:option value="34">34</form:option>	
			  <form:option value="33">33</form:option>	
			  <form:option value="32">32</form:option>			  		  
		</form:select>
		<br>
 		<form:errors  path="provinceNo" cssClass="error"/>
 
		 <br>
   		 <br>   		 
	<h3>Risk Bilgisi:</h3>
		 <br>
   		 
 	<label>Basamak Sayısı:</label>
 		 <form:select path="scaleNo" >
			  <form:option value="1">1</form:option>	
			 <form:option value="2">2</form:option>
			 <form:option value="3">3</form:option>
			 <form:option value="4">4</form:option>
			 <form:option value="5">5</form:option>
			 <form:option value="6">6</form:option>
			 <form:option value="7">7</form:option>
			 
		</form:select>
		<br>
 		<form:errors  path="scaleNo" cssClass="error"/>
 
 		 <br>
 		 <br>
 		 
	<input type="submit" value="Bilgileri Kaydet">
	</form:form>
	
	
	</div>
</body>
</html>