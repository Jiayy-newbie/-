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
    <a style="line-height:1.6em;margin-top:3px;float:left;" onclick="location.reload()" title="刷新">
    </a>
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
          <a href="serviceManagement.jsp">服务管理</a>
          <dl class="layui-nav-child">
           <dd><a href="/servlet/create">服务创建</a></dd>
            <dd ><a href="list.jsp">服务列表</a></dd>
            <dd class="layui-this"><a href="">拼音查找</a></dd>
          </dl>
        </li>
      </ul>
    </div>
  </div>
  
  <div class="layui-body">
  		<div class="layui-card">
	         <div class="layui-card-body ">
	             <div class="layui-form layui-col-space5">
	                   查询：<div class="layui-inline layui-show-xs-block">
	                     <input class="layui-input" autocomplete="off" placeholder="请输入客户名称" name="name" id="demoReload"></div>
	                 <div class="layui-inline layui-show-xs-block">
	                     <button class="layui-btn">
	                         <i class="layui-icon" id="btnAdd" data-type="reload">搜索</i></button>
	                 </div>
	             </div>
	         </div>
	         <div class="layui-card-body ">
	         <div style="padding: 15px;">
	             <table id="demo" lay-filter="test"></table>
	             <script type="text/html" id="barDemo">
						{{# if(d.state.name == '已结束'){}}
						<a class="layui-btn layui-btn-xs layui-btn-disabled" >处理工单</a>
						 <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
						{{#}}}
						{{# if(d.state.name != '已结束'){}}
 						<a  class="layui-btn layui-btn-xs" lay-event="edit">处理工单</a>
						{{#}}}
				</script>
		         </div>
		     </div>
    </div>
  </div>
  
</div>
<script src="layui/layui.js"></script>
<script>
//JavaScript代码区域

layui.use('element', function(){
  var element = layui.element;
  
});

layui.use('table', function(){
  var table = layui.table;
  
  //第一个实例
  table.render({
    elem: '#demo'
    ,height: 312
    ,url: 'pinyin/list' //数据接口
    	,page : true //开启分页
		,limit:5,
		limits : [ 2, 3, 5, 10 ]
    ,cols: [[
	      {field:'id', width:250, title: '编号', sort: true}
	      ,{field:'curname',  title: '客户名'}
	      ,{field:'servtitle', title: '概要', sort: true}
	      ,{field:'servtype',  title: '类型'}
	      ,{field:'name',  title: '创建人', minWidth: 150,templet: "<div>{{d.admin.name}}</div>"}
	      ,{field:'cretime', width:200, title: '创建时间', sort: true}
	      ,{field:'stateid', width:100, title: '状态值', templet:"<div>{{d.state.name}}</div>", sort: true}
	      , {field : 'cz',title : '工单操作',toolbar : '#barDemo'}
	 ]]
	  , id: 'testReload'

  });
  
 var $ = layui.$, active = {
          reload: function () {
              var demoReload = $('#demoReload');

              //执行重载
              table.reload('testReload', {
                  page: {
                      curr: 1 //重新从第 1 页开始
                  }
                  , where: {
                      name: demoReload.val(),
                  }
              });
          },
      };

      $('#btnAdd').on('click', function () {
          var type = $(this).data('type');
          active[type] ? active[type].call(this) : '';
      });
      
      /* //监听事件
      table.on('tool(test)', function(obj){
      	var data=obj.data;
      	layEvent=obj.event;
      	if(layEvent =='del'){
      		layer.confirm('确认删除么',function(index){
      			$.post(
      				"servlet/del"+data.cretime,
      				{},
      				function(d){
      					alert(d?"ok":"err");
      					location.reload();
      				},
      				"json"
      			);
      		});
      	}else if(layEvent === 'edit'){
      		layer.open({
      			type:2,
      			skin:"demo-class",
      			title:"处理操作",
      			maxmin:true,
      			shadeClose:true,
      			area:['800px' ,'500px'],
      			content:'/servlet/get/'+data.id,
      		});
      	}
      	
      }); */
  
});



</script>

</body>
</html>