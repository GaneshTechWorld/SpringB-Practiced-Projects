<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
  color:red;
</style>
</head>
<body>
     <form:form action="product"  modelAttribute="productt"  method="POST">
       <table>
          <tr>
            <td>Product Id</td>
            <td><form:input path="pID"/></td>
          </tr>
            <tr>
            <td>Product Name</td>
            <td><form:input path="pName"/></td>
          </tr>
          <tr>
            <td>Product Price</td>
            <td><form:input path="pPrice"/></td>
          </tr>
     </table>
        
      <form:button id="one">Submit</form:button>  
     
     
     </form:form>
</body>
</html>