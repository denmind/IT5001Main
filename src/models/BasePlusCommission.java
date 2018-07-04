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
public class BasePlusCommission extends Commission {

    private double baseSalary;

    public BasePlusCommission() {
    }

    public BasePlusCommission(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasePlusCommission(double baseSalary, int salesDone) {
        super(salesDone);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommission(double baseSalary, int salesDone, int id, String firstName, String middleName, String lastName, String gender, String job, String jobType, Double salary) {
        super(salesDone, id, firstName, middleName, lastName, gender, job, jobType, salary);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommission(double baseSalary, int salesDone, int id, String firstName, String lastName, String gender, String job, String jobType, Double salary) {
        super(salesDone, id, firstName, lastName, gender, job, jobType, salary);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeMySalary() {
        double salary;

        if (baseSalary <= NONE) {
            setBaseSalary(minimumRate);
        }
        if (getSalesDone() <= NONE) {
            setSalesDone(NONE);
        }

        salary = getBaseSalary() + (getSalesDone() * computeCommissionPercentage());

        setSalary(salary);

        return salary;
    }

}
