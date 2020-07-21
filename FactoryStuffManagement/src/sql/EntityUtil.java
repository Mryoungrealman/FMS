package sql;

import java.util.List;

import fsm.entity.ReWaCo;
import fsm.entity.Repertory;


public class EntityUtil {
	
	
	public static String getRepertoryList(List<ReWaCo> list) {
		if(list.isEmpty()) {
			return "empty";
		}
		
		StringBuilder listTable = new StringBuilder();
		
		listTable.append("<table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">");
		
		listTable.append("                         <thead>\r\n" + 
				"                                        <tr>\r\n" + 
				"                                            <th>零件号</th>\r\n" + 
				"                                            <th>零件名称</th>\r\n" + 
				"                                            <th>零件规格</th>\r\n" + 
				"                                            <th>零件价格(元)</th>\r\n" + 
				"                                            <th>仓库号</th>\r\n" + 
				"                                            <th>仓库地址</th>\r\n" +
				"                                            <th>余量</th>\r\n" +
				"                                        </tr>\r\n" + 
				"                                    </thead>");
		
		
		listTable.append("         <tbody>");
		for(ReWaCo detail : list) {
			
			listTable.append("                                        <tr>");
			
			listTable.append("<td class=\"center\">"+detail.getComp_id()+"</td>");
			listTable.append("<td>"+detail.getComp_name()+"</td>");
			listTable.append("<td class=\"center\">"+detail.getComp_size()+"</td>");
			listTable.append("<td class=\"center\">"+detail.getComp_price()+"</td>");
			listTable.append("<td class=\"center\">"+detail.getWare_id()+"</td>");
			listTable.append("<td>"+detail.getWare_address()+"</td>");
			listTable.append("<td class=\"center\">"+detail.getNum()+"</td>");
			
			listTable.append("                                        </tr>");
		}
		listTable.append("                                    </tbody>");
		
		listTable.append("                     </table>");
		
		return listTable.toString();
	}
	
	public static String modifyRepertoryList(List<ReWaCo> list) {
		if(list.isEmpty()) {
			return "empty";
		}
		
		StringBuilder listTable = new StringBuilder();
		
		listTable.append("<table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">");
		
		listTable.append("                         <thead>\r\n" + 
				"                                        <tr>\r\n" + 
				"                                            <th>零件号</th>\r\n" + 
				"                                            <th>零件名称</th>\r\n" + 
				"                                            <th>零件规格</th>\r\n" + 
				"                                            <th>零件价格(元)</th>\r\n" + 
				"                                            <th>仓库号</th>\r\n" + 
				"                                            <th>仓库地址</th>\r\n" +
				"                                            <th>余量</th>\r\n" +
				"                                            <th>操作</th>\r\n" +
				"                                        </tr>\r\n" + 
				"                                    </thead>");
		
		
		listTable.append("         <tbody>");
		for(ReWaCo detail : list) {
			
			listTable.append("                                        <tr>");
			
			listTable.append("<td class=\"center\">"+detail.getComp_id()+"</td>");
			listTable.append("<td>"+detail.getComp_name()+"</td>");
			listTable.append("<td class=\"center\">"+detail.getComp_size()+"</td>");
			listTable.append("<td class=\"center\">"+detail.getComp_price()+"</td>");
			listTable.append("<td class=\"center\">"+detail.getWare_id()+"</td>");
			listTable.append("<td>"+detail.getWare_address()+"</td>");
			listTable.append("<td class=\"center\">"+detail.getNum()+"</td>");
			
			//操作按钮
			listTable.append("<td class=\"center\">");
			listTable.append("												<div class=\"btn-group\">\r\n" + 
					"												  <button class=\"btn btn-primary\">修改</button>\r\n" + 
					"												  <button data-toggle=\"dropdown\" class=\"btn btn-primary dropdown-toggle\"><span class=\"caret\"></span></button>\r\n" + 
					"												  <ul class=\"dropdown-menu\">\r\n" + 
					"													<li class=\"divider\"></li>\r\n" + 
					"													<li><a href=\"ModifyRepertory?wareId="+detail.getWare_id()+"&compId="+detail.getComp_id()+"&num="+detail.getNum()+"&id=1\">仓库编码</a></li>\r\n" + 
					"													<li class=\"divider\"></li>\r\n" + 
					"													<li><a href=\"ModifyRepertory?wareId="+detail.getWare_id()+"&compId="+detail.getComp_id()+"&num="+detail.getNum()+"&id=2\">零件型号</a></li>\r\n" + 
					"													<li class=\"divider\"></li>\r\n" + 
					"													<li><a href=\"ModifyRepertory?wareId="+detail.getWare_id()+"&compId="+detail.getComp_id()+"&num="+detail.getNum()+"&id=3\">库存数量</a></li>\r\n" + 
					"													<li class=\"divider\"></li>\r\n" + 
					"												  </ul>\r\n" + 
					"												</div>");
			
			listTable.append("											<a href=\"DeleteRepertory?wareId="+detail.getWare_id()+"&compId="+detail.getComp_id()+"\">\r\n" + 
					"											<button class=\"btn btn-danger\"><i class=\"fa fa-pencil\"></i> 删除</button>\r\n" + 
					"											</a>\r\n" + 
					"");
			
			listTable.append("</td>");
			
			listTable.append("                                        </tr>");
		}
		listTable.append("                                    </tbody>");
		
		listTable.append("                     </table>");
		
		return listTable.toString();
	}
	
	public static String getTinyRepertoryList(List<Repertory> list) {
		if(list.isEmpty()) {
			return "empty";
		}
		
		StringBuilder listTable = new StringBuilder();
		
		listTable.append("				                    <thead>\r\n" + 
				"				                    \r\n" + 
				"				                        <tr>");
		listTable.append("				                            <th>仓库号</th>\r\n" + 
				"				                            <th>零件型号</th>\r\n" + 
				"				                            <th>数量</th>");
		listTable.append("				                        </tr>\r\n" + 
				"				                        \r\n" + 
				"				                    </thead>");
		
		listTable.append("				                    <tbody>");
		for(Repertory detail : list) {
			listTable.append("				                        <tr>\r\n" + 
					"				                            <td>"+detail.getWare_id()+"</td>\r\n" + 
					"				                            <td>"+detail.getComp_id()+"</td>\r\n" + 
					"				                            <td>"+detail.getNum()+"</td>\r\n" + 
					"				                        </tr>");
		}
		
		listTable.append("                                    </tbody>");
		
		return listTable.toString();
	}
	
	
}
