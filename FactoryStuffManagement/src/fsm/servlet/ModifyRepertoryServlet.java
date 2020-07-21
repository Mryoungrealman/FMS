package fsm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ModifyRepertory")
public class ModifyRepertoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String wareId = request.getParameter("wareId");
		String compId = request.getParameter("compId");
		int num = Integer.parseInt(request.getParameter("num"));
		String id = request.getParameter("id");
		
		request.setAttribute("feedback1", wareId);
		request.setAttribute("feedback2", compId);
		request.setAttribute("feedback3", num);
		
		if(id.equals("1")) {
			request.getRequestDispatcher("modifyWareId.jsp").forward(request, response);
		}else if(id.equals("2"	)) {
			request.getRequestDispatcher("modifyCompId.jsp").forward(request, response);
		}else if(id.equals("3")) {
			request.getRequestDispatcher("modifyNum.jsp").forward(request, response);
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
