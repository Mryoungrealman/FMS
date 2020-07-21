package fsm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fsm.entity.Supplier;
import fsm.service.IFSMService;
import fsm.service.impl.FSMServiceImpl;

@WebServlet("/AddSupplier")
public class AddSupplierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		IFSMService FSMService = new FSMServiceImpl();
		
		String supId = request.getParameter("sup_id");
		String supName = request.getParameter("sup_name");
		String supAddress = request.getParameter("sup_address");
		String supTele = request.getParameter("sup_tele");
		
		Supplier supplier = new Supplier(supId, supName, supAddress, supTele);
		
		String res = FSMService.AddSupplier(supplier);
		
		System.out.println("Add Supplier:"+res);
		
		if(res.equals("duplicate or error")) {
			request.setAttribute("feedback1", "用户已存在！若检查无误后仍提示本条信息，请联系技术人员。");
		}else {
			request.setAttribute("feedback1", "提交成功，合作愉快！");
		}
		
		request.getRequestDispatcher("join.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
