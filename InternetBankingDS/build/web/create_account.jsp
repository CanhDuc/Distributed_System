<%-- 
    Document   : create_account
    Created on : Nov 25, 2018, 3:14:49 PM
    Author     : Duc Canh HNA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Create new account</title>
        <link rel="shortcut icon" type="image/png" href="image/favicon.png" />
        <link rel="stylesheet" type="text/css" href="css/create_account.css">
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <script
        src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/passwordChecker.js"></script>
    </head>
    <body>
        <div class="row">
            <jsp:include page="header.jsp" />
        </div>
        <div class="container-fullwidth">
            <div class="row">
                <div class="account col-md-6 col-md-offset-3">
                    <h1 class="well text-center">Tạo tài khoản</h1>
                    <div class="col-lg-12 well">
                        <div class="row">
                            <form action="CreateAccountServlet" method="post">
                                <div class="col-sm-12">
                                    <div class="row">
                                        <div class="col-sm-4 form-group">
                                            <label class="required">Họ</label><input type="text"
                                                                                             placeholder="Ex : Đỗ" class="form-control"
                                                                                             name="first_name" required>
                                        </div>
                                        <div class="col-sm-4 form-group">
                                            <label class="required">Tên đệm</label> <input type="text"
                                                                                             placeholder="Ex : Đức" class="form-control"
                                                                                             name="middle_name" required>
                                        </div>
                                        <div class="col-sm-4 form-group">
                                            <label class="required">Tên</label> <input type="text"
                                                                                             placeholder="Ex : Cảnh" class="form-control"
                                                                                             name="last_name" required>
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label class="required">Địa chỉ</label>
                                        <textarea placeholder="Enter Address Here.." rows="3"
                                                  class="form-control" name="address" required></textarea>
                                    </div>
                                    <div class="row">
                                        <div class="col-sm-6 form-group">
                                            <label>Ngày sinh</label> <input type="text"
                                                                       placeholder="Enter Birthday Here.." class="form-control"
                                                                       name="birthday">
                                        </div>
                                        <div class="col-sm-6 form-group">
                                            <label class="required">Giới tính</label>
                                            <div class="input-group-btn">
                                                <select class="form-control btn btn-default" name="gender" required>
                                                    <option>Name</option>
                                                    <option>Nữ</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label class="required">Số điện thoại</label> <input type="tel"
                                                                                            placeholder="Enter Phone Number Here.." class="form-control"
                                                                                            name="phone" required>
                                    </div>
                                    <div class="form-group">
                                        <label class="required">Email</label> <input
                                            type="text" placeholder="Enter Email Address Here.."
                                            class="form-control" name="email" required>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label class="required">Số tài khoản</label> <input type="text"
                                                                                         placeholder="Enter Account Number Here.." class="form-control"
                                                                                         name="account_number" required>
                                    </div>
                                    <div class="row">
                                        <div class="col-sm-6 form-group">
                                            <label class="required">Mật khẩu</label> <input
                                                type="password" required placeholder="Enter Password Here.." min="5"
                                                class="form-control" name="password" id="password">
                                        </div>
                                        <div class="col-sm-6 form-group">
                                            <label class="required">Nhập lại mật khẩu</label> <input
                                                type="password" required
                                                placeholder="Enter Re-password Here.." class="form-control"
                                                name="re_password" id="re_password"
                                                onkeyup="checkPass(); return false;">
                                            <p id="confirmMessage" style="margin-top: 10x;"></p>
                                        </div>
                                    </div>
                                    
                                    <div class="row">
                                        <div class="col-sm-12 form-group">
                                            <label class="required">Số tiền</label> <input type="number"
                                                                                          placeholder="Enter Intial Amount Here.." class="form-control"
                                                                                          name="amount" required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <span class="text-muted"><em><span
                                                    style="color: red; font-size: 14px">*</span> Indicates
                                                required field</em> </span>
                                    </div>
                                    <%
                                        String not_match = (String) request.getAttribute("not_match");
                                        System.out.println(not_match);
                                        if (not_match != null && not_match.equals("yes")) {
                                    %>
                                    <div class="form-group">
                                        <p class="bg-danger text-center text-danger"
                                           style="font-size: 18px;">Password doesn't match</p>
                                    </div>
                                    <%
                                        }
                                    %>
                                    <input type="submit" class="btn btn-lg btn-info">
                                    </input>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Footer start here -->
            <div class="row" style="margin-top: 50px;">
                <jsp:include page="footer.jsp"></jsp:include>
            </div>
        </div>
    </body>
</html>