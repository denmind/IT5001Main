/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author pc-user
 */
public class Employees {

    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String job;
    private String jobType;
    private Double salary;

    public Employees() {
    }

    /**
     * Without Middle Name*
     */
    public Employees(int id, String firstName, String middleName, String lastName, String gender, String job, String jobType, Double salary) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.job = job;
        this.jobType = jobType;
        this.salary = salary;
    }

    /**
     * Without Middle Name*
     */
    public Employees(int id, String firstName, String lastName, String gender, String job, String jobType, Double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.job = job;
        this.jobType = jobType;
        this.salary = salary;
    }

    public int deleteEmployees(int id) {
        this.id = id;
        return id;
    }

    public int updateEmployees(int id) {
        this.id = id;
        return id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
