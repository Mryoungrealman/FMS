package fsm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fsm.entity.Sale;
import fsm.service.IFSMService;
import fsm.service.impl.FSMServiceImpl;

@WebServlet("/SaleAccept")
public class SaleAcceptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		IFSMService FSMService = new FSMServiceImpl();
		
		String orderNo = request.getParameter("order_no");
		String cliId = request.getParameter("cli_id");
		String compId = request.getParameter("comp_id");
		int num = Integer.parseInt(request.getParameter("num"));
		String wareId = request.getParameter("ware_id");
		
		String feedback = "";
		
		if(FSMService.CheckCliId(cliId).equals("yes") && FSMService.CheckCompId(compId).equals("yes") && FSMService.CheckWareId(wareId).equals("yes")) {
			
			Sale sale = new Sale(compId, cliId, orderNo, num);
			String res = FSMService.AddSale(sale, wareId);
			System.out.println("Add sale:" + res);
			
			
			if(res.equals("dup or error")) {
				feedback = "订单号重复或异常！请再次尝试后联系技术人员！";
//				request.setAttribute("feedback4", "订单号重复或异常！请再次尝试后联系技术人员！");
				
			}else if(res.equals("not enough")) {
				feedback = "库存数量不足，请更换仓库！";
//				request.setAttribute("feedback4", "库存数量不足，请更换仓库！");
				
			}else {
				feedback = "订单已成功提交！";
//				request.setAttribute("feedback4", "订单已成功提交！");
			}
			
		}else {
			
			if(FSMService.CheckCliId(cliId).equals("no")) {
				feedback = "信息未入库！";
//				request.setAttribute("feedback1", "客户未入库！");
			}
			if(FSMService.CheckCompId(compId).equals("no")) {
				feedback = "信息未入库！";
//				request.setAttribute("feedback2", "零件种类不存在！");
			}
			
			if(FSMService.CheckWareId(wareId).equals("no")) {
				feedback = "信息未入库！";
//				request.setAttribute("feedback3", "仓库不存在！");
			}
			
			System.out.println("有不存在项目！");

		}
		
		request.getRequestDispatcher("QueryRepertoryTiny?fb="+feedback).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
