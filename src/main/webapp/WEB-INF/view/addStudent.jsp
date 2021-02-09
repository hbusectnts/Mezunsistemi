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

    <h5 class="text-center">Mezun Kayıt Formu</h5>
    <a class="float-right" href="/student/students">Geri Dön</a>

    <form:form id="form" method="post" action="/student/addStudent" modelAttribute="user" >
        <div class="form-group">
            <label for="tcKimlikNo">TcKimlikNo</label>
            <form:input class="form-control" path="tcKimlikNo"  placeholder="email" id="email" />
            <form:errors path="tcKimlikNo" cssClass="error"/>
        </div>
        <div class="form-group">
            <label for="ogrNo">Öğrenci Numarası</label>
            <form:input class="form-control" path="ogrNo"  placeholder="email" id="email" />
            <form:errors path="ogrNo" cssClass="error"/>
        </div>

        <div class="form-group">
            <label for="email">Email</label>
            <form:input class="form-control" path="email"  placeholder="email" id="email" />
            <form:errors path="email" cssClass="error"/>
        </div>

        <div class="form-group">
            <label for="password">Password</label>
            <form:password class="form-control" path="password" placeholder="Password" id="password" />
            <form:errors path="password" cssClass="error" />
        </div>

        <div class="form-group">
            <label for="name">Name</label>
            <form:input class="form-control" path="name"  placeholder="Name" id="name" />
            <form:errors path="name"  cssClass="error"/>
        </div>

        <div class="form-group">
            <label for="surname">Surname</label>
            <form:input class="form-control" path="surname" placeholder="Surname" id="surname" />
            <form:errors path="surname" cssClass="error"/>
        </div>

        <div class="form-group">
            <label for="phone">Mezuniyet Yılı</label>
            <form:input class="form-control" path="mezunyılı" placeholder="Mezuniyet Yılı" id="phone" />
            <form:errors path="mezunyılı" cssClass="error" />
        </div>

        <div class="form-group">
            <label for="phone">Diploma Notu</label>
            <form:input class="form-control" path="diplomaNotu" placeholder="diplomaNotu" id="phone" />
            <form:errors path="diplomaNotu" cssClass="error" />
        </div>

        <div class="form-group">
            <label>Bölümü</label>
            <form:select class="form-control" path="departman" action = "select">
                <c:forEach items="${departman}" var="dep">
                    <form:option value="${dep.id}" label="${dep.name}"/>
                </c:forEach>
            </form:select>
        </div>





        <button type="submit" class="btn btn-success float-right">Mezun Ekle</button>

    </form:form>


</div>







</body>
</html>