package com.servletwork;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.helper.Sessionfac;

public class InsertNote extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String title = req.getParameter("title");
		String desc = req.getParameter("desc");
		if (title == null || desc == null) {

		} else {
			try {
				Notes n1 = new Notes(title, desc, new Date());

				Session session = Sessionfac.getfactory().openSession();
				Transaction td = session.beginTransaction();

				session.save(n1);

				td.commit();
				session.close();
				res.sendRedirect("AfterSubmit.jsp");
			} catch (Exception ex) {
				out.print(ex.getMessage());
			}
		}
	}

}
