<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>工厂物资管理系统</title>

    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>工厂物资管理系统</title>
	<link rel="icon" href="assets/img/fac01.png" type="image/x-icon">
    <!-- BOOTSTRAP CORE STYLE  -->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONT AWESOME STYLE  -->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!-- DATATABLE STYLE  -->
    <link href="assets/js/dataTables/dataTables.bootstrap.css" rel="stylesheet" />
    <!-- CUSTOM STYLE  -->
    <link href="assets/css/style.css" rel="stylesheet" />

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
									<a href="#" class="dropdown-toggle menu-top-active" id="ddlmenuItem" data-toggle="dropdown">
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
		
								<li><a href="QueryRepertoryTiny">
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
		
            <div class="row">
                <div class="col-md-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
						
                        <div class="panel-heading">
                             工厂库存明细 	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <font size="4">${feedback}</font>
                        </div>
                        
						
                        <div class="panel-body">
                            <div class="table-responsive">
								
								
 								${detail}
								
								
                            </div>
                            
                        </div>
                    </div>
                    <!--End Advanced Tables -->
                </div>
            </div>
    </div>
    </div>
	
	
    <section class="footer-section">
       <div class="container">
           <div class="row">
               <div class="col-md-12">
                  Copyright &copy;TYUT 1704 All rights reserved.</div>

           </div>
       </div>
    </section>
	
	
	
    <!-- JAVASCRIPT FILES PLACED AT THE BOTTOM TO REDUCE THE LOADING TIME  -->
    <!-- CORE JQUERY  -->
    <script src="assets/js/jquery-1.10.2.js"></script>
    <!-- BOOTSTRAP SCRIPTS  -->
    <script src="assets/js/bootstrap.js"></script>
    <!-- DATATABLE SCRIPTS  -->
    <script src="assets/js/dataTables/jquery.dataTables.js"></script>
    <script src="assets/js/dataTables/dataTables.bootstrap.js"></script>
      <!-- CUSTOM SCRIPTS  -->
    <script src="assets/js/custom.js"></script>
	<script type="text/javascript" src="assets/js/jquery-1.10.2.js"></script>
	<script type="text/javascript" src="assets/js/mouse.js"></script>

</body>
</html>