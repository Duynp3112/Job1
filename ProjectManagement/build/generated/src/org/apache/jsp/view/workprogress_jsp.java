package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class workprogress_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Jira-like Task Manager</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/styles.css\">\n");
      out.write("    </head>\n");
      out.write("    <div class=\"board\">\n");
      out.write("        <div class=\"column backlog\">\n");
      out.write("            <div class=\"column-header\">\n");
      out.write("                <span>Backlog</span>\n");
      out.write("                <button class=\"add-task-btn\">Add Task</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"task-list\">\n");
      out.write("                <!-- Tasks will be dynamically added here -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"column todo\">\n");
      out.write("            <div class=\"column-header\">\n");
      out.write("                <span>To-do</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"task-list\">\n");
      out.write("                <!-- Tasks will be dynamically added here -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"column in-progress\">\n");
      out.write("            <div class=\"column-header\">\n");
      out.write("                <span>In Progress</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"task-list\">\n");
      out.write("                <!-- Tasks will be dynamically added here -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"column done\">\n");
      out.write("            <div class=\"column-header\">\n");
      out.write("                <span>Done</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"task-list\">\n");
      out.write("                <!-- Tasks will be dynamically added here -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"overlay\">\n");
      out.write("        <div class=\"modal\">\n");
      out.write("            <span class=\"close-btn\">&times;</span>\n");
      out.write("            <input type=\"text\" id=\"taskInput\" placeholder=\"Enter task...\">\n");
      out.write("            <button id=\"submitTask\">Add Task</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("    <script src=\"https://code.jquery.com/ui/1.13.1/jquery-ui.min.js\"></script>\n");
      out.write("    <script src=\"../assets/js/script.js\"></script>\n");
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
