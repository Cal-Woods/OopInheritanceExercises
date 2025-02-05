package com.Classes;

public class Worker {
    //Class attributes
    private int id;
    private String name;
    private double ratePerHour;
    private int weeklyHours;

    //A shared attribute for id generation
    private static int idGenerator = 0;

    //Constructors
    public Worker() {
        
    }
}
