<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>

<style>
    .error {color: #ff0f49;list-style-type: circle}
</style>


<div class="container p-5">

    <h5 class="text-center">Mezun Kaydetme Formu</h5>
    <a class="float-right" href="/student/students">Geri Dön</a>

    <form:form id="form" method="post" action="/note/addNotes/${user.id}" modelAttribute="note" >
        <div class="form-group">
            <label for="vize">Vize</label>
            <form:input class="form-control" path="vize"  placeholder="email" id="email" />
            <form:errors path="vize" cssClass="error"/>
        </div>

        <div class="form-group">
            <label for="fnal">Final</label>
            <form:input class="form-control" path="fnal"  placeholder="Name" id="name" />
            <form:errors path="fnal"  cssClass="error"/>
        </div>

        <div class="form-group">
            <label for="surname">Surname</label>
            <form:input class="form-control" path="büt" placeholder="Surname" id="surname" />
            <form:errors path="büt" cssClass="error"/>
        </div>


        <div class="form-group">
            <label>Bölümü</label>
            <form:select class="form-control" path="lesson" action = "select">
                <c:forEach items="${lessons}" var="les">
                    <form:option value="${les.id}" label="${les.name}"/>
                </c:forEach>
            </form:select>
        </div>





        <button type="submit" class="btn btn-success float-right">Mezun Ekle</button>

    </form:form>


</div>







</body>
</html>