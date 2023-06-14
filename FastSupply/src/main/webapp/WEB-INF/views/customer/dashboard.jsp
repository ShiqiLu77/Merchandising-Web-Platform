<%@ page contentType="text/html;charset=utf-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Customer</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
html,body,h1,h2,h3,h4,h5 {font-family: "Raleway", sans-serif}
</style>
</head>
<body class="w3-light-grey">

<!-- Top container -->
<div class="w3-bar w3-top w3-black w3-large" style="z-index:4">
  <button class="w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey" onclick="w3_open();"><i class="fa fa-bars"></i>  Menu</button>
  <span class="w3-bar-item w3-right">FastBuy</span>
  <div class="w3-right">
				<a href="../logout" class="w3-bar-item w3-button">
				<i class="fa fa-user"></i>Log Out</a>
	</div>
</div>

<!-- Sidebar/menu -->
<nav class="w3-sidebar w3-collapse w3-white w3-animate-left" style="z-index:3;width:300px;" id="mySidebar"><br>
  <div class="w3-container w3-row">
    <div class="w3-col s8 w3-bar">
      <!-- Supplier Name -->
      <span>Welcome, <strong>Mike</strong></span><br>
<!--  <a href="#" class="w3-bar-item w3-button"><i class="fa fa-envelope"></i></a> 
      <a href="#" class="w3-bar-item w3-button"><i class="fa fa-user"></i></a>
      <a href="#" class="w3-bar-item w3-button"><i class="fa fa-cog"></i></a>-->
    </div>
  </div>
  <hr>
  <div class="w3-container">
    <h5>Menu</h5>
  </div>
  <div class="w3-bar-block">
	<a href="./dashboard" class="w3-bar-item w3-button w3-padding w3-blue"><i class="fa fa-dashboard fa-fw"></i>  All products</a>
    <a href="./orders" class="w3-bar-item w3-button w3-padding"><i class="fa fa-diamond fa-fw"></i>  My Orders</a>
    <a href="./myInfo" class="w3-bar-item w3-button w3-padding"><i class="fa fa-bullseye fa-fw"></i>  My Information</a>
    
    <!--     
    <a href="#" class="w3-bar-item w3-button w3-padding"><i class="fa fa-eye fa-fw"></i>  Orders</a>
	<a href="#" class="w3-bar-item w3-button w3-padding"><i class="fa fa-bell fa-fw"></i>  News</a>
    <a href="#" class="w3-bar-item w3-button w3-padding"><i class="fa fa-bank fa-fw"></i>  General</a>
    <a href="#" class="w3-bar-item w3-button w3-padding"><i class="fa fa-history fa-fw"></i>  History</a> 
    -->
  </div>
</nav>

<!-- sidebar overlay effect on small screens -->
<div class="w3-overlay w3-hide-large w3-animate-opacity" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>


<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:300px;margin-top:43px;">

  <!-- Header -->
  <header class="w3-container" style="padding-top:22px">
    <h5><b><i class="fa fa-dashboard"></i> Products</b></h5>
  </header>
  
  <!-- Table -->
  <div class="w3-container">
    <table class="w3-table w3-striped w3-bordered w3-border w3-hoverable w3-white">
      <!-- column -->
      <tr>
	  	<th>Product</th>
		<th>Cost</th>
		<th>Quantity</th>
		<th>Shipping Way</th>
		<th>Shipping Fee Mode</th>
		<th>Shipping Way</th>
		<th>Shipping Fee Mode</th>
	 </tr>
   	 <!-- data -->
                <tbody>
                    <c:forEach var="p" items="${products}">
                        <tr>
                            <td>${p.name}</td>
                            <td>${p.cost}</td>
                            <td>${p.quantity}</td>
                            <c:forEach var="s" items="${p.shippingModes}">
                            	<td>${s.shippingWay}</td>
                            	<td>${s.shippingFeeMode}</td>
                            </c:forEach>
                        </tr>
                    </c:forEach>
                </tbody>
    </table>
    <br>
    <button class="w3-button w3-dark-grey"> Place An Order <i class="fa fa-arrow-right"></i></button>
    <p></p>
  </div>
  <p></p>
  
  <!-- Bottom -->
  <div class="w3-container w3-dark-grey w3-padding-20">
    <div class="w3-row">
    	<p>Powered by <a href="https://www.w3schools.com/w3css/default.asp" target="_blank">w3.css</a></p>
    </div>
  </div>
  
  
  <!-- End page content -->
</div>

<script>
// Get the Sidebar
var mySidebar = document.getElementById("mySidebar");

// Get the DIV with overlay effect
var overlayBg = document.getElementById("myOverlay");

// Toggle between showing and hiding the sidebar, and add overlay effect
function w3_open() {
  if (mySidebar.style.display === 'block') {
    mySidebar.style.display = 'none';
    overlayBg.style.display = "none";
  } else {
    mySidebar.style.display = 'block';
    overlayBg.style.display = "block";
  }
}

// Close the sidebar with the close button
function w3_close() {
  mySidebar.style.display = "none";
  overlayBg.style.display = "none";
}
</script>

</body>