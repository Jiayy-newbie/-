<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<base href="${pageContext.request.contextPath}/"/>
<link rel="stylesheet" href="layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">客户关系后台管理</div>
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
            <dd class="layui-this"><a href="/servlet/create">服务创建</a></dd>
            <dd><a href="list.jsp">服务列表</a></dd>
            <dd><a href="pylist.jsp">拼音查找</a></dd>
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
    	 <form  class="layui-form" action="servlet/add" method="post" required lay-filter="example" >
			      <div class="layui-form-item">
			      	<label class="layui-form-label">服务编号</label>
				    <div class="layui-input-block">
				      <input type="text" name="id" value="${oid }"  autocomplete="off" readonly="readonly" class="layui-input">
				    </div>
			      </div>
			  
			  <!-- 服务类型 -->
		      <div class="layui-form-item">
			    <label class="layui-form-label">服务类型</label>
			    <div class="layui-input-block">
			      <select name="servtype" required lay-filter="aihao">
			        <option value=""></option>
			        <option value="请选择" selected=""></option>
			        <option value="咨询" >咨询</option>
			        <option value="建议">建议</option>
			        <option value="投诉">投诉</option>
			      </select>
			    </div>
			  </div>
			  
			  <!--  客户姓名 -->
			  <div class="layui-form-item">
			    <label class="layui-form-label">客户姓名</label>
			    <div class="layui-input-block">
			      <input type="text" name="curname" placeholder="请输入客户名" required lay-verify="title" autocomplete="off" class="layui-input">
			    </div>
			  </div>
			  
			  <!-- 服务状态 -->
			  <div class="layui-form-item">
			    <label class="layui-form-label">服务状态</label>
			    <div class="layui-input-block">
			      <input type="text" required lay-verify="required" value="${state.name }" class="layui-input" readonly="readonly" >
			      <input type="hidden" name="stateid"  class="layui-input" value="${state.id }" readonly="readonly"  class="layui-input" >
			    </div>
			  </div>
			  
			  <!-- 服务概要 -->
			  <div class="layui-form-item">
			    <label class="layui-form-label">服务概要</label>
			    <div class="layui-input-block">
			      <input type="text" name="servtitle"  placeholder="输入格式支持汉字,数字,英文" autocomplete="off" class="layui-input" >
			    </div>
			  </div>
			  
			  <!-- 服务内容 -->
			   <div class="layui-form-item layui-form-text">
				    <label class="layui-form-label">服务内容</label>
				    <div class="layui-input-block">
				      <textarea name="sertext" required lay-verify="required" placeholder="请输入服务内容" class="layui-textarea"></textarea>
				    </div>
				  </div>
			   <div class="layui-form-item">
			    <label class="layui-form-label">创建人</label>
			    <div class="layui-input-block">
			      <input type="text"  value="${admin.name }" lay-verify="required" class="layui-input"readonly="readonly">
			      <input type="hidden" name="uid" value="${admin.id }"  class="layui-input"readonly="readonly">
			    </div>
			  </div>
			  <div class="layui-form-item">
			    <label class="layui-form-label">创建时间</label>
			    <div class="layui-input-block">
			      <input type="text" name="cretime" value="${format2 }" required  lay-verify="required" autocomplete="off" class="layui-input" readonly="readonly">
			    </div>
			  </div>
			  <div class="layui-form-item">
			    <div class="layui-input-block">
			      <button class="layui-btn " lay-filter="demo1">提交服务</button>
			    </div>
			  </div>
			  </form>
			 <%--  <form class="layui-form" action="/servlet/add" method="post"
							lay-filter="example">

							<!-- 服务编号 -->
							<div class="layui-form-item">
								<label class="layui-form-label">服务编号</label>
								<div class="layui-input-block">
									<input type="text" name="id" lay-verify="title"
										autocomplete="off" value="${oid}" class="layui-input">
								</div>
							</div>
							<!-- 服务类型 -->
							 <div class="layui-form-item">
						    <label class="layui-form-label">服务类型</label>
						    <div class="layui-input-block">
						      <select name="servtype" lay-filter="aihao">
						      
						        <option value="投诉">投诉</option>
						        <option value="咨询" selected="">咨询</option>
						        <option value="建议">建议</option>
						        
						      </select>
						    </div>
						  </div>
							<!--  客户姓名 -->
							<div class="layui-form-item">
								<label class="layui-form-label">客户姓名</label>
								<div class="layui-input-block">
									<input type="text" name="curname" lay-verify="title"
										autocomplete="off" placeholder="请输入客户名" class="layui-input">
								</div>
							</div>
							<!-- 服务状态 -->
							<div class="layui-form-item">
								<label class="layui-form-label">服务状态</label>
								<div class="layui-input-block">
									<input type="text" name="stateid" lay-verify="title"
										autocomplete="off" value="${state.name}" class="layui-input" disabled="disabled">
										<input type="hidden" name="stateid" lay-verify="title"
										autocomplete="off" value="${state.id}" class="layui-input" >
								</div>
							</div>
							<!-- 服务概要 -->
							<div class="layui-form-item">
								<label class="layui-form-label">服务概要</label>
								<div class="layui-input-block">
									<input type="text" name="servtitle" lay-verify="title"
										autocomplete="off" placeholder="输入格式支持汉字，数字，英文"
										class="layui-input">
								</div>
							</div>
							<!-- 服务内容 -->
							<div class="layui-form-item layui-form-text">
								<label class="layui-form-label">服务内容</label>
								<div class="layui-input-block">
									<textarea placeholder="请输入服务内容" class="layui-textarea"
										name="sertext"></textarea>
								</div>
							</div>
							<!-- 创建人 -->
							<div class="layui-form-item">
								<label class="layui-form-label">创建人</label>
								<div class="layui-input-block">
									<input type="text" name="uid" lay-verify="title"
										autocomplete="off" placeholder="zhuo" class="layui-input" disabled="disabled">
								<input type="hidden" name="uid" lay-verify="title"
										autocomplete="off" value="10" class="layui-input" >
								</div>
							</div>
							<!-- 创建时间 -->
							<div class="layui-form-item">
								<label class="layui-form-label">创建时间</label>
								<div class="layui-input-block">
									<input type="text" name="cretime" lay-verify="title"
										autocomplete="off" placeholder="自动生成" value="${format2 }" readonly="readonly" class="layui-input">
								</div>
							</div>
							<!-- 提交 -->
							<div class="layui-form-item">
								<div class="layui-input-block">
									<button class="layui-btn" lay-submit="" lay-filter="demo1">提交服务</button>
								</div>
							</div>

						</form> --%>
		</div>
    </div>
  </div>
  
</div>
<script src="layui/layui.js" charset="utf-8"></script>
<script>
	layui.use('form',function(){
		var form = layui.form
	})
</script>
</body>
</html>