<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="component/all_css.jsp" %>
</head>
<body>
	<%@include file="component/navbar.jsp" %>
	
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<form>
  <div class="form-group">
    <label for="exampleInputEmail1">TODO</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    
  </div>
<div class="form-group ">
      <label for="inputState">Status</label>
      <select id="inputState" class="form-control">
        <option selected>---Select---</option>
        <option selected>Pending</option>
        <option selected>Complete</option>
        <option>...</option>
      </select>
    </div>

  <button type="submit" class="btn btn-primary">Submit</button>
</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>