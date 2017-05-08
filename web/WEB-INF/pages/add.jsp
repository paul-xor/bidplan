<%-- 
    Document   : add
    Created on : Aug 17, 2016, 1:14:57 AM
    Author     : paul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Add Information</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/bootstrap.css" type="text/css">
        <link rel="stylesheet" href="css/custom.css">
        <link rel="stylesheet" href="css/bootstrap-responsive.min.css" type="text/css"/>
        <script src="js/respond.min.js"></script>
    </head>
    <body>
        <%@include file="../parts/header-small.jspf" %>
        <h3>Add New Ticket</h3>
        
        <form action="add" method="post">
            <div class="table-responsive>"
                 <table class="table table-condensed table-striped">
                    <thead>
                        <tr>
                            <th>TicketID</th>
                            <th>CRM OM ID</th>
                            <th>Opportunity</th>
                            <th>Customer</th>
                            <th>Country</th>
                            <th>Contact</th>
                            <th>Case Owner</th>
                            <th>Start Date</th>
                            <th>End Date</th>
                            <th>Status</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td><input type="text" name="tid" /></td>
                            <td><input type="text" name="omid" /></td>
                            <td><input type="text" name="opportunity" /></td>
                            <td><input type="text" name="customer" /></td>
                            <td><input type="text" name="country" /></td>
                            <td><input type="text" name="contact" /></td>
                            <td><input type="text" name="caseOwner" /></td>
                            <td><input type="text" name="start" /></td>
                            <td><input type="text" name="end" /></td>
                            <td><input type="text" name="status" /></td>
                        </tr>
                    </tbody>
                </table>
            </div>
            
            <input class="btn btn-primary" value="Cancel" onclick="document.location='view';" />
            <input class="btn btn-danger btn-lg" type="reset" value="Clear" />
            <input class="btn btn-info" type="submit" value="Create" />
            
        </form>
        
        <!--
        <div class="btn-group" role="group" aria-label="...">
            <input class="btn btn-primary" value="Cancel" onclick="document.location='view';" />
            <input class="btn btn-danger" type="reset" value="Clear" />
            <input class="btn btn-info" type="submit" value="Create" />
        </div>
        -->
        
        <!-- javaScript-->
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>

