package fsm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fsm.entity.Repertory;
import fsm.service.IFSMService;
import fsm.service.impl.FSMServiceImpl;

@WebServlet("/modifyRepertoryNum")
public class modifyRepertoryNumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String wareId = request.getParameter("wareId");
		String compId = request.getParameter("compId");
		int num = Integer.parseInt(request.getParameter("num"));
		int origNum = Integer.parseInt(request.getParameter("origNum")); 
		
		IFSMService FSMService = new FSMServiceImpl();
		
		Repertory repertory = new Repertory(wareId, compId, num);
		
		String res = FSMService.UpdateRepertoryNum(repertory);
		
		System.out.println("update num:"+res);
		
		if(res.equals("no")) {
			request.setAttribute("feedback1", wareId);
			request.setAttribute("feedback2", compId);
			request.setAttribute("feedback3", origNum);
			request.setAttribute("feedback4", "修改失败，请联系技术人员！");
		}else {
			request.setAttribute("feedback1", wareId);
			request.setAttribute("feedback2", compId);
			request.setAttribute("feedback3", num);
			request.setAttribute("feedback4", "修改成功！");
		}
		
		request.getRequestDispatcher("modifyNum.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
