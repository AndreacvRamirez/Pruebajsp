<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<link rel="stylesheet" href="resources/css/card.css">
<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700' rel='stylesheet' type='text/css'>
<title>1151710</title>
<link rel="stylesheet" href="resources/css/card.css">
</head>
<body>
<a id="view-code" href="https://codepen.io/virgilpana/pen/RNYQwB" target="_blank">VIEW CODE</a>

<div id="make-3D-space">
    <div id="product-card">
        <div id="product-front">
        	<div class="shadow"></div>
            <img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/245657/t-shirt.png" alt="" />
            <div class="image_overlay"></div>
            <div id="view_details">View details</div>
            <div class="stats">        	
                <div class="stats-container">
                    <span class="product_price">$39</span>
                    <span class="product_name">Adidas Originals</span>    
                    <p>Men's running shirt</p>                                            
                    
                    <div class="product-options">
                    <strong>SIZES</strong>
                    <span>XS, S, M, L, XL, XXL</span>
                    <strong>COLORS</strong>
                    <div class="colors">
                        <div class="c-blue"><span></span></div>
                        <div class="c-red"><span></span></div>
                        <div class="c-white"><span></span></div>
                        <div class="c-green"><span></span></div>
                    </div>
                </div>                       
                </div>                         
            </div>
        </div>
        <div id="product-back">
	        <div class="shadow"></div>
            <div id="carousel">
                <ul>
                    <li><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/245657/t-shirt-large.png" alt="" /></li>
                    <li><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/245657/t-shirt-large2.png" alt="" /></li>
                    <li><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/245657/t-shirt-large3.png" alt="" /></li>
                </ul>
                <div class="arrows-perspective">
                    <div class="carouselPrev">
                        <div class="y"></div>
	                    <div class="x"></div>
                    </div>
                    <div class="carouselNext">
                        <div class="y"></div>
	                    <div class="x"></div>
                    </div>
                </div>
            </div>
            <div id="flip-back">
            	<div id="cy"></div>
                <div id="cx"></div>
            </div>
        </div>	  
    </div>	
</div>	
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script src="resources/js/app.js"></script>
</body>
</html>