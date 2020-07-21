<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta charset="utf-8" />
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


</head>
<body>
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
		
								<li><a href="QueryRepertoryTiny" class="menu-top-active">
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								订&nbsp;&nbsp;单
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								</a></li>
				
								<li><a href="join.jsp">
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
                <h4 class="header-line">提交订单 - order submit</h4>
                
			</div>

        </div>
		
		
		
		 <div class="row">
		 
		 
				<div class="col-md-6">
				    <div class="panel panel-default">
				        <div class="panel-heading">
				            库存信息简表
				        </div>
				        <div class="panel-body">
				            <div class="table-responsive">
				            
				                <table class="table table-striped table-bordered table-hover">
				 
				                	${detail}
				                	
				                </table>
				                
				            </div>
				        </div>
				    </div>
				</div>
		 
		 
		 <!-- --------------------------------------------- -->
		 
            <div class="col-md-6 col-sm-6 col-xs-12">
               <div class="panel panel-info">
                        <div class="panel-heading">
                           客户订单
                        </div>
                        <div class="panel-body">
                            <form method="post" role="form" action="SaleAccept">
                                        <div class="form-group">
											<p class="help-block">注意：请依照左侧库存表单填写。</p>
                                            <label>订单号</label>
                                            <input name="order_no" class="form-control" type="text" required="required" />
                                        </div>
										<div class="form-group">
										    <label>客户识别码</label>
										    <input name="cli_id" class="form-control" type="text" required="required" />
										</div>
										
										<div class="form-group">
											<label>零件号</label>
											<input name="comp_id" class="form-control" type="text" required="required" />
										</div>
										
										<div class="form-group">
											<label>订单数量</label>
											<input name="num" class="form-control" type="text" required="required"/>
										</div>
										<div class="form-group">
											<label>仓库号</label>
											<input name="ware_id" class="form-control" type="text" />
										</div>
										<p class="help-block">${feedback}</p>
                                        
                                        <p align="center"><button type="submit" class="btn btn-info">提交</button>
										</p>
                                    </form>
                            </div>
                        </div>
					</div>
			
			
			<!-- --------------------------------------------- -->

			
			
			</div>
			
	</div>
	
	</div>
     <!-- CONTENT-WRAPPER SECTION END-->
    <section class="footer-section">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
				</div>
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
</html>