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
									<a href="#" class="dropdown-toggle" id="ddlmenuItem" data-toggle="dropdown">
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

								<li><a href="supplySubmit.jsp" class="menu-top-active">
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
		
        <div class="row pad-botm">
            <div class="col-md-12">
                <h4 class="header-line">提交供货单 - Supply submit</h4>
			</div>
        </div>
		
		
		 <div class="row">
            <div class="col-md-6 col-sm-6 col-xs-12">
               <div class="panel panel-info" style="position:absolute;left:55%; width:600px;">
                        <div class="panel-heading">
                           供货清单
                        </div>
                        <div class="panel-body">
                            <form method="post" role="form" action="SupplyAccept">
                                        <div class="form-group">
											<p class="help-block">注意：1.订单编号由字符串组成，且不超过10位。<br>
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2.识别码由字符串组成，且不超过8位。<br>
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3.零件号由字符串组成。<br>
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;4.供货数量请填写整数。<br>
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;5.仓库号若不填写，则系统自动分配至默认仓库。<br>
											</p>
                                            <label>订单号</label>
                                            <input name="order_no" class="form-control" type="text" required="required" />
                                        </div>
										<div class="form-group">
										    <label>厂商识别码</label>
										    <input name="sup_id" class="form-control" type="text" required="required" placeholder="${feedback1}"/>
										</div>
										
										<div class="form-group">
											<label>零件号</label>
											<input name="comp_id" class="form-control" type="text" required="required" placeholder="${feedback2}"/>
										</div>
										
										<div class="form-group">
											<label>供货数量</label>
											<input name="num" class="form-control" type="text" required="required"/>
										</div>
										<div class="form-group">
											<label>仓库号</label>
											<input name="ware_id" class="form-control" type="text" placeholder="${feedback3}"/>
										</div>
										
                                        <p align="center"><button type="submit" class="btn btn-info">提交</button>${feedback4}
									</p>
                                    </form>
                            </div>
                        </div>
					</div>

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