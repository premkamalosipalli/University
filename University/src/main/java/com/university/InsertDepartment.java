package com.university;

import java.io.IOException;
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


@WebServlet("/insertDepartment")
public class InsertDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DbConnection con = new DbConnection();
		TableSelectDB tableSelectDb = new TableSelectDB();
		String dept_name = request.getParameter("deptName");
		String buildName = request.getParameter("buildName");
		String budgetValue = request.getParameter("budgetValue");
		String tableName = "department";
		
		ResultSet resultset;
		PreparedStatement pstmt;	
		response.setContentType("text/html");
		try {
			pstmt = con.getConnection().prepareStatement("select * from  department where dept_name =?");
			pstmt.setString(1, dept_name);
			resultset = pstmt.executeQuery();
			if (!resultset.next()) {
				pstmt = con.getConnection().prepareStatement(
						"insert into department(dept_name,building,budget) values(?,?,?)");
				pstmt.setString(1, dept_name);
				pstmt.setString(2, buildName);
				pstmt.setString(3, budgetValue);
				pstmt.executeUpdate();
				resultset.close();
				@SuppressWarnings("rawtypes")
				List result = tableSelectDb.getDepartment(tableName);
				request.setAttribute("result", result);
				RequestDispatcher display = request.getRequestDispatcher("departmentTable.jsp");
				display.forward(request, response);	
			} else {
				request.setAttribute("deptName", dept_name);
				RequestDispatcher display = request.getRequestDispatcher("insertError.jsp");
				display.forward(request, response);	
			}
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
	}

}
