<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="stylesheet" href="/resources/css/dashbord.css">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css" rel="stylesheet" type="text/css" />
</head>
<body>

<c:if test="${pageContext.request.userPrincipal.name == 'admin' }">
    <nav class="col-md-2 d-none d-md-block sidebar bg-dark">
        <div class="sidebar-sticky bg-light">
            <ul class="nav flex-column">

                <li class="nav-item list-group-item list-group-item-action bg-light" style="margin-top: -10px">
                   <h5 class="text-center mt-2">Mezun Bilgi Sistemi</h5>

                </li>


                <li class="nav-item  ">
                    <a class="nav-link list-group-item list-group-item-action bg-light" href="/">
                        <i class="fa fa-home"></i>
                        Anasayfa
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link list-group-item list-group-item-action bg-light" href="/student/students">
                        <i class="fa fa-user-graduate"></i>
                        Mezunlar
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link list-group-item list-group-item-action bg-light" href="/departman/departmans">
                        <i class="fa fa-layer-group"></i>
                        Bölümler
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link list-group-item list-group-item-action bg-light" href="/student/addStudent">
                        <i class="fa fa-boxes"></i>
                      Mezun Ekle
                    </a>
                </li>

                <li class="nav-item">

                    <a class="nav-link list-group-item list-group-item-action bg-light" href="/logout">
                        <i class="text-danger fa fa-door-open"></i>
                        Çıkış Yap
                    </a>
                </li>

            </ul>
        </div>
    </nav>

</c:if>

<c:if test="${pageContext.request.userPrincipal.name != 'admin'}">
    <nav class="col-md-2 d-none d-md-block sidebar bg-light">
        <div class="sidebar-sticky">
            <ul class="nav flex-column">

                <li class="nav-item list-group-item list-group-item-action bg-light" >
                    <h5 class="text-center mt-3">Mezun Bilgi Sistemi</h5>

                </li>

                <li class="nav-item">
                    <a class="nav-link nav-link list-group-item list-group-item-action bg-light" href="/">
                        <i class="fa fa-home"></i>
                        Anasayfa
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link nav-link list-group-item list-group-item-action bg-light" href="/student/information">
                        <i class="fa fa-boxes"></i>
                        Mezuniyet Bilgilerim
                    </a>
                </li>

                <li class="nav-item">
                    <a class="nav-link nav-link list-group-item list-group-item-action bg-light" href="/note/notes">
                        <i class="fa fa-boxes"></i>
                        Notlarım
                    </a>
                </li>



                <li class="nav-item">

                    <a class="nav-link nav-link list-group-item list-group-item-action bg-light" href="/logout">
                        <i class="text-danger fa fa-door-open"></i>
                        Çıkış Yap
                    </a>
                </li>

            </ul>

        </div>
    </nav>
</c:if>

</body>
</html>