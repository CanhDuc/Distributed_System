package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_005faccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Create new account</title>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"image/favicon.png\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/create_account.css\">\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <script\n");
      out.write("        src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/passwordChecker.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fullwidth\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"account col-md-6 col-md-offset-3\">\n");
      out.write("                    <h1 class=\"well text-center\">Create New Account</h1>\n");
      out.write("                    <div class=\"col-lg-12 well\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <form action=\"CreateAccountServlet\" method=\"post\">\n");
      out.write("                                <div class=\"col-sm-12\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-6 form-group\">\n");
      out.write("                                            <label class=\"required\">First Name</label><input type=\"text\"\n");
      out.write("                                                                                             placeholder=\"Enter First Name Here..\" class=\"form-control\"\n");
      out.write("                                                                                             name=\"first_name\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-6 form-group\">\n");
      out.write("                                            <label class=\"required\">Last Name</label> <input type=\"text\"\n");
      out.write("                                                                                             placeholder=\"Enter Last Name Here..\" class=\"form-control\"\n");
      out.write("                                                                                             name=\"last_name\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"required\">Address</label>\n");
      out.write("                                        <textarea placeholder=\"Enter Address Here..\" rows=\"3\"\n");
      out.write("                                                  class=\"form-control\" name=\"address\" required></textarea>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-4 form-group\">\n");
      out.write("                                            <label>City</label> <input type=\"text\"\n");
      out.write("                                                                       placeholder=\"Enter City Name Here..\" class=\"form-control\"\n");
      out.write("                                                                       name=\"city\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-4 form-group\">\n");
      out.write("                                            <label class=\"required\">Branch Name</label>\n");
      out.write("                                            <div class=\"input-group-btn\">\n");
      out.write("                                                <select class=\"form-control btn btn-default\" name=\"branch\" required>\n");
      out.write("                                                    <option>Dhaka</option>\n");
      out.write("                                                    <option>Khulna</option>\n");
      out.write("                                                    <option>Chittagong</option>\n");
      out.write("                                                    <option>Rajshahi</option>\n");
      out.write("                                                    <option>Sylhet</option>\n");
      out.write("                                                    <option>Mymensingh</option>\n");
      out.write("                                                    <option>Rangpur</option>\n");
      out.write("                                                    <option>Comilla</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-4 form-group\">\n");
      out.write("                                            <label>Zip</label> <input type=\"text\"\n");
      out.write("                                                                      placeholder=\"Enter Zip Code Here..\" class=\"form-control\"\n");
      out.write("                                                                      name=\"zip\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"required\">User Name</label> <input type=\"text\"\n");
      out.write("                                                                                         placeholder=\"Enter User Name Here..\" class=\"form-control\"\n");
      out.write("                                                                                         name=\"username\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-6 form-group\">\n");
      out.write("                                            <label class=\"required\">Password</label> <input\n");
      out.write("                                                type=\"password\" required placeholder=\"Enter Password Here..\" min=\"5\"\n");
      out.write("                                                class=\"form-control\" name=\"password\" id=\"password\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-6 form-group\">\n");
      out.write("                                            <label class=\"required\">Re-password</label> <input\n");
      out.write("                                                type=\"password\" required\n");
      out.write("                                                placeholder=\"Enter Re-password Here..\" class=\"form-control\"\n");
      out.write("                                                name=\"re_password\" id=\"re_password\"\n");
      out.write("                                                onkeyup=\"checkPass(); return false;\">\n");
      out.write("                                            <p id=\"confirmMessage\" style=\"margin-top: 10x;\"></p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"required\">Phone Number</label> <input type=\"tel\"\n");
      out.write("                                                                                            placeholder=\"Enter Phone Number Here..\" class=\"form-control\"\n");
      out.write("                                                                                            name=\"phone\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"required\">Email Address</label> <input\n");
      out.write("                                            type=\"text\" placeholder=\"Enter Email Address Here..\"\n");
      out.write("                                            class=\"form-control\" name=\"email\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-6 form-group\">\n");
      out.write("                                            <label class=\"required\">Choose Account type</label>\n");
      out.write("                                            <div class=\"input-group-btn\">\n");
      out.write("                                                <select class=\"form-control btn btn-default\"\n");
      out.write("                                                        name=\"account_type\" required>\n");
      out.write("                                                    <option>Saving Account</option>\n");
      out.write("                                                    <option>Current Account</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-sm-6 form-group\">\n");
      out.write("                                            <label class=\"required\">Amount</label> <input type=\"number\"\n");
      out.write("                                                                                          placeholder=\"Enter Intial Amount Here..\" class=\"form-control\"\n");
      out.write("                                                                                          name=\"amount\" required>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <span class=\"text-muted\"><em><span\n");
      out.write("                                                    style=\"color: red; font-size: 14px\">*</span> Indicates\n");
      out.write("                                                required field</em> </span>\n");
      out.write("                                    </div>\n");
      out.write("                                    ");

                                        String not_match = (String) request.getAttribute("not_match");
                                        System.out.println(not_match);
                                        if (not_match != null && not_match.equals("yes")) {
                                    
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <p class=\"bg-danger text-center text-danger\"\n");
      out.write("                                           style=\"font-size: 18px;\">Password doesn't match</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-lg btn-info\">\n");
      out.write("                                    </input>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Footer start here -->\n");
      out.write("            <div class=\"row\" style=\"margin-top: 50px;\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
