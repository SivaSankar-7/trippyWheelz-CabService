<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="Style/ConfirmStyle.css" />
<meta charset="UTF-8" />
<title>Booking Confirmation</title>
</head>
<body class="body">
	<div class="header">
		<div class="container">
			<ol>
				<li>Cab<span>Service</span></li>
			</ol>
		</div>
	</div>
	<div align="center" class="content-b">
		<section class="sec-b">
			<h2>Cab-Booking Successfully</h2>
		</section>
		<br> <br>
		<table class="table 1">
			<tr>
				<th><h3>Name :</h3></th>
				<td><h3><%=request.getAttribute("Name")%></h3></td>
			</tr>
			<tr>
				<th><h3>Date :</h3></th>
				<td><h3><%=request.getAttribute("Date")%></h3></td>
			</tr>
			<tr>
				<th><h3>Time :</h3></th>
				<td><h3><%=request.getAttribute("Time")%></h3></td>
			</tr>
			</table>
			<h4>
				Cab & DriverDetails<br>
				<hr>
			</h4>
			<table class="table2">
			<tr>
				<th><h3>Driver Name :</h3></th>
				<td><h3><%=request.getAttribute("DriverName")%></h3></td>
			</tr>
			<tr>
				<th><h3>Age :</h3></th>
				<td><h3><%=request.getAttribute("Age")%></h3></td>
			</tr>
			<tr>
				<th><h3>place :</h3></th>
				<td><h3><%=request.getAttribute("Place")%></h3></td>
			</tr>
			<tr>
				<th><h3>Experience :</h3></th>
				<td><h3><%=request.getAttribute("Experience")%>
						Year's
					</h3></td>
			</tr>
			<tr>
				<th><h3>DriverEmail :</h3></th>
				<td><h3><%=request.getAttribute("DriverEmail")%></h3></td>
			</tr>
			<tr>
				<th><h3>MobileNO :</h3></th>
				<td><h3><%=request.getAttribute("Mobile")%></h3></td>
			</tr>
			<tr>
				<th><h3>CarRegisterNO :</h3></th>
				<td><h3><%=request.getAttribute("RegisterNo")%></h3></td>
			</tr>
			<tr>
				<th><h3>CarColour :</h3></th>
				<td><h3><%=request.getAttribute("CarColour")%></h3></td>
			</tr>
			<tr>
				<th><h3>RatePerKm :</h3></th>
				<td><h3>
						&#8377;
						<%=request.getAttribute("Rate")%></h3></td>
			</tr>
		</table>

	</div>
</body>
</html>
