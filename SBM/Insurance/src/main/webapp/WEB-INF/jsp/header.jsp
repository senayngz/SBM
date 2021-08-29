<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<style>

body { 
  margin: 5;
  font-family: Times;
}

.header {
  overflow: hidden;
  background-color: #92a8d1;
  padding: 20px 10px;
}


.header a {
  float: left;
  color: Black;
  text-align: center;
  padding: 15px;
  font-size: 20px; 
  line-height: 20px;
  border-radius: 50px;
}

.header a.logo {
  font-size: 25px;
  font-weight: bold;
}

.header a:hover {
  background-color: #ddd;
  color: black;
}

.header a.active {
  background-color: darkblue;
  color: white;
}


.header-right {
  float: right;
}

</style>
</head>
<body>

<div class="header">
  <a href="/" class="logo">SBM</a>
  <div class="header-right">
    <a class="active" href="/">Home</a>
    <a href="trafikSig">Trafik Sigortası</a>
    <a href="kasko">Kasko Sigortası</a>
  </div>
</div>

</body>
</html>