<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="x-admin-sm">
    
    <head>
        <meta charset="UTF-8">
        <base href="${pageContext.request.contextPath}/"/>
        <title>欢迎页面-X-admin2.2</title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
        <link rel="stylesheet" href="./css/font.css">
        <link rel="stylesheet" href="./css/xadmin.css">
        <script src="./lib/layui/layui.js" charset="utf-8"></script>
        <script type="text/javascript" src="./js/xadmin.js"></script>
        
       
    </head>
    
    <body>
        <div class="x-nav">
            <span class="layui-breadcrumb">
                <a href="">首页</a>
                <a href="">演示</a>
                <a>
                    <cite>导航元素</cite></a>
            </span>
            <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" onclick="location.reload()" title="刷新">
                <i class="layui-icon layui-icon-refresh" style="line-height:30px"></i>
            </a>
        </div>
        <div class="layui-fluid">
            <div class="layui-row layui-col-space15">
                <div class="layui-col-md12">
                    <div class="layui-card">
                        <div class="layui-card-body ">
                             <div class="layui-form layui-col-space5">
				                 查询：<div class="layui-inline layui-show-xs-block">
				                 	 <input class="layui-input" autocomplete="off" placeholder="请输入ID" name="id" id="demoReload"></div>
				                 <div class="layui-inline layui-show-xs-block">
				                     <input class="layui-input" autocomplete="off" placeholder="请输入客户名称" name="name" id="demoReload2"></div>
				                 <div class="layui-inline layui-show-xs-block">
				                     <button class="layui-btn">
				                         <i class="layui-icon" id="btnAdd" data-type="reload">搜索</i></button>
				                 </div>
                        </div>
                       <div class="layui-card-body ">
			             <table id="demo" lay-filter="test"></table>
				             <script type="text/html" id="barDemo">
						
 								<a class="layui-btn layui-btn-xs" lay-event="edit">处理工单</a>
							</script>
        			 </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
     <script type="text/javascript">
             
        layui.use('table', function() {
			var table = layui.table;
			//第一个实例
			table.render({
				elem : '#tb',
				height : 500,
				url : 'emp/list2' //数据接口
				,
				page : true //开启分页
				,
				/* request : {
					pageName : 'curr' //页码的参数名称，默认：page
					,
					limitName : 'nums' //每页数据量的参数名，默认：limit
					,
				}, */
				limit:5,
				limits : [ 2, 3, 5, 10 ],
				 groups: 1 //只显示 1 个连续页码
			     
				,cols : [ [ //表头
					{
						field : 'id',
						title : '编号',
						type:"checkbox",
						/* width : 20, */
						sort : true
					},
				{
					field : 'name',
					title : '姓名',
					edit:"text",
					/* width : 120, */
					sort : true
				}, {
					field : 'age',
					title : '年龄',
					/* templet : "<div>{{d.customer.cusname}}</div>", */
					/* width : 100 */
				}, {
					field : 'birthday',
					title : '生日',
					/* width : 120 */
				}, {
					field : 'hobbies',
					title : '爱好',
					/* width : 177, */
					sort : true
				}, {
					field : 'sex',
					title : '性别',
					templet:"#switchTpl",
					/* width : 177 */
				}, {
					field : 'photopath',
					title : '图片',
					templet:function(d){
						return "<img src='"+d.photopath+"'/>";
					}
					}
				, {
					field : 'cz',
					title : '操作',
					toolbar : '#barDemo'
				}
				] ]
			});
			table.on('edit(tb)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
				var data = obj.value; //获得当前行数据
				alert(data);
				alert(obj.field)
				alert(obj.data.id)
			});
			table.on('tool(tb)', function(obj) { //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
				var data = obj.data, //获得当前行数据
				layEvent = obj.event, //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
				tr = obj.tr; //获得当前行 tr 的DOM对象
				if (layEvent === 'del') { //删除
					layer.confirm('真的删除行么', function(index) {
						obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
						layer.close(index);
						//向服务端发送删除指令
						$.post(
								"emp/del/"+data.id,
								{},
								function(d){
									 alert(d?"ok":"err");
									 location.reload();
								},
								"json"
						);
					});
				} else if (layEvent === 'edit') { //编辑
					//do something,传data对象到后台
					layer.open({
						type : 2,
						skin : "demo-class",
						title : '修改操作',
						maxmin : true,
						shadeClose : true, //点击遮罩关闭层
						area : [ '500px', '570px' ],
						content : '/emp/get/' + data.id,
					});
				}
			});

			
        });
        </script>
    		<script>layui.use('laydate',
        function() {
            var laydate = layui.laydate;

            //执行一个laydate实例
            laydate.render({
                elem: '#start' //指定元素
            });

            //执行一个laydate实例
            laydate.render({
                elem: '#end' //指定元素
            });

        });</script>

</html>