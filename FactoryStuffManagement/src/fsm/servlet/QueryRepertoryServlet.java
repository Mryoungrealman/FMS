package fsm.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fsm.entity.ReWaCo;
import fsm.service.IFSMService;
import fsm.service.impl.FSMServiceImpl;
import sql.EntityUtil;
@WebServlet("/QueryRepertory")
public class QueryRepertoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		IFSMService FSMService = new FSMServiceImpl();
		List<ReWaCo> list = FSMService.QueryRepertory();
		String strList = EntityUtil.getRepertoryList(list);
		
		if(strList.equals("empty")) {
			System.out.println("无内容！");
			request.setAttribute("detail", "暂无内容！");
		}else {
			System.out.println("查询成功！");
			request.setAttribute("detail", strList);
		}
		
		request.getRequestDispatcher("queryRepertory.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
