/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-09-05 12:47:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class handleData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"layui/css/layui.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"layui-layout-body\">\r\n");
      out.write("<div class=\"layui-layout layui-layout-admin\">\r\n");
      out.write("  <div class=\"layui-header\">\r\n");
      out.write("    <div class=\"layui-logo\">layui 后台布局</div>\r\n");
      out.write("    <!-- 头部区域（可配合layui已有的水平导航） -->\r\n");
      out.write("    <ul class=\"layui-nav layui-layout-right\">\r\n");
      out.write("      <li class=\"layui-nav-item\">\r\n");
      out.write("        <a href=\"javascript:;\">\r\n");
      out.write("          <img src=\"http://t.cn/RCzsdCq\" class=\"layui-nav-img\">\r\n");
      out.write("          贤心\r\n");
      out.write("        </a>\r\n");
      out.write("        <dl class=\"layui-nav-child\">\r\n");
      out.write("          <dd><a href=\"\">基本资料</a></dd>\r\n");
      out.write("          <dd><a href=\"\">安全设置</a></dd>\r\n");
      out.write("        </dl>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"layui-nav-item\"><a href=\"\">退了</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"layui-side layui-bg-black\">\r\n");
      out.write("    <div class=\"layui-side-scroll\">\r\n");
      out.write("      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->\r\n");
      out.write("      <ul class=\"layui-nav layui-nav-tree\"  lay-filter=\"test\">\r\n");
      out.write("        <li class=\"layui-nav-item layui-nav-itemed\">\r\n");
      out.write("          <a class=\"\" href=\"serviceManagement.jsp\">服务管理</a>\r\n");
      out.write("          <dl class=\"layui-nav-child\">\r\n");
      out.write("            <dd><a href=\"/servlet/create\">服务创建</a></dd>\r\n");
      out.write("            <dd><a href=\"list.jsp\">服务列表</a></dd>\r\n");
      out.write("            <dd class=\"layui-this\"><a href=\"\">服务处理</a></dd>\r\n");
      out.write("          </dl>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"layui-body\">\r\n");
      out.write("    <!-- 内容主体区域 -->\r\n");
      out.write("    <div style=\"padding: 15px;\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"layui/layui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("//JavaScript代码区域\r\n");
      out.write("\r\n");
      out.write("layui.use('element', function(){\r\n");
      out.write("  var element = layui.element;\r\n");
      out.write("  \r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
