package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>BK Bank</title>\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/png\" href=\"image/favicon.png\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main_css.css\">\n");
      out.write("        <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <script\n");
      out.write("        src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fullwidth\" style=\"margin-top: 0 px\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div id=\"carousel-example-generic\" class=\"carousel slide\"\n");
      out.write("                         data-ride=\"carousel\">\n");
      out.write("\n");
      out.write("                        <ol class=\"carousel-indicators\">\n");
      out.write("                            <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\"\n");
      out.write("                                class=\"active\"></li>\n");
      out.write("                            <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\n");
      out.write("                            <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\n");
      out.write("                        </ol>\n");
      out.write("\n");
      out.write("                        <div class=\"carousel-inner\">\n");
      out.write("                            <div class=\"item active\">\n");
      out.write("                                <img src=\"image/Current-Deposit1.jpg\" alt=\"First slide\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <img src=\"image/Savings-Deposit1.jpg\" alt=\"Second slide\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <a class=\"left carousel-control\" href=\"#carousel-example-generic\"\n");
      out.write("                           data-slide=\"prev\"> <span\n");
      out.write("                                class=\"glyphicon glyphicon-chevron-left\"></span></a><a\n");
      out.write("                            class=\"right carousel-control\" href=\"#carousel-example-generic\"\n");
      out.write("                            data-slide=\"next\"><span\n");
      out.write("                                class=\"glyphicon glyphicon-chevron-right\"> </span> </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Footer start here -->\n");
      out.write("            <div class=\"row\" style=\"margin-top: 50px;\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
