<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">


    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>工厂物资管理系统</title>
	<link rel="icon" href="assets/img/fac01.png" type="image/x-icon">
    <!-- BOOTSTRAP CORE STYLE  -->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONT AWESOME STYLE  -->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!-- CUSTOM STYLE  -->
    <link href="assets/css/style.css" rel="stylesheet" />
    <!-- GOOGLE FONT -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />




</head>
<body>
    <!-- LOGO HEADER END-->
    <section class="menu-section">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="navbar-collapse collapse ">
                                               <ul id="menu-top" class="nav navbar-nav">
							
							<li>
           	                	<a class="navbar-brand" href="index.html">
                    			<img src="assets/img/fac01.png" />
                				</a>
                			</li>

                			
								<li><a href="index.html" >
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								主&nbsp;&nbsp;页
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								</a></li>

								<li>
									<a href="#" class="dropdown-toggle " id="ddlmenuItem" data-toggle="dropdown">
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									库&nbsp;&nbsp;存
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<i class="fa fa-angle-down"></i></a>
									<ul class="dropdown-menu" role="menu" aria-labelledby="ddlmenuItem">
										<li role="presentation"><a role="menuitem" tabindex="-1" href="QueryRepertory">&nbsp;&nbsp;&nbsp;&nbsp;库存查询&nbsp;&nbsp;&nbsp;&nbsp;</a></li>
										<li role="presentation"><a role="menuitem" tabindex="-1" href="ModifyQueryRepertory">&nbsp;&nbsp;&nbsp;&nbsp;库存管理&nbsp;&nbsp;&nbsp;&nbsp;</a></li>
									</ul>
								</li>

								<li><a href="supplySubmit.jsp">
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								供&nbsp;&nbsp;货
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								</a></li>
		
								<li><a href="QueryRepertoryTiny" >
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								订&nbsp;&nbsp;单
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								</a></li>
				
								<li><a href="join.jsp" class="menu-top-active">
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								加&nbsp;&nbsp;盟
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								</a></li>

							</ul>
                    </div>
                </div>

            </div>
        </div>
    </section>
     <!-- MENU SECTION END-->
    <div class="content-wrapper">
         <div class="container">
        <div class="row pad-botm">
            <div class="col-md-12">
                <h4 class="header-line">加入我们 - Join us</h4>
                
			</div>

        </div>
		 <div class="row">
            <div class="col-md-6 col-sm-6 col-xs-12">
               <div class="panel panel-info">
                        <div class="panel-heading">
                           供应商合作申请表
                        </div>
                        <div class="panel-body">
                            <form method="post" role="form" action="AddSupplier">
                				<p class="help-block">注意：一次请提交一张表。 <br>${feedback1}</p>
                				
                                        <div class="form-group">
                                            <label>供应商识别码</label>
                                            <input  name="sup_id" class="form-control" type="text"/>
                                            <p class="help-block">请填写不超过8位的识别码</p>
                                        </div>
                                        
                                 		<div class="form-group">
                                            <label>供应商名称</label>
                                            <input  name="sup_name" class="form-control" type="text" />
                                     		<p class="help-block">请正确填写名称</p>
										</div>
										
                                		<div class="form-group">
                                            <label>供应商地址</label>
                                            <input  name="sup_address" class="form-control" type="text" />
                                     		<p class="help-block">请精确到省市区</p>
										</div>
										
                                		<div class="form-group">
                                            <label>供应商联系方式</label>
                                            <input  name="sup_tele" class="form-control" type="text" />
                                     		<p class="help-block">请确保联系方式有效</p>
										</div>      
										                           
                                        <p align="center"><button type="submit" class="btn btn-info">提交</button>
										</p>
                                    </form>
                            </div>
                        </div>
                            </div>
<div class="col-md-6 col-sm-6 col-xs-12">
               <div class="panel panel-danger">
                        <div class="panel-heading">
                           客户合作申请表
                        </div>
                        <div class="panel-body">
                            <form method="post" role="form" action="AddClient">
								<p class="help-block">注意：一次请提交一张表。<br> ${feedback2}<br>
                         
                                  <div class="form-group">
                                      <label>客户识别码</label>
                                      <input name="cli_id" class="form-control" type="text" />
                                      <p class="help-block">请填写不超过8位的识别码</p>
                                  </div>
                           		<div class="form-group">
                                      <label>客户名称</label>
                                      <input name="cli_name" class="form-control" type="text" />
                               		<p class="help-block">请正确填写名称</p>
								</div>
								
                                 <div class="form-group">
                                       <label>备注</label>
                                       <textarea class="form-control" rows="7"></textarea>
                                 </div>
								
								
                                        <p align="center"><button type="submit" class="btn btn-info">提交</button>
										</p>
                            </form>
                            </div>
                        </div>
                            </div>
        </div>
		
		
             <!--/.ROW-->
    </div>
    </div>
     <!-- CONTENT-WRAPPER SECTION END-->
    <section class="footer-section">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                   Copyright &copy;TYUT 1704 All rights reserved.</div>

            </div>
        </div>
    </section>
      <!-- FOOTER SECTION END-->
    <!-- JAVASCRIPT FILES PLACED AT THE BOTTOM TO REDUCE THE LOADING TIME  -->
    <!-- CORE JQUERY  -->
    <script src="assets/js/jquery-1.10.2.js"></script>
    <!-- BOOTSTRAP SCRIPTS  -->
    <script src="assets/js/bootstrap.js"></script>
      <!-- CUSTOM SCRIPTS  -->
    <script src="assets/js/custom.js"></script>
</body>
</body>
</html>