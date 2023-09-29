<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
 .error
 {
   color:red;
 }
</style>
</head>

<body>
   <form:form action="user"  modelAttribute="user"  method="POST">
      <table>
         <tr>
            <td>User id :</td>
             <td ><form:input path="id" /></td>
               <td><form:errors path="id"  cssClass="error"/></td>
         </tr>
          <tr>
            <td>User Name :</td>
             <td><form:input path="name" /></td>
             <td><form:errors path="name"  cssClass="error"/></td>
         </tr>
          <tr>
            <td>Usernam: mail</td>
             <td> <form:input path="mail" /></td>
                <td><form:errors path="mail"  cssClass="error"/></td>
         </tr>
          <tr>
            <td>User age :</td>
             <td><form:input path="age" /></td>
         </tr>
          <tr>
            <td>User Mobile Number  :</td>
             <td><form:input path="mno" /></td>
         </tr>
     
          <tr>
             <td></td>
             
               <td><input type="submit" value="Register"/></td>
             
          </tr>
       </table>
   </form:form>
</body>
</html>