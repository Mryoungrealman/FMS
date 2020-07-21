package fsm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fsm.entity.Repertory;
import fsm.entity.Supply;
import fsm.service.IFSMService;
import fsm.service.impl.FSMServiceImpl;

/**
 * Servlet implementation class SupplyAcceptServlet
 */
@WebServlet("/SupplyAccept")
public class SupplyAcceptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		IFSMService FSMService = new FSMServiceImpl();
		
		String orderNo = request.getParameter("order_no");
		String supId = request.getParameter("sup_id");
		String compId = request.getParameter("comp_id");
		int num = Integer.parseInt(request.getParameter("num"));
		String wareId = request.getParameter("ware_id");
		
		
		if(FSMService.CheckSupId(supId).equals("yes") && FSMService.CheckCompId(compId).equals("yes")) {
			
			if(wareId.equals("") || FSMService.CheckWareId(wareId).equals("yes")) {
				
				Supply supply = new Supply(orderNo, supId, compId, num);
				String res = FSMService.AddOrder(supply);
				System.out.println("Add order:" + res);
				
				Repertory repertory = new Repertory(wareId, compId, num);
				res = FSMService.AddRpertory(repertory, "1A");
				System.out.println("Add repertory:" + res);
				
				request.setAttribute("feedback4", "供货单已入库");

			}else {
				
				if(FSMService.CheckWareId(wareId).equals("no")) {
					request.setAttribute("feedback3", "仓库不存在！");
				}
				System.out.println("有不存在项目！");
				
			}
			
			request.getRequestDispatcher("supplySubmit.jsp").forward(request, response);
			
		}else {
			
			if(FSMService.CheckSupId(supId).equals("no")) {
				request.setAttribute("feedback1", "供应商不存在！");
			}
			if(FSMService.CheckCompId(compId).equals("no")) {
				request.setAttribute("feedback2", "零件种类不存在！");
			}
			
			if(FSMService.CheckWareId(wareId).equals("no")) {
				request.setAttribute("feedback3", "仓库不存在！");
			}
			
			System.out.println("有不存在项目！");
			
			request.getRequestDispatcher("supplySubmit.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
