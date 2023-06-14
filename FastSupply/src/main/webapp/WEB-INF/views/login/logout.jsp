<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>FastSupply</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">

<style>
body, h1, h5 {
	font-family: "Raleway", sans-serif
}

body, html {
	height: 100%
}

.bgimg {
	background-image:
		url('https://paris-louvre.com/wp-content/uploads/2018/02/%E8%B4%AD%E7%89%A9%E6%94%BB%E7%95%A5.jpeg');
	min-height: 100%;
	background-position: center;
	background-size: cover;
}
</style>

</head>
<body>

<!-- Icon Bar (Sidebar - hidden on small screens)-->
<nav class="w3-sidebar w3-bar-block w3-small w3-hide-small w3-center">
   <a class="w3-bar-item w3-padding-large w3-black">
    <i class="fa fa-home w3-jumbo"></i>
    <h4>Login</h4>
  </a>
  
 <!-- choose role -->
  <a href="./DistributorLogin" class="w3-bar-item w3-button w3-padding-large w3-hover-black">
    <i class="fa fa-user w3-xxlarge"></i>
    <p>Distributor</p>
  </a>
  
  <a href="./ManufactureLogin" class="w3-bar-item w3-button w3-padding-large w3-hover-black">
    <i class="fa fa-eye w3-xxlarge"></i>
    <p>Manufacture</p>
  </a>
  
  <a href="./SupplierLogin" class="w3-bar-item w3-button w3-padding-large w3-hover-black">
    <i class="fa fa-envelope w3-xxlarge"></i>
    <p>Supplier</p>
  </a>
  
</nav> 

<!-- Main part -->
	<div class="bgimg w3-display-container w3-text-white">
		<!-- Slogan bar -->
		<div id="word" class="w3-display-topmiddle w3-jumbo">
		<p>Fastest sell and buy</p>
		</div>

		<!-- Login bar -->
		<div class="w3-display-middle w3-container w3-xlarge">
			<a href="./CustomerLogin" class="w3-bar-item w3-button w3-xxxlarge">
			Start
			</a>
		</div>


		<!-- Signature bar -->
		<div class="w3-display-bottomright w3-container">
			<p class="w3-large">100 King West St, Toronto</p>
			<p> powered by <a href="https://www.w3schools.com/w3css/default.asp" target="_blank">w3.css</a></p>
		</div>
		
	</div>

</body>
</html>
