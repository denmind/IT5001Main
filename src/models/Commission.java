/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.Commissions;
import controllers.Salaries;

/**
 *
 * @author pc-user
 */
public class Commission extends Employees implements Salaries,Commissions{

    private int salesDone;

    public Commission() {
    }

    public Commission(int salesDone) {
        this.salesDone = salesDone;
    }

    /**
     * With Middle Name*
     */
    public Commission(int salesDone, int id, String firstName, String middleName, String lastName, String gender, String job, String jobType, Double salary) {
        super(id, firstName, middleName, lastName, gender, job, jobType, salary);
        this.salesDone = salesDone;
    }

    /**
     * Without Middle Name*
     */
    public Commission(int salesDone, int id, String firstName, String lastName, String gender, String job, String jobType, Double salary) {
        super(id, firstName, lastName, gender, job, jobType, salary);
        this.salesDone = salesDone;
    }

    public int getSalesDone() {
        return salesDone;
    }

    public void setSalesDone(int salesDone) {
        this.salesDone = salesDone;
    }

    public int getCommissionRate() {
        return commissionRate;
    }

    
    @Override
    public double computeMySalary() {
        double salary;
        
        if(salesDone <= 0){
            setSalesDone(NONE);
        }
        
        salary = salesDone * computeCommissionPercentage();
        
        setSalary(salary);
        
        return salary;
    }

    @Override
    public int computeCommissionPercentage() {
        return 100 / getCommissionRate();
    }

}
