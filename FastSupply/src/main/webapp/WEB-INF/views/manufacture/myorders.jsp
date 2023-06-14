<%-- <%@page import="java.util.ArrayList"%>
<%@page import="neu.edu.entity.Material"%>
<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> --%>
<%@ page contentType="text/html;charset=utf-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Supplier</title>
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

	<a href="./dashboard" class="w3-bar-item w3-button w3-padding"><i class="fa fa-dashboard fa-fw"></i>  Dashboard</a>
    <a href="./product" class="w3-bar-item w3-button w3-padding"><i class="fa fa-bank fa-fw"></i>  My Product</a>
    <a href="./ordersfrom" class="w3-bar-item w3-button w3-padding" ><i class="fa fa-diamond fa-fw"></i>  Orders From Distributor</a>
    <a href="./myorders" class="w3-bar-item w3-button w3-padding w3-blue"><i class="fa fa-history fa-fw"></i>   My Orders</a>
    <a href="./group" class="w3-bar-item w3-button w3-padding"><i class="fa fa-users fa-fw"></i>  Group Members</a>
    <a href="./myInfo" class="w3-bar-item w3-button w3-padding"><i class="fa fa-bullseye fa-fw"></i>  My Information</a>
    <a href="./supplyChain" class="w3-bar-item w3-button w3-padding"><i class="fa fa-cog fa-fw"></i> Supply Chain Settings</a><br><br>
    
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
    <h5><b><i class="fa fa-dashboard"></i> My Dashboard</b></h5>
  </header>
  
  <!-- Table -->
  <div class="w3-container">
    <h5>Materials</h5>
    <table class="w3-table w3-striped w3-bordered w3-border w3-hoverable w3-white">
      <!-- column -->
      <tr>
	  	<th>Material</th>
		<th>Cost</th>
		<th>Quantity</th>
		<th>Shipping Way</th>
		<th>Shipping Fee Mode</th>
		<th>Shipping Way</th>
		<th>Shipping Fee Mode</th>
		<th>Status</th>
	 </tr>
   	 <!-- data -->
                <tbody>
                    <c:forEach var="m" items="${materials}">
                        <tr>
                            <td>${m.name}</td>
                            <td>${m.cost}</td>
                            <td>${m.quantity}</td>
                            <c:forEach var="s" items="${m.shippingModes}">
                            	<td>${s.shippingWay}</td>
                            	<td>${s.shippingFeeMode}</td>
                            </c:forEach>
                            <td>${m.status}</td>
                        </tr>
                    </c:forEach>
                </tbody>
    </table>
    <br>
    <button class="w3-button w3-dark-grey">Manage Material<i class="fa fa-arrow-right"></i></button>
    <p></p>
  </div>
  <p></p>

    <!-- Table2 -->
  <div class="w3-container">
    <h5>Shipping Fee</h5>
    <table class="w3-table w3-striped w3-bordered w3-border w3-hoverable w3-white">
      <!-- column -->
      <tr>
	  	<th>Manufacture</th>
		<th>Shipping Fee (CAD)</th>
		<th>Standard Shipping time (Day)</th>
	 </tr>
   	 <!-- data -->
                <tbody>
                    <c:forEach var="s" items="${shipments}">
                        <tr>
                            <td>${s.manufactureId}</td>
                            <td>${s.shippingFee}</td>
                            <td>${s.standardShippingTime}</td>
                        </tr>
                    </c:forEach>
                </tbody>
    </table>
    <br>
    <button class="w3-button w3-dark-grey">Manage Shipment<i class="fa fa-arrow-right"></i></button>
    <p></p>
  </div>
  <p></p>
  
  <!-- Comments -->
  <div class="w3-container">
    <h5><b><i class="fa fa-dashboard"></i> Recent Comments</b></h5>
    <div class="w3-row">
      <div class="w3-col m10 w3-container">
        <h4>John <span class="w3-opacity w3-medium">Sep 29, 2014, 9:12 PM</span></h4>
        <p>Keep up the GREAT work! I am cheering for you!! Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p><br>
      </div>
    </div>

    <div class="w3-row">
      <div class="w3-col m10 w3-container">
        <h4>Bo <span class="w3-opacity w3-medium">Sep 28, 2014, 10:15 PM</span></h4>
        <p>Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p><br>
      </div>
    </div>
  </div>
  
  
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
</html>
