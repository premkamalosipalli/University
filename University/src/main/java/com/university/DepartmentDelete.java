package com.university;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/departmentDelete")
public class DepartmentDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String dept_name = request.getParameter("deptName");
		String tableName = "department";

		PrintWriter pw = response.getWriter();
		TableSelectDB tableSelectDb = new TableSelectDB();
		DbConnection con = new DbConnection();
		ResultSet resultset;
		PreparedStatement pstmt;
		int deleteRecord;

		response.setContentType("text/html");
		try {
			pstmt = con.getConnection().prepareStatement("select * from  department where dept_name =?");
			pstmt.setString(1, dept_name);
			resultset = pstmt.executeQuery();
			if (resultset.next()) {
				deleteRecord = tableSelectDb.deleteDepartment(tableName, dept_name);
				if (deleteRecord != 0) {
					pw.println("Deleting record...");
					@SuppressWarnings("rawtypes")
					List result = tableSelectDb.getDepartment(tableName);
					request.setAttribute("result", result);
					RequestDispatcher display = request.getRequestDispatcher("departmentTable.jsp");
					display.forward(request, response);
				} else if (deleteRecord == 0) {
					pw.println("<br>Record has been deleted successfully.");
					pw.println("<br>Go to Menu to Display Table.");
				}
			} else {
				request.setAttribute("deptName", dept_name);
				RequestDispatcher display = request.getRequestDispatcher("deleteError.jsp");
				display.forward(request, response);
			}
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();

		}

	}

}
