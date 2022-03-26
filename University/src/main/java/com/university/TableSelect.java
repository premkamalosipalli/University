package com.university;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/tableSelect")
public class TableSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		TableSelectDB tableSelectDb = new TableSelectDB();
		String tableName = request.getParameter("table");
		if(tableName.equals("instructor")) {
			@SuppressWarnings("rawtypes")
			List result = tableSelectDb.getInstructor(tableName);
			request.setAttribute("result", result);
			RequestDispatcher display = request.getRequestDispatcher("instructorTable.jsp");
			display.forward(request, response);	
		}else if(tableName.equals("department")) {
			@SuppressWarnings("rawtypes")
			List result = tableSelectDb.getDepartment(tableName);
			request.setAttribute("result", result);
			RequestDispatcher display = request.getRequestDispatcher("departmentTable.jsp");
			display.forward(request, response);	
		}else if(tableName.equals("course")) {
			@SuppressWarnings("rawtypes")
			List result = tableSelectDb.getCourse(tableName);
			request.setAttribute("result", result);
			RequestDispatcher display = request.getRequestDispatcher("courseTable.jsp");
			display.forward(request, response);	
		}else {
			RequestDispatcher display = request.getRequestDispatcher("error.jsp");
			display.forward(request, response);	
		}
		
		
	}

}
