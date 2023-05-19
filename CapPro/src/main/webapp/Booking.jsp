<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Booking</title>
    <link rel="stylesheet" href="Style/BookingStyle.css" />
</head>
<body class="body">
    <div class="header">
        <div class="container">
                <ol>
                    <li>Cab<span>Service</span></li>
                </ol>
        </div>
        <div class="nav">
            <ul>
                <li><a href="Home.jsp">Home</a></li>
                <li><a href="#">Partner</a></li>
                <li><a href="Booking.jsp">Booking</a></li>
                <li><a href="logout.html">Login</a></li>
                <li><a href="#">Contact</a></li>   
            </ul>
        </div>
    </div>
    <div class="content-b">
        <section class="sec-b">
            <h2>Booking</h2>
        <form method="post" action="Booking">
           <div class="userbox-b">
            <input type="text" name="name" style="color:maroon;"id="name"  placeholder="Enter Your Name" value="<%=request.getAttribute("name")%>" required><br>
        </div>
        <div class="userbox-b">
            <input type="tel" name="mobile" style="color:maroon;"id="num" placeholder="MobileNo" value="<%=request.getAttribute("mobile")%>" required><br>
        </div>
        <div class="userbox-b">
            <input type="email" style="color:maroon;" name="email" id="email" placeholder="Enter Your Email" value="<%=request.getAttribute("email")%>" required><br>
        </div>
        <div class="userbox-b">
            <input type="text" name="date" placeholder="Pickup date" onfocus="(this.type='date')" /><br>
        </div>  
            <div class="userbox-b">
                <input type="text" name="time" placeholder="Pickup time" onfocus="(this.type='time')"/><br>
            </div>
            <div class="userbox-b">
                <textarea name="desc" id="" cols="45" rows="3" placeholder="Destination Address..."></textarea><br>
               </div>
               <div class="userbox-b">
               <p>Select a Car Model</p>
                <select name="cabType" id="type">
                <option Value="Tata"> Tata</option>
                <option Value="Maruti"> Maruti</option>
                <option Value="Mahindra"> Mahindra</option>
                <option Value="Swift"> Swift</option>
                <option Value="Honda"> Honda</option>
                <option Value="Hundai"> Hundai</option>
                </select><br>
               </div>
            <div align="center"> <input type="submit" id="btn-b" value="Submit"/></div>
        </section>
     </form>
    </div>
</body>
</html>