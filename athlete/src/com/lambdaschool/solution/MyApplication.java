package com.lambdaschool.solution;

/**
 * MyApplication
 */
public class MyApplication implements Processor {

    private AthleteCreation ac;
    private CourtCreation cc;

    public MyApplication(AthleteCreation ac, CourtCreation cc) {
        this.ac = ac;
        this.cc = cc;
    }

    @Override
    public void displayAthlete() {
        System.out.println("======================");
        ac.displayAthlete();
    }

    @Override
    public void displayCourt() {
        cc.displayCourt();
        System.out.println("======================\n");
    }

}
