package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpSession;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/header_css.css\">\n");
      out.write("                <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <div class=\"container-fullwidth\">\n");
      out.write("        <div class=\"row hidden-xs topper\">\n");
      out.write("            <div class=\"col-xs-7 col-sm-7\">\n");
      out.write("                <a href=\"index.jsp\"><img am-TopLogo alt=\"SECUREVIEW\"\n");
      out.write("                                         src=\"image/greenbank.png\" class=\"img-responsive\"></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Topper -->\n");
      out.write("        <!-- Navigation -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <nav class=\"navbar navbar-inverse\" role=\"navigation\"\n");
      out.write("                 style=\"margin-bottom: 0px;\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("                                data-target=\".navbar-ex1-collapse\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span> <span\n");
      out.write("                                class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("                                class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <a class=\"navbar-brand visible-xs-inline-block nav-logo\" href=\"/\"><img\n");
      out.write("                                src=\"/images/logo-dark-inset.png\" class=\"img-responsive\" alt=\"\"></a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                   \n");
      out.write("\n");
      out.write("                    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                    <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("                        <ul class=\"nav navbar-nav js-nav-add-active-class\">\n");
      out.write("                            <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                              \n");
      out.write("                            <li><a href=\"create_account.jsp\">Create new account</a></li>\n");
      out.write("                               \n");
      out.write("                            <li><a href=\"deposit.jsp\">Deposit</a></li>\n");
      out.write("                            <li><a href=\"withdraw.jsp\">Withdraw</a></li>\n");
      out.write("                            <li><a href=\"transfer.jsp\">Transfer</a></li>\n");
      out.write("                            <li><a href=\"close_account.jsp\">Close A/C</li>\n");
      out.write("                            <li class=\"visible-xs-block\"><a href=\"/about.html\">About\n");
      out.write("                                    Us</a></li>\n");
      out.write("                            <li class=\"visible-xs-block\"><a href=\"/careers.html\">Careers</a></li>\n");
      out.write("                            <li class=\"visible-xs-block\"><a href=\"/press-release.html\">Press\n");
      out.write("                                    Release</a></li>\n");
      out.write("                            <li class=\"visible-xs-block\"><a\n");
      out.write("                                    href=\"https://susteen7.zendesk.com/hc/en-us\">Support</a></li>\n");
      out.write("                            <li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("                                                    data-toggle=\"dropdown\">Company <b class=\"caret\"></b></a>\n");
      out.write("                                <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                                    <li><a href=\"about.html\">About Us</a></li>\n");
      out.write("                                    <li><a href=\"admin_login.jsp\">Admin panel</a></li>\n");
      out.write("                                </ul></li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                        <!-- If user is logged in this menu will be shown -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("                                                    data-toggle=\"dropdown\"> <span class=\"glyphicon glyphicon-user\"></span>\n");
      out.write("                                    <strong>Do Duc Canh</strong> <span\n");
      out.write("                                        class=\"glyphicon glyphicon-chevron-down\"></span>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <div class=\"navbar-login\">\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-md-4\">\n");
      out.write("                                                    <p class=\"text-center\">\n");
      out.write("                                                        <span class=\"glyphicon glyphicon-user icon-size\"></span>\n");
      out.write("                                                    </p>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-md-8\">\n");
      out.write("                                                    <p class=\"text-left\">\n");
      out.write("                                                        <strong>Ho Ten</strong>\n");
      out.write("                                                    </p>\n");
      out.write("                                                    <p class=\"text-left small\">gieomamsusong@gmail.com\n");
      out.write("                                                    </p>\n");
      out.write("                                                    <p class=\"text-left\">\n");
      out.write("                                                        <a href=\"profile.jsp\"\n");
      out.write("                                                           class=\"btn btn-primary btn-block btn-sm\">Profile</a>\n");
      out.write("                                                    </p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"divider navbar-login-session-bg\"></li>\n");
      out.write("                                        \n");
      out.write("                                    <li><a href=\"loan_request.jsp\">Loan request<span\n");
      out.write("                                                class=\"glyphicon glyphicon-list-alt pull-right\"></span></a></li>\n");
      out.write("                                           \n");
      out.write("                                    <li><a href=\"change_password.jsp\">Change Password<span\n");
      out.write("                                                class=\"glyphicon glyphicon-cog pull-right\"></span></a></li>\n");
      out.write("                                          \n");
      out.write("                                    <li class=\"divider\"></li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"logout.jsp\">Sign Out<span\n");
      out.write("                                                class=\"glyphicon glyphicon-log-out pull-right\"></span></a></li>\n");
      out.write("                                </ul></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <!-- End User menu -->\n");
      out.write("\n");
      out.write("                        <ul class=\"nav navbar-nav navbar-right hidden-xs\">\n");
      out.write("                            <a type=\"button\" class=\"navbar-btn btn btn-primary\"\n");
      out.write("                               am-latosans=\"bold\" href=\"login.jsp\">Login</a>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.navbar-collapse -->\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
