package com.github.artembp.slownews.servlet.archive;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Archive")
public class Archive extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		HttpSession session = req.getSession();
		
		ArrayList<News> list = new ArrayList<News>();
		list.add(new News(0, "news1", "meganews1"));
		list.add(new News(1, "news2", "meganews2"));
		list.add(new News(2, "news3", "meganews3"));
		list.add(new News(3, "news4", "meganews4"));
		list.add(new News(4, "news5", "meganews5"));	
		
		session.setAttribute("newslist",list );
		
		RequestDispatcher requestDispatcher;
		requestDispatcher=req.getRequestDispatcher("/archive.jsp");
		requestDispatcher.forward(req, resp);

//		resp.sendRedirect("archive.jsp");
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		HttpSession session = req.getSession();

		String[] ids = req.getParameterValues("news_ids");
		@SuppressWarnings("unchecked")
		ArrayList<News> list = (ArrayList<News>) session.getAttribute("newslist");
		ArrayList<News> list_selected = new ArrayList<News>();

		if (ids != null && ids.length != 0) {
			for (int i = 0; i < ids.length; i++) {
				int size = list.size();
				for (int k = 0; k < size; k++) {
					if (list.get(k).getId() == Integer.parseInt(ids[i])) {
						list_selected.add(list.get(k));
					}
				}
			}
		}
		session.setAttribute("selected", list_selected);
		RequestDispatcher requestDispatcher;
		requestDispatcher=req.getRequestDispatcher("/archive.jsp");
		requestDispatcher.forward(req, resp);
	}

}
