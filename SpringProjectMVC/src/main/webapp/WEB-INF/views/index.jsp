<html>
<head>
<%@include file="./base.jsp"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href='<c:url value="/resources/css/product.css"></c:url>' />
</head>
<body>
	<div class="container mt-3 text-white">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center mb-3">Welcome to Product App</h1>
				<table class="table table-bordered">
					<thead class="bg bg-warning text-center text-white">
						<tr>
							<th scope="col">Product Id</th>
							<th scope="col">Product Name</th>
							<th scope="col">Product Description</th>
							<th scope="col">Product Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody class="text-white">
					<c:forEach var="a" items="${products }">
						<tr>
							<th scope="row">${a.id }</th>
							<td>${a.name }</td>
							<td>${a.description }</td>
							<td class="fw-bold">&#x20B9; ${a.price }</td>
							<td class="text-center"><a href="delete/${a.id}"><i class="fa fa-trash text-danger" style="font-size:20px;"></i></a>
							<a href="update/${a.id}"><i class="fa fa-pencil text-info" style="font-size:20px;"></i></a></td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
				<div class="container text-center">
				   <a href="addProduct" class="btn btn-outline-info">Add Product</a>
				</div>

			</div>
		</div>
	</div>
</body>
</html>
