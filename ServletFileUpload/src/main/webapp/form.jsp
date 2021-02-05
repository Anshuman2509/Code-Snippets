<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apache Commons File Upload</title>
<style type="text/css">
input[type='file']{
border:1px solid black;
}
</style>
</head>
<body>
<div>
<p>Apache Commons File Upload</p>
<form action="upload-form" method="post" enctype="multipart/form-data">
<label for="aa">Choose a file:&nbsp;&nbsp;</label><input type="file" name="upload-file" id="aa"/>
<input type="submit" value="Upload"/>
</form>
</div>
</body>
</html>