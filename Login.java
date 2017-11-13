package com.database.group6.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.database.group6.po.Administrator;
import com.database.group6.po.Professor;
import com.database.group6.po.Student;


public class Login 
 {
	
        public Student login(Connection con,Student student)throws Exception
        {
	          Student resultStu=null;
	          String sql="select * from tb_student where StudentNum=? and StudentPassword=?" ;
	          
              PreparedStatement pstmt=con.prepareStatement(sql);
              pstmt.setString(1,student.getStudentNum());
              pstmt.setString(2, student.getStudentPassword());
              ResultSet rs=pstmt.executeQuery();
        
              if(rs.next())
              {
	                resultStu=new Student();
	           
	                resultStu.setStudentPassword(rs.getString("StudentPassword"));
	
              }
                               return resultStu;

	}
        
        public Professor login(Connection con,Professor professor)throws Exception
        {
	          Professor resultPro=null;
	          String sql="select * from tb_teacher where TeacherNum=? and TeacherPassword=?" ;
	          
              PreparedStatement pstmt=con.prepareStatement(sql);
              pstmt.setString(1,professor.getProfessorNum());
              pstmt.setString(2,professor.getProfessorPassword());
              ResultSet rs=pstmt.executeQuery();
        
              if(rs.next())
              {
	                resultPro=new Professor();
	           
	                resultPro.setProfessorPassword(rs.getString("Teacherpassword"));
	
              }
                               return resultPro;

	}
        
        
        
        
        
        
        public Administrator login(Connection con, Administrator admin)throws Exception
  {
	           Administrator resultAdmin=null;
	           String sql="select * from tb_manager where ManagerNum=? and ManagerPassword=?";
               PreparedStatement pstmt=con.prepareStatement(sql);
               pstmt.setString(1,admin.getManagerNum());
               pstmt.setString(2,admin.getManagerPassword());
               ResultSet rs=pstmt.executeQuery();
     
    if(rs.next())
     {
	          resultAdmin=new Administrator();
	          
	          resultAdmin.setManagerPassword(rs.getString("ManagerPassword"));
	 }
                      return resultAdmin;

	}
}