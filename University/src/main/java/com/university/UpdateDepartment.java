package com.university;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/updateDepartment")
public class UpdateDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dept_name = request.getParameter("deptName");
		String budget = request.getParameter("budgetValue");
		String tableName = "department";
		
		TableSelectDB tableSelectDb = new TableSelectDB();
		DbConnection con = new DbConnection();
		
		int updatedRecord;
		PreparedStatement pstmt;
		try {
			pstmt = con.getConnection().prepareStatement("update "+tableName+" set budget=? where dept_name =?");
			pstmt.setString(1, budget);
			pstmt.setString(2, dept_name);
			updatedRecord = pstmt.executeUpdate();
			if(updatedRecord>0) {
				@SuppressWarnings("rawtypes")
				List result = tableSelectDb.updateDepartment(tableName,dept_name);
				request.setAttribute("result", result);
				RequestDispatcher display = request.getRequestDispatcher("getDepartment.jsp");
				display.forward(request, response);	
			}
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
			
		}
		
	}

}
