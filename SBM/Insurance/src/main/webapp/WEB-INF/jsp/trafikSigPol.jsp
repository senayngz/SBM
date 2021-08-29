<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <%@ include file="header.jsp" %> 
 
<title>Trafik Poliçe</title>
</head>
<body>

	<div class="container text-center">
	<article>
	
		<h1>KARAYOLLARI MOTORLU ARAÇLAR ZORUNLU MALİ SORUMLULUK (TRAFİK SİGORTASI) SİGORTA POLİÇESİ</h1>
		
		<h3>Sözleşme Tarafları</h3>
		
		Sigorta Şirketi Ünvanı: Sigorta Bilgi ve Gözetim Merkezi
		<br><br>		
		Sigortalı Ad Soyad: ${user.fullName}
		<br><br>
		TCKN: ${user.TCKN}
	
		<h3>RİSK BİLGİLERİ</h3>
		
		Plaka: ${riskInfo.plateNo}<br><br>
		Önceki Acente: ${riskInfo.prevAgency}<br><br>
		Önceki Poliçe: ${riskInfo.prevPolicy}<br><br>
		Araç Markası: ${vehicle.model}<br><br>
		Araç Modeli: ${vehicle.brand}<br><br>
		Motor No: ${vehicle.engineNo}<br><br>
		Şasi No: ${vehicle.chassisNo}<br><br>
		Basamak No: ${riskInfo.scaleNo}<br><br>
		Tescil Tarihi: ${riskInfo.registrationDate}<br><br>
		
		<h3>PRİM BİLGİLERİ</h3>
		
		Ödenecek Prim: ${prim}<br><br>
		
	
	
	</article>
	
	</div>
	

</body>
</html>