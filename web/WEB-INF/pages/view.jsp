<%-- 
    Document   : view
    Created on : Aug 17, 2016, 1:15:25 AM
    Author     : paul
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Projects</title>
        <%@include file="../parts/head-1.jspf" %>
        
    </head>
    <body>
        <%@include file="../parts/header-small.jspf" %>
        <h3>Tickets List</h3>
        
        <div class="table-responsive">
            <table class="table table-condensed table-striped table-hover" >
                <thead>
                    <tr>
                        <th>ID</th>
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
                        <th>Action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="ticket" items="${tickets}">
                        <tr>
                            <td><c:out value="${ticket.id}" /></td>
                            <%-- <td><input class="btn btn-default" value="${ticket.tid}"onclick="document.location='view_d';" />  --%>
                            <%-- <td><a href="view_d"><c:out value="${ticket.tid}"/></a></td> it works as link --%>
                            <td><a href="view_d?tid=${ticket.tid}" class="btn btn-info" role="button"><c:out value="${ticket.tid}"/></a></td>
                            <td><c:out value="${ticket.omid}" /></td>
                            <td><c:out value="${ticket.opportunity}" /></td>
                            <td><c:out value="${ticket.customer}" /></td>
                            <td><c:out value="${ticket.country}" /></td>
                            <td><c:out value="${ticket.contact}" /></td>
                            <td><c:out value="${ticket.caseOwner}" /></td>
                            <td><c:out value="${ticket.start}" /></td>
                            <td><c:out value="${ticket.end}" /></td>
                            <td><c:out value="${ticket.status}" /></td>
                            <td><a href="remove?id=${ticket.id}">Remove</a></td>
                        </tr>
                    </c:forEach>
                    <tr>
                        <td colspan="4" style="">
                            <input class="btn btn-primary btn-lg" value="Add new ticket" onclick="document.location = 'add';" />
                        </td>
                    </tr>
                </tbody>
            </table>
        </div> <!--end of table-responsive-->
        <%@include file="../parts/footer.jspf" %>
    </body>
</html>
