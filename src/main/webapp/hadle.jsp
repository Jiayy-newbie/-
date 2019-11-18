<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="${pageContext.request.contextPath}/"/>
<link rel="stylesheet" href="layui/css/layui.css">
</head>
<body>
<div class="layui-container">
	<form class="layui-form" action="/servlet/addr" method="post" lay-filter="example">
	<input type="hidden" name="uid" value="${ser.uid }">
	<input type="hidden" name="cretime" value="${ser.cretime }">
	<input type="hidden" name="curname" value="${ser.curname }">
	<input type="hidden" name="servtype" value="${ser.servtype }">
	<input type="hidden" name="id" value="${ser.id }">
	<input type="hidden" name="servtitle" value="${ser.servtitle }">
	<input type="hidden" name="servtitle" value="${ser.servtitle }">
	<input type="hidden" name="stateid" value="${ser.stateid }">
		<div class="layui-row">
		    <div class="layui-col-md9"  align="center">
		      <div class="grid-demo grid-demo-bg1">
		           <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
					  <legend><b>创建人ID：${ser.uid }   创建时间：${ser.cretime }  服务类型：${ser.servtype }</b></legend>
					</fieldset>
					<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
					  <legend><b>工单历史记录  工单记录号：${ser.id }</b></legend>
					</fieldset>
					<ul class="layui-timeline">
					  <li class="layui-timeline-item">
					    <i class="layui-icon layui-timeline-axis"></i>
					    <div class="layui-timeline-content layui-text">
					      <h3 class="layui-timeline-title" style="float: left;">${cretime }</h3>
					      <p>
					    <%--   <br>
					      ${ser.reService.sertext } --%>
					       <i class="layui-icon"></i>
					      </p>
					    </div>
					  </li>
					</ul> 
				 	<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
					  <legend>请简述您遇到的问题</legend>
					</fieldset>
				 	<div class="layui-form-text">
							<textarea  class="layui-textarea" style="min-height: 150px" required lay-verify="required"
								name="sertext"></textarea>
					</div>
					<br>
					<div class="layui-form-item">
						<button class="layui-btn" lay-submit="" lay-filter="demo1">提交服务</button>
					</div>
			  </div>
		    </div>
		</div>  
	</form>  
</div>

</body>
</html>