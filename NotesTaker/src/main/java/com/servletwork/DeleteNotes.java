package com.servletwork;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.helper.Sessionfac;


public class DeleteNotes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int id=Integer.parseInt(request.getParameter("id"));

	Session s1=Sessionfac.getfactory().openSession();
	Notes n1=(Notes)s1.get(Notes.class, id);
	Transaction tx=s1.beginTransaction();
    s1.delete(n1);
	tx.commit();
	s1.close();
	response.sendRedirect("show_note.jsp");
	}

}
