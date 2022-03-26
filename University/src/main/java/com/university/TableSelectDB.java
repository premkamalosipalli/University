package com.university;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.university.entity.Course;
import com.university.entity.Department;
import com.university.entity.Instructor;


public class TableSelectDB {
	  	List<Instructor> getInstructor(String tableName) {
		List<Instructor> instructorList = new ArrayList<Instructor>();
		DbConnection con=new DbConnection();
		ResultSet resultset;
		PreparedStatement pstmt;
		try {
			pstmt = con.getConnection().prepareStatement("SELECT * FROM "+tableName);
			resultset = pstmt.executeQuery();
			while (resultset.next()) {
				String ID = resultset.getString(1);
				String name = resultset.getString(2);
				String dept_name = resultset.getString(3);
				float salary = resultset.getFloat(4);
				instructorList.add(new Instructor(ID, name, dept_name, salary));
			}
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
			
		}
		return instructorList;
	}
	  	
	  	List<Department> getDepartment(String tableName) {
			List<Department> departmentList = new ArrayList<Department>();
			DbConnection con=new DbConnection();
			ResultSet resultset;
			PreparedStatement pstmt;
			try {
				pstmt = con.getConnection().prepareStatement("SELECT * FROM "+tableName);
				resultset = pstmt.executeQuery();
				while (resultset.next()) {
					String dept_name = resultset.getString(1);
					String building = resultset.getString(2);
					float budget = resultset.getFloat(3);
					departmentList.add(new Department(dept_name, building, budget));
				}
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				
				
			}
			return departmentList;
		}
	  	
	  	List<Course> getCourse(String tableName) {
			List<Course> courseList = new ArrayList<Course>();
			DbConnection con=new DbConnection();
			ResultSet resultset;
			PreparedStatement pstmt;
			try {
				pstmt = con.getConnection().prepareStatement("SELECT * FROM "+tableName);
				resultset = pstmt.executeQuery();
				while (resultset.next()) {
					String course_id = resultset.getString(1);
					String title = resultset.getString(2);
					String dept_name = resultset.getString(3);
					float credits = resultset.getFloat(4);
					courseList.add(new Course(course_id, title, dept_name, credits));
				}
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				
				
			}
			return courseList;
		}

		List<Department> updateDepartment(String tableName, String dept_name) {
			List<Department> departmentList = new ArrayList<Department>();
			DbConnection con=new DbConnection();
			ResultSet resultset;
			PreparedStatement pstmt;
			try {
				pstmt = con.getConnection().prepareStatement("select * from "+tableName+" where dept_name =?");
				pstmt.setString(1, dept_name);
				resultset = pstmt.executeQuery();
				while (resultset.next()) {
					String name = resultset.getString(1);
					String building = resultset.getString(2);
					float budget = resultset.getFloat(3);
					departmentList.add(new Department(name, building, budget));
				}
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				
				
			}
			return departmentList;
		}

		public int deleteDepartment(String tableName, String dept_name) {
			PreparedStatement pstmt;
			DbConnection con=new DbConnection();
			int deleteRecord = 0;
			try {
				pstmt = con.getConnection().prepareStatement("delete from "+tableName+" where dept_name =?");
				pstmt.setString(1, dept_name);
				deleteRecord = pstmt.executeUpdate();
				} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return deleteRecord;
		}
}
