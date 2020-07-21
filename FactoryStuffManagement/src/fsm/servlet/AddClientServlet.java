package fsm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fsm.entity.Client;
import fsm.service.IFSMService;
import fsm.service.impl.FSMServiceImpl;

@WebServlet("/AddClient")
public class AddClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		IFSMService FSMService = new FSMServiceImpl();
		
		String cliId = request.getParameter("cli_id");
		String cliName = request.getParameter("cli_name");
		
		Client client = new Client(cliId, cliName);
		
		String res = FSMService.AddClient(client);
		
		System.out.println("Add Client:"+res);
		
		if(res.equals("duplicate or error")) {
			request.setAttribute("feedback2", "用户已存在！若检查无误后仍提示本条信息，请联系技术人员。");
		}else {
			request.setAttribute("feedback2", "提交成功，合作愉快！");
		}
		
		request.getRequestDispatcher("join.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
