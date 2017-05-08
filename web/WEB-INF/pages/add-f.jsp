<%-- 
    Document   : add-f
    Created on : Oct 4, 2016, 6:50:43 PM
    Author     : pasmo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>New Case</title>
  <%@include file="../parts/head-1.jspf" %>
  
</head>
<body>

<%@include file="../parts/header-small.jspf" %>

<div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-2 sidenav">
      <p><a href="#">Link</a></p>
      <p><a href="#">Link</a></p>
      <p><a href="#">Link</a></p>
    </div>
    <div class="col-sm-8 text-left"> 
      
      <p>
      <h3>Create New Ticket</h3>
      
      
      <form class="form-horizontal" action="add" method="post">
          <div class="form-group has-success has-feedback">
              <label class="col-sm-2 control-label" for="inputTid">Ticket #ID</label>
              <div class="col-sm-8">
                  <input type="text" class="form-control" name="tid" id="inputTid">
                  <span class="glyphicon glyphicon-ok form-control-feedback"></span>
              </div>
          </div>
          <div class="form-group has-success has-feedback">
              <label class="col-sm-2 control-label" for="inputOmid">CRM OM #ID / SF #ID</label>
              <div class="col-sm-8">
                  <input type="text" class="form-control" name="omid" id="inputOmid">
                  <span class="glyphicon glyphicon-ok form-control-feedback"></span>
              </div>
          </div>
          <div class="form-group has-success has-feedback">
              <label class="col-sm-2 control-label" for="inputOpp">Opportunity</label>
              <div class="col-sm-8">
                  <input type="text" class="form-control" name="opportunity" id="inputOpp">
                  <span class="glyphicon glyphicon-ok form-control-feedback"></span>
              </div>
          </div>
          <div class="form-group has-success has-feedback">
              <label class="col-sm-2 control-label" for="inputCustomer">Customer</label>
              <div class="col-sm-8">
                  <input type="text" class="form-control" name="customer" id="inputCustomer">
                  <span class="glyphicon glyphicon-ok form-control-feedback"></span>
              </div>
          </div>
          <div class="form-group has-success has-feedback">
              <label class="col-sm-2 control-label" for="inputCountry">Country</label>
              <div class="col-sm-8">
                  <input type="text" class="form-control" name="country" id="inputCountry">
                  <span class="glyphicon glyphicon-ok form-control-feedback"></span>
              </div>
          </div>
          <div class="form-group has-success has-feedback">
              <label class="col-sm-2 control-label" for="inputContact">Contact Name</label>
              <div class="col-sm-8">
                  <input type="text" class="form-control" name="contact" id="inputContact">
                  <span class="glyphicon glyphicon-ok form-control-feedback"></span>
              </div>
          </div>
          <div class="form-group has-success has-feedback">
              <label class="col-sm-2 control-label" for="inputCaseOwner">Case Owner</label>
              <div class="col-sm-8">
                  <input type="text" class="form-control" name="caseOwner" id="inputCaseOwner">
                  <span class="glyphicon glyphicon-ok form-control-feedback"></span>
              </div>
          </div>
          <div class="form-group has-success has-feedback">
              <label class="col-sm-2 control-label" for="inputStart">Start Date:</label>
              <div class="col-sm-8">
                  <input type="text" class="form-control" name="start" id="inputStart">
                  <span class="glyphicon glyphicon-ok form-control-feedback"></span>
              </div>
          </div>
          <div class="form-group has-success has-feedback">
              <label class="col-sm-2 control-label" for="inputEnd">End Date:</label>
              <div class="col-sm-8">
                  <input type="text" class="form-control" name="end" id="inputEnd">
                  <span class="glyphicon glyphicon-ok form-control-feedback"></span>
              </div>
          </div>
          <div class="form-group has-success has-feedback">
              <label class="col-sm-2 control-label" for="inputStatus">Status</label>
              <div class="col-sm-8">
                  <input type="text" class="form-control" name="status" id="inputStatus">
                  <span class="glyphicon glyphicon-ok form-control-feedback"></span>
              </div>
          </div>
          <hr>
          <div class="btn-group btn-group-justified">
              <input class="btn btn-primary" value="Cancel" onclick="document.location='view';" />
              <input class="btn btn-danger" type="reset" value="Clear" />
              <input class="btn btn-info" type="submit" value="Create" />
          </div>
      </form>
      </p>
      <hr>
      <h3>DISCLAIMER:</h3>
      <p>Above fields to be filled very carefully. Since field verification is absent by the moment.</p>
    </div>
    <div class="col-sm-2 sidenav">
      <div class="well">
        <p>ADS</p>
      </div>
      <div class="well">
        <p>ADS</p>
      </div>
    </div>
  </div>
</div>

<%@include file = "../parts/footer.jspf" %>

</body>
</html>

