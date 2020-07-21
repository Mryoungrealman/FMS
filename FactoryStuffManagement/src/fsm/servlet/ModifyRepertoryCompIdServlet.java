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

/**
 * Servlet implementation class ModifyRepertoryCompIdServlet
 */
@WebServlet("/ModifyRepertoryCompId")
public class ModifyRepertoryCompIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String wareId = request.getParameter("wareId");
		String compId = request.getParameter("compId");
		int num = Integer.parseInt(request.getParameter("num"));
		String origCompId = request.getParameter("origCompId"); 
		
		IFSMService FSMService = new FSMServiceImpl();
		
		Repertory repertory = new Repertory(wareId, compId, num);
		Repertory origRepertory = new Repertory(wareId, origCompId, num);
		
		String res = FSMService.UpdateRepertoryWCId(repertory, origRepertory);
		
		System.out.println("update num:"+res);
		
		if(res.equals("update and insert fail")) {
			request.setAttribute("feedback1", wareId);
			request.setAttribute("feedback2", origCompId);
			request.setAttribute("feedback3", num);
			request.setAttribute("feedback4", "修改失败，请联系技术人员！");
		}else if(res.equals("insert ok")){
			request.setAttribute("feedback1", wareId);
			request.setAttribute("feedback2", compId);
			request.setAttribute("feedback3", num);
			request.setAttribute("feedback4", "修改零件型号成功，已新增库存！");
		}else if(res.equals("update ok")) {
			request.setAttribute("feedback1", wareId);
			request.setAttribute("feedback2", compId);
			request.setAttribute("feedback3", num);
			request.setAttribute("feedback4", "修改零件型号成功，已合并库存！");
		}
		
		request.getRequestDispatcher("modifyCompId.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
