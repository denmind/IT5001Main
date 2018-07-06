
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
public class PieceWorker extends Employees implements Salaries {

    private int piecesDone;
    private double pieceRate;

    public PieceWorker() {
    }

    /**
     * With Middle Name*
     */
    public PieceWorker(int id, String firstName, String middleName, String lastName, String gender, String job, String jobType, Double salary) {
        super(id, firstName, middleName, lastName, gender, job, jobType, salary);
    }

    public PieceWorker(int piecesDone, double pieceRate, int id, String firstName, String middleName, String lastName, String gender, String job, String jobType, Double salary) {
        super(id, firstName, middleName, lastName, gender, job, jobType, salary);
        this.piecesDone = piecesDone;
        this.pieceRate = pieceRate;
    }

    public PieceWorker(int piecesDone, double pieceRate) {
        super();
        this.piecesDone = piecesDone;
        this.pieceRate = pieceRate;
    }

    public int getPiecesDone() {
        return piecesDone;
    }

    public void setPiecesDone(int piecesDone) {
        this.piecesDone = piecesDone;
    }

    public double getPieceRate() {
        return pieceRate;
    }

    public void setPieceRate(double pieceRate) {
        this.pieceRate = pieceRate;
    }

    @Override
    public double computeMySalary() {
        double salary;

        if (pieceRate <= 0) {
            setPieceRate(minimumRate);
        }
        if (piecesDone <= 0) {
            setPiecesDone(NONE);
        }

        salary = getPieceRate() * getPiecesDone();

        setSalary(salary);

        return salary;
    }

}
