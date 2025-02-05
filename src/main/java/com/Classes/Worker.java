package com.Classes;

public class Worker {
    //Class attributes
    private int id;
    private String name;
    private double ratePerHour;
    private int weeklyHours;

    //A shared attribute for id generation
    private static int idGenerator = 1;

    //Constructor - no arguments
    public Worker() {
        //set id to current idgenerator value, then increase by 1
        id = idGenerator++;

        //Set name to "John"
        name = "John Doe";

        //Set ratePerHour to 0.00
        ratePerHour = 1.00;

        //Set weeklyHours to 1
        weeklyHours = 1;
    }
    //Constructor - Arguments, except id
    public Worker(String name, double rate, int hours) {
        //Set this.id = value of idGenerator & increment by 1
        id = idGenerator++;

        //Set class attributes to constructor arguments
        this.name = name;
        this.ratePerHour = rate;
        this.weeklyHours = hours;
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getRatePerHour() {
        return ratePerHour;
    }
    public int getWeeklyHours() {
        return weeklyHours;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setRatePerHour(double rate) {
        this.ratePerHour = rate;
    }
    public void setWeeklyHours(int hours) {
        this.weeklyHours = hours;
    }
}
