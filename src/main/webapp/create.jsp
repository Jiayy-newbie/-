<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="${pageContext.request.contextPath}/"/>
 <link rel="stylesheet" href="layui/css/layui.css" media="all">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">layui 后台布局</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
          贤心
        </a>
        <dl class="layui-nav-child">
          <dd><a href="">基本资料</a></dd>
          <dd><a href="">安全设置</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="">退了</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
        <li class="layui-nav-item layui-nav-itemed">
          <a class="" href="serviceManagement.jsp">服务管理</a>
          <dl class="layui-nav-child">
            <dd><a href="createService.jsp">服务创建</a></dd>
            <dd><a href="list.jsp">服务列表</a></dd>
            <dd><a href="">服务处理</a></dd>
          </dl>
        </li>
      </ul>
    </div>
  </div>
  
  <div class="layui-body">
    <!-- 内容主体区域 -->
    <div style="padding: 15px;">
    	<h3><b>服务创建</b></h3><br/>
    	<div class="layui-form-item">
    	 <form  class="layui-form" action="" lay-filter="example">
    		 <div class="layui-row">
    		  <div class="layui-col-md4">
			      <div class="grid-demo grid-demo-bg1">
			      	<label class="layui-form-label">服务编号</label>
					    <div class="layui-input-block">
					      <input type="text" name="id" required  lay-verify="required" placeholder="请输入标题" autocomplete="off" class="layui-input">
					    </div>
			      </div>
			    </div>
			  </div>
			  <br>
		     <div class="layui-form-item">
			    <label class="layui-form-label">服务类型</label>
			    <div class="layui-input-block">
			      <select name="interest" lay-filter="aihao">
			        <option value=""></option>
			        <option value="请选择">请选择</option>
			        <option value="咨询" selected="">咨询</option>
			        <option value="建议">建议</option>
			        <option value="投诉">投诉</option>
			      </select>
			    </div>
			  </div>
			  <div class="layui-form-item">
			    <label class="layui-form-label">客户姓名</label>
			    <div class="layui-input-block">
			      <input type="text" name="curname" required  lay-verify="required" placeholder="请输入客户名" autocomplete="off" class="layui-input">
			    </div>
			  </div>
			  <div class="layui-form-item">
			    <label class="layui-form-label">服务状态</label>
			    <div class="layui-input-block">
			      <input type="text" name="title" required  lay-verify="required" autocomplete="off" class="layui-input">
			    </div>
			  </div>
			   <br>
			   <div class="layui-form-item layui-form-text">
				    <label class="layui-form-label">服务内容</label>
				    <div class="layui-input-block">
				      <textarea placeholder="请输入服务内容" class="layui-textarea"></textarea>
				    </div>
				  </div>
			   <div class="layui-form-item">
			    <label class="layui-form-label">创建人</label>
			    <div class="layui-input-block">
			      <input type="text" name="title" required  lay-verify="required"  autocomplete="off" class="layui-input">
			    </div>
			  </div>
			  <div class="layui-form-item">
			    <label class="layui-form-label">创建时间</label>
			    <div class="layui-input-block">
			      <input type="text" name="title" required  lay-verify="required" autocomplete="off" class="layui-input">
			    </div>
			  </div>
			  <div class="layui-form-item">
			    <div class="layui-input-block">
			      <button class="layui-btn " lay-submit="" lay-filter="demo1">提交服务</button>
			    </div>
			  </div>
			  </form>
		</div>
    </div>
  </div>
  
</div>
<form class="layui-form" action="">
  <div class="layui-form-item">
    <label class="layui-form-label">单行输入框</label>
    <div class="layui-input-block">
      <input type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">验证必填项</label>
    <div class="layui-input-block">
      <input type="text" name="username" lay-verify="required" lay-reqtext="用户名是必填项，岂能为空？" placeholder="请输入" autocomplete="off" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">验证手机</label>
      <div class="layui-input-inline">
        <input type="tel" name="phone" lay-verify="required|phone" autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">验证邮箱</label>
      <div class="layui-input-inline">
        <input type="text" name="email" lay-verify="email" autocomplete="off" class="layui-input">
      </div>
    </div>
  </div>
  
  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">多规则验证</label>
      <div class="layui-input-inline">
        <input type="text" name="number" lay-verify="required|number" autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">验证日期</label>
      <div class="layui-input-inline">
        <input type="text" name="date" id="date" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-inline">
      <label class="layui-form-label">验证链接</label>
      <div class="layui-input-inline">
        <input type="tel" name="url" lay-verify="url" autocomplete="off" class="layui-input">
      </div>
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">验证身份证</label>
    <div class="layui-input-block">
      <input type="text" name="identity" lay-verify="identity" placeholder="" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">自定义验证</label>
    <div class="layui-input-inline">
      <input type="password" name="password" lay-verify="pass" placeholder="请输入密码" autocomplete="off" class="layui-input">
    </div>
    <div class="layui-form-mid layui-word-aux">请填写6到12位密码</div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">单行选择框</label>
    <div class="layui-input-block">
      <select name="interest" lay-filter="aihao">
        <option value=""></option>
        <option value="0">写作</option>
        <option value="1" selected="">阅读</option>
        <option value="2">游戏</option>
        <option value="3">音乐</option>
        <option value="4">旅行</option>
      </select>
    </div>
  </div>
  
  <div class="layui-form-item layui-form-text">
    <label class="layui-form-label">普通文本域</label>
    <div class="layui-input-block">
      <textarea placeholder="请输入内容" class="layui-textarea"></textarea>
    </div>
  </div>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>

<script src="layui/layui.js" charset="utf-8"></script>
<script>
	layui.use('form',function(){
		var form = layui.form
	})
</script>
</body>
</html>