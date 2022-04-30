package com.servletwork;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.helper.Sessionfac;


public class UpdateNotes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String title=request.getParameter("title");
		String desc=request.getParameter("desc");
		Session s1=Sessionfac.getfactory().openSession();
		Notes n1=(Notes)s1.get(Notes.class, id);
		Transaction tx=s1.beginTransaction();
		n1.setTitle(title);
		n1.setContant(desc);
		n1.setAdddate(new Date());
		tx.commit();
		s1.close();
		response.sendRedirect("show_note.jsp");
	}

}
