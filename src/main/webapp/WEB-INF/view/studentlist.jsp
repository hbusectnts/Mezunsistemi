<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="stylesheet" href="/resources/css/dashbord.css">
</head>
<body>


<div class="container-fluid">
    <div class="row">
        <jsp:include page="partial/sidebar.jsp">
            <jsp:param name="title" value="Main title" />
        </jsp:include>

        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">

            <h5 class="text-center">Mezun Listesi</h5>


            <div class="row">
                <div class="col-md-12">
                    <table  class="table table-bordered">
                        <thead class="thead-light" >
                        <tr>
                            <th>Fotograf</th>
                            <th>Okul Numarası</th>
                            <th>Ad</th>
                            <th>Soyad</th>
                            <th>Mezuniyet Yılı</th>
                            <th>Diploma Notu</th>
                            <th>Bölümü</th>

                            <th>Transcripti Gör</th>
                        </tr>
                        </thead>
                        <tbody>

                        <c:forEach items="${student}" var="student">
                            <tr>
                                <td><img src="/resources/img/${student.photo}" width="50px" height="50px"></td>
                                <td>${student.ogrNo}</td>
                                <td>${student.name}</td>
                                <td> ${student.surname}</td>
                                <td>${student.mezunyılı}</td>
                                <td>${student.diplomaNotu}</td>
                                <td>${student.departman.name}</td>
                                <td>
                                    <a class="btn btn-success btn-sm" href="/note/addNotes/${student.id}">Not Ekle</a>
                                    <a class="btn btn-secondary btn-sm" href="/note/notes/${student.id}">Notlar</a>
                                    <a class="btn btn-danger btn-sm" href="/student/deleteStudent/${student.id}">Sil</a>
                                </td>
                            </tr>
                        </c:forEach>



                        </tbody>
                    </table>
                </div>
            </div>
        </main>
    </div>
</div>



<jsp:include page="partial/footer.jsp">
    <jsp:param name="title" value="Main title" />
</jsp:include>

</body>
</html>