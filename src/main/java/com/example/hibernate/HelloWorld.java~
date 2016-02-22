package com.example.hibernate;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Query;
import java.util.Iterator; 

public class HelloWorld extends HttpServlet {
  	public void doGet(HttpServletRequest request, HttpServletResponse response)
  	throws ServletException, IOException  {
	    	Session session = HibernateSessionManager.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Post");
		List list = query.list();
	        PrintWriter out = response.getWriter();
 		request.setAttribute("data",list);
		request.getRequestDispatcher("/table.jsp").forward(request, response);
	       //RequestDispatcher rd = getServletContext().getRequestDispatcher("table.jsp").;
              // rd.forward(request, response);
		/*for (Iterator iterator = posts.iterator(); iterator.hasNext();)
			{
				Post post = (Post) iterator.next();
				request.setAttribute("id", post.getId()); 
				request.setAttribute("title", post.getTitle()); 
				request.setAttribute("body", post.getBody()); 
				request.getRequestDispatcher("table.jsp").forward(request, response);
			}*/

    
  	}
}


