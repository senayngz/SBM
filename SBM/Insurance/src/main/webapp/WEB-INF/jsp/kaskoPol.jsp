<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <%@ include file="header.jsp" %> 
<title>Kasko Poliçe</title>
</head>
<body>
	
	<h1>KASKO SİGORTA POLİÇESİ</h1>

	<h3>Sözleşme Tarafları</h3>
			
			Sigorta Şirketi Ünvanı: Sigorta Bilgi ve Gözetim Merkezi
			<br><br>		
			Sigortalı Ad Soyad: ${user.fullName}
			<br><br>
			TCKN: ${user.TCKN}
		
	<h3>SİGORTA KONUSU ARAÇ BİLGİLERİ</h3>
	
	Plaka: ${vehicle.plateNo}<br><br>
	Araç Markası: ${vehicle.brand}<br><br>
	Araç Tipi: ${vehicle.vehicleType}<br><br>
	Engelli Aracı mı?: ${vehicle.disabled}<br><br>
	Araç Modeli: ${vehicle.model}<br><br>
	Motor No: ${vehicle.engineNo}<br><br>
	Şasi No: ${vehicle.chassisNo}<br><br>
	Araç Sınıfı: ${vehicle.vehicleGrade}<br><br>
	Kullanım Amacı: ${vehicle.intendedUse}<br><br>
	
	<h3>SİGORTA TEMİNATLARI</h3>
	<pre> 
-Yanma								-Çalınma
-Sel Teminatı							-Grev Teminatı
-Çarpma Çarpışma						-Terör Teminatı
-Sigara Benzeri							-Mini Onarım
-Kasko-Deprem							-Kasko-Dolu	
-Cam Servisi							-Çarpma Devrilme Teminatı
	</pre>
	
	<h3>PRİM BİLGİLERİ</h3>
		
		Ödenecek Prim: ${prim}<br><br>
	
</body>
</html>