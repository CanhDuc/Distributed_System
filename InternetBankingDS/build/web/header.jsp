<%-- 
    Document   : header
    Created on : Nov 25, 2018, 2:07:11 PM
    Author     : Duc Canh HNA
--%>

<%@page import="bank.model.Account"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@page import="com.green.bank.model.AccountModel"%>--%>
<%@page import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../css/header_css.css">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

    </head>
    <div class="container-fullwidth">
        <div class="row hidden-xs topper">
            <div class="col-xs-7 col-sm-7">
                <a href="index.jsp"><img am-TopLogo alt="SECUREVIEW"
                                         src="image/greenbank.png" class="img-responsive"></a>
            </div>
        </div>
        <!-- End Topper -->
        <!-- Navigation -->
        <div class="row">
            <nav class="navbar navbar-inverse" role="navigation"
                 style="margin-bottom: 0px;">
                <div class="container">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse"
                                data-target=".navbar-ex1-collapse">
                            <span class="sr-only">Toggle navigation</span> <span
                                class="icon-bar"></span> <span class="icon-bar"></span> <span
                                class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand visible-xs-inline-block nav-logo" href="/"><img
                                src="/images/logo-dark-inset.png" class="img-responsive" alt=""></a>
                    </div>

                    <%!Account acc = null;%>

                    <%
                        acc = (Account) session.getAttribute("userDetails");
                    %>

                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse navbar-ex1-collapse">
                        <ul class="nav navbar-nav js-nav-add-active-class">
                            <li><a href="index.jsp">Trang chủ</a></li>

                            <%
                                if ((acc != null) && (acc.getLevel() == 1)) {
                            %>
                            <li><a href="create_account.jsp">Tạo tài khoản</a></li>
                            <li><a href="deposit.jsp">Gửi tiền</a></li>
                                <%
                                } else {
                                    if ((acc != null) && (acc.getLevel() == 0)) {
                                %>
                            <li><a href="withdraw.jsp">Rút tiền</a></li>
                                <%
                                        }
                                    }
                                %>

                            <li><a href="">About Us</li>

                            <li class="dropdown">
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="about.html">About Us</a></li>
                                    <li><a href="admin_login.jsp">Admin panel</a></li>
                                </ul>
                            </li>
                        </ul>

                        <!-- If user is logged in this menu will be shown -->

                        <%
                            if (acc != null) {
                        %>
                        <ul class="nav navbar-nav navbar-right">
                            <li class="dropdown"><a href="#" class="dropdown-toggle"
                                                    data-toggle="dropdown"> <span class="glyphicon glyphicon-user"></span>
                                    <strong>Số tài khoản : <%=acc.getAc_no()%></strong> <span
                                        class="glyphicon glyphicon-chevron-down"></span>
                                </a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <div class="navbar-login">
                                            <div class="row">
                                                <div class="col-md-12">
                                                    <p class="text-center">
                                                        <span class="glyphicon glyphicon-user icon-size"></span>
                                                    </p>
                                                </div>
                                                <div class="col-md-12">
                                                    <p class="text-left">
                                                        <a href="profile.jsp"
                                                           class="btn btn-primary btn-block btn-sm">Profile</a>
                                                    </p>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                    <li class="divider navbar-login-session-bg"></li>

                                    <% if ((acc != null) && (acc.getLevel() == 0)) { %>
                                    <li><a href="loan_request.jsp">Số dư<span
                                                class="glyphicon glyphicon-list-alt pull-right"></span></a>
                                    </li>
                                    <% } %>

                                    <li>
                                        <a href="change_password.jsp">Đổi mật khẩu<span
                                                class="glyphicon glyphicon-cog pull-right"></span></a>
                                    </li>

                                    <li class="divider"></li>
                                    <li><a href="logout.jsp">Đăng xuất<span
                                                class="glyphicon glyphicon-log-out pull-right"></span></a>
                                    </li>
                                </ul>
                        </ul>
                        <!-- End User menu -->
                        <%
                        } else {
                        %>
                        <ul class="nav navbar-nav navbar-right hidden-xs">
                            <a type="button" class="navbar-btn btn btn-primary"
                               am-latosans="bold" href="login.jsp">Login</a>
                        </ul>
                        <%
                            }
                        %>
                    </div>
                    <!-- /.navbar-collapse -->
                </div>
            </nav>
        </div>
    </div>
</html>