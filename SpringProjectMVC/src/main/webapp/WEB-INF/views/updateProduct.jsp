<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
<link rel="stylesheet" href='<c:url value="/resources/css/product.css"></c:url>' />
</head>
<body>
 <div class="container mt-3">
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <div class="text-center mb-3"><h1>Update the product detail</h1></div>
                 <form action="${pageContext.request.contextPath}/handleProduct" method="post">
                 <div class="mb-3">
                        <label for="id" class="form-label">Product Id</label>
                        <input type="text" style="border:none;background-color:white;" class="form-control" id="id" placeholder="id" name="id"  value="${product.id }" readOnly>
                    </div>
                    <div class="mb-3">
                        <label for="name" class="form-label">Product Name</label>
                        <input type="text" class="form-control" id="name" placeholder="name" name="name" value="${product.name }">
                    </div>
                    <div class="mb-3">
                        <label for="description" class="form-label">Product Description</label>
                        <textarea class="form-control" id="description" rows="3" name="description">${product.description }</textarea>
                    </div>
                    <div class="mb-3">
                        <label for="price" class="form-label">Product Price</label>
                        <input type="text" class="form-control" id="price" placeholder="price" name="price" value="${product.price }">
                    </div>
                    <div class="container text-center">
                        <a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger">Back</a>
                        <button type="submit" class="btn btn-success">Update</button>
                    </div>
                 </form>
            </div>
        </div>
    </div>
</body>
</html>