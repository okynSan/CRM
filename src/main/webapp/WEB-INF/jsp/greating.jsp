<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
        <style>
            <%@include file='/WEB-INF/css/navigation.css' %>
        </style>

        <script>
            function startTime() {
                var today = new Date();
                var h = today.getHours();
                var m = today.getMinutes();
                var s = today.getSeconds();
                m = checkTime(m);
                s = checkTime(s);
                document.getElementById('txt').innerHTML =
                        h + ":" + m + ":" + s;
                var t = setTimeout(startTime, 500);
            }
            function checkTime(i) {
                if (i < 10) {
                    i = "0" + i;
                }
                ;  // add zero in front of numbers < 10
                return i;
            }
        </script>

    </head>


    <body onload="startTime()">

        <div class="navigation_bar">
            <nav>
                <ul>
                    <li><a href="index">Home</a></li>
                    <li><a href="book">Order</a></li>
                    <li><a href="welcome.htm">Clients</a></li>
                    <li style="float:right" ><a href="logout.htm" >Logout</a></li>
                    <li style="float:right" ><a> User name</a></li>
                    <li style="float:right" ><a id="txt" ></a></li>

                </ul>
            </nav>
        </div>
        
        
        <div align="center">
            <h1>"${message}"</h1>
        </div>
        
        

    </body>


</html>