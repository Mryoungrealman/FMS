package fsm.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fsm.entity.ReWaCo;
import fsm.entity.Repertory;
import fsm.service.IFSMService;
import fsm.service.impl.FSMServiceImpl;
import sql.EntityUtil;

@WebServlet("/DeleteRepertory")
public class DeleteRepertoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String wareId = request.getParameter("wareId");
		String compId = request.getParameter("compId");
		
		Repertory repertory = new Repertory(wareId, compId);
		
		IFSMService FSMService = new FSMServiceImpl();
		
		String res = FSMService.DeleteRepertory(repertory);
		
		List<ReWaCo> list = FSMService.QueryRepertory();
		String strList = EntityUtil.modifyRepertoryList(list);
		
		System.out.println("delete repertory: " + res);
		
		if(res.equals("yes")) {
			request.setAttribute("feedback", "删除成功！");
		}else {
			request.setAttribute("feedback", "删除失败，请联系技术人员！");
		}
	
		if(strList.equals("empty")) {
			System.out.println("无内容！");
			request.setAttribute("detail", "暂无内容！");
		}else {
			System.out.println("查询成功！");
			request.setAttribute("detail", strList);
		}
		
		request.getRequestDispatcher("modifyInfo.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
