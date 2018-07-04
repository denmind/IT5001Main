/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.Salaries;

/**
 *
 * @author pc-user
 */
public class Hourly extends Employees implements Salaries {

    private double hoursWorked;
    private double ratePerHour;

    public Hourly() {
    }

    public Hourly(double hoursWorked, double ratePerHour) {
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    /**
     * With Middle Name*
     */
    public Hourly(int id, String firstName, String middleName, String lastName, String gender, String job, String jobType, Double salary) {
        super(id, firstName, middleName, lastName, gender, job, jobType, salary);
    }

    /**
     * Without Middle Name*
     */
    public Hourly(int id, String firstName, String lastName, String gender, String job, String jobType, Double salary) {
        super(id, firstName, lastName, gender, job, jobType, salary);
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double computeMySalary() {
        double salary;
        
        if (hoursWorked <= 0) {
            setHoursWorked(NONE);
        }
        if (ratePerHour <= 0) {
            setRatePerHour(minimumRate);
        }

        salary = getHoursWorked()* getRatePerHour();
        
        setSalary(salary);
        
        return salary;
    }

}
