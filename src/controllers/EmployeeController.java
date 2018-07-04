/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import models.Employees;

/**
 *
 * @author Carah
 */
public class EmployeeController {

    public static int insertEmployee(Employees e) {
        int status = 0;
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO `employees`(`emp_id`, `emp_firstName`, `emp_middleName`, `emp_lastName`, `emp_gender`, `emp_job`, `emp_jobType`, `emp_salary`, `emp_status`) VALUES (?,?,?,?,?,?,?,?,?)");

            String emp_status = "ACTIVE"; //BY DEFAULT STATUS IS ACTIVE

            ps.setInt(1, e.getId());
            ps.setString(2, e.getFirstName());
            ps.setString(3, e.getMiddleName());
            ps.setString(4, e.getLastName());
            ps.setString(5, e.getGender());
            ps.setString(6, e.getJob());
            ps.setString(7, e.getJobType());
            ps.setDouble(8, e.getSalary());
            ps.setString(9, emp_status);
            status = ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return status;
    }

    public static int checkID(Employees e) {
        int status = 0;
        try {
            int id = e.updateEmployees(e.getId());
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT `emp_id` FROM `employees` WHERE `emp_id`=? AND `emp_status`='ACTIVE'");

            ps.setInt(1, id);
            ps.executeQuery();
            status = 1;
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return status;
    }

    public static int updateEmployee(Employees e) {
        int status = 0;
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE `employees` SET `emp_firstName`=?,`emp_middleName`=?,`emp_lastName`=?,`emp_gender`=?,`emp_job`=?, `emp_jobType`=?, `emp_salary`=?,`emp_status`=? WHERE `emp_id`=?");

            String emp_status = "ACTIVE"; //BY DEFAULT STATUS IS ACTIVE
            //String name = e.getFirstName() + " " + e.getMiddleName() + " " + e.getLastName();

            ps.setString(1, e.getFirstName());
            ps.setString(2, e.getMiddleName());
            ps.setString(3, e.getLastName());
            ps.setString(4, e.getGender());
            ps.setString(5, e.getJob());
            ps.setString(6, e.getJobType());
            ps.setDouble(7, e.getSalary());
            ps.setString(8, emp_status);
            ps.setInt(9, e.getId());
            status = ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return status;
    }

    public static int deleteEmployee(Employees e) {
        int status = 0;
        try {
            int id = e.deleteEmployees(e.getId());

            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE `employees` SET `emp_status`=? WHERE `emp_id`=?");
            ps.setString(1, "NOT ACTIVE");
            ps.setInt(2, id);
            status = ps.executeUpdate();

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return status;
    }

    public static Employees getRecordById(Employees e) {
        Employees emp = null;
        try {
            Connection con = getConnection();
            int id = e.updateEmployees(e.getId());

            PreparedStatement ps = con.prepareStatement("SELECT * FROM `employees` WHERE `emp_id`=? AND `emp_status`='ACTIVE'");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                emp = new Employees();
                emp.setId(rs.getInt("emp_id"));
                emp.setFirstName(rs.getString("emp_firstName"));
                emp.setMiddleName(rs.getString("emp_middleName"));
                emp.setLastName(rs.getString("emp_lastName"));
                //System.out.println(emp.getName());
                emp.setGender(rs.getString("emp_gender"));
                emp.setJob(rs.getString("emp_job"));
                emp.setJobType(rs.getString("emp_jobType"));
                emp.setSalary(rs.getDouble("emp_salary"));
                //u.setCountry(rs.getString("country"));
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return emp;
    }
    
    public static List<Employees> getAllRrecords(){
        List<Employees> empList=new ArrayList<Employees>();
        
        try{
            Connection con=getConnection();
            PreparedStatement ps=con.prepareStatement("SELECT * FROM `employees` WHERE `emp_status`='ACTIVE'");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Employees emp=new Employees();
                emp.setId(rs.getInt("emp_id"));
                emp.setFirstName(rs.getString("emp_firstName"));
                emp.setMiddleName(rs.getString("emp_middleName"));
                emp.setLastName(rs.getString("emp_lastName"));
                emp.setGender(rs.getString("emp_gender"));
                emp.setJob(rs.getString("emp_job"));
                emp.setJobType(rs.getString("emp_jobType"));
                emp.setSalary(rs.getDouble("emp_salary"));
                
                empList.add(emp);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return empList;
    }

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeroster", "root", "");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

}
