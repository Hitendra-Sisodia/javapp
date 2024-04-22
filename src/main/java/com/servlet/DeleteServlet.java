package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.DAO.TodoDAO;
import com.DB.DBConnect;



@WebServlet("/delete")
public class DeleteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		
		System.out.println(id);
		
		TodoDAO dao = new TodoDAO(DBConnect.getConn());
		boolean f = dao.deleteTodo(id);
		
		HttpSession session = req.getSession();
		
		if(f) {
			session.setAttribute("sucMsg", "Todo Deleted Successfully");
			resp.sendRedirect("index.jsp");
		}
		else {
			session.setAttribute("failedMsg", "Something Went Wrong");
			resp.sendRedirect("index.jsp");
		}
	}

}
