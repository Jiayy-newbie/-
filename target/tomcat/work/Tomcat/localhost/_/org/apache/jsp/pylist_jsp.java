/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-09-07 00:57:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pylist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <div class=\"layui-logo\">客户关系后台管理</div>\r\n");
      out.write("    <a style=\"line-height:1.6em;margin-top:3px;float:left;\" onclick=\"location.reload()\" title=\"刷新\">\r\n");
      out.write("    </a>\r\n");
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
      out.write("          <a href=\"serviceManagement.jsp\">服务管理</a>\r\n");
      out.write("          <dl class=\"layui-nav-child\">\r\n");
      out.write("           <dd><a href=\"/servlet/create\">服务创建</a></dd>\r\n");
      out.write("            <dd ><a href=\"list.jsp\">服务列表</a></dd>\r\n");
      out.write("            <dd class=\"layui-this\"><a href=\"\">拼音查找</a></dd>\r\n");
      out.write("          </dl>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"layui-body\">\r\n");
      out.write("  \t\t<div class=\"layui-card\">\r\n");
      out.write("\t         <div class=\"layui-card-body \">\r\n");
      out.write("\t             <div class=\"layui-form layui-col-space5\">\r\n");
      out.write("\t                   查询：<div class=\"layui-inline layui-show-xs-block\">\r\n");
      out.write("\t                     <input class=\"layui-input\" autocomplete=\"off\" placeholder=\"请输入客户名称\" name=\"name\" id=\"demoReload\"></div>\r\n");
      out.write("\t                 <div class=\"layui-inline layui-show-xs-block\">\r\n");
      out.write("\t                     <button class=\"layui-btn\">\r\n");
      out.write("\t                         <i class=\"layui-icon\" id=\"btnAdd\" data-type=\"reload\">搜索</i></button>\r\n");
      out.write("\t                 </div>\r\n");
      out.write("\t             </div>\r\n");
      out.write("\t         </div>\r\n");
      out.write("\t         <div class=\"layui-card-body \">\r\n");
      out.write("\t         <div style=\"padding: 15px;\">\r\n");
      out.write("\t             <table id=\"demo\" lay-filter=\"test\"></table>\r\n");
      out.write("\t             <script type=\"text/html\" id=\"barDemo\">\r\n");
      out.write("\t\t\t\t\t\t{{# if(d.state.name == '已结束'){}}\r\n");
      out.write("\t\t\t\t\t\t<a class=\"layui-btn layui-btn-xs layui-btn-disabled\" >处理工单</a>\r\n");
      out.write("\t\t\t\t\t\t <a class=\"layui-btn layui-btn-danger layui-btn-xs\" lay-event=\"del\">删除</a>\r\n");
      out.write("\t\t\t\t\t\t{{#}}}\r\n");
      out.write("\t\t\t\t\t\t{{# if(d.state.name != '已结束'){}}\r\n");
      out.write(" \t\t\t\t\t\t<a  class=\"layui-btn layui-btn-xs\" lay-event=\"edit\">处理工单</a>\r\n");
      out.write("\t\t\t\t\t\t{{#}}}\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("\t\t         </div>\r\n");
      out.write("\t\t     </div>\r\n");
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
      out.write("layui.use('table', function(){\r\n");
      out.write("  var table = layui.table;\r\n");
      out.write("  \r\n");
      out.write("  //第一个实例\r\n");
      out.write("  table.render({\r\n");
      out.write("    elem: '#demo'\r\n");
      out.write("    ,height: 312\r\n");
      out.write("    ,url: 'pinyin/list' //数据接口\r\n");
      out.write("    \t,page : true //开启分页\r\n");
      out.write("\t\t,limit:5,\r\n");
      out.write("\t\tlimits : [ 2, 3, 5, 10 ]\r\n");
      out.write("    ,cols: [[\r\n");
      out.write("\t      {field:'id', width:250, title: '编号', sort: true}\r\n");
      out.write("\t      ,{field:'curname',  title: '客户名'}\r\n");
      out.write("\t      ,{field:'servtitle', title: '概要', sort: true}\r\n");
      out.write("\t      ,{field:'servtype',  title: '类型'}\r\n");
      out.write("\t      ,{field:'name',  title: '创建人', minWidth: 150,templet: \"<div>{{d.admin.name}}</div>\"}\r\n");
      out.write("\t      ,{field:'cretime', width:200, title: '创建时间', sort: true}\r\n");
      out.write("\t      ,{field:'stateid', width:100, title: '状态值', templet:\"<div>{{d.state.name}}</div>\", sort: true}\r\n");
      out.write("\t      , {field : 'cz',title : '工单操作',toolbar : '#barDemo'}\r\n");
      out.write("\t ]]\r\n");
      out.write("\t  , id: 'testReload'\r\n");
      out.write("\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write(" var $ = layui.$, active = {\r\n");
      out.write("          reload: function () {\r\n");
      out.write("              var demoReload = $('#demoReload');\r\n");
      out.write("\r\n");
      out.write("              //执行重载\r\n");
      out.write("              table.reload('testReload', {\r\n");
      out.write("                  page: {\r\n");
      out.write("                      curr: 1 //重新从第 1 页开始\r\n");
      out.write("                  }\r\n");
      out.write("                  , where: {\r\n");
      out.write("                      name: demoReload.val(),\r\n");
      out.write("                  }\r\n");
      out.write("              });\r\n");
      out.write("          },\r\n");
      out.write("      };\r\n");
      out.write("\r\n");
      out.write("      $('#btnAdd').on('click', function () {\r\n");
      out.write("          var type = $(this).data('type');\r\n");
      out.write("          active[type] ? active[type].call(this) : '';\r\n");
      out.write("      });\r\n");
      out.write("      \r\n");
      out.write("      /* //监听事件\r\n");
      out.write("      table.on('tool(test)', function(obj){\r\n");
      out.write("      \tvar data=obj.data;\r\n");
      out.write("      \tlayEvent=obj.event;\r\n");
      out.write("      \tif(layEvent =='del'){\r\n");
      out.write("      \t\tlayer.confirm('确认删除么',function(index){\r\n");
      out.write("      \t\t\t$.post(\r\n");
      out.write("      \t\t\t\t\"servlet/del\"+data.cretime,\r\n");
      out.write("      \t\t\t\t{},\r\n");
      out.write("      \t\t\t\tfunction(d){\r\n");
      out.write("      \t\t\t\t\talert(d?\"ok\":\"err\");\r\n");
      out.write("      \t\t\t\t\tlocation.reload();\r\n");
      out.write("      \t\t\t\t},\r\n");
      out.write("      \t\t\t\t\"json\"\r\n");
      out.write("      \t\t\t);\r\n");
      out.write("      \t\t});\r\n");
      out.write("      \t}else if(layEvent === 'edit'){\r\n");
      out.write("      \t\tlayer.open({\r\n");
      out.write("      \t\t\ttype:2,\r\n");
      out.write("      \t\t\tskin:\"demo-class\",\r\n");
      out.write("      \t\t\ttitle:\"处理操作\",\r\n");
      out.write("      \t\t\tmaxmin:true,\r\n");
      out.write("      \t\t\tshadeClose:true,\r\n");
      out.write("      \t\t\tarea:['800px' ,'500px'],\r\n");
      out.write("      \t\t\tcontent:'/servlet/get/'+data.id,\r\n");
      out.write("      \t\t});\r\n");
      out.write("      \t}\r\n");
      out.write("      \t\r\n");
      out.write("      }); */\r\n");
      out.write("  \r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
