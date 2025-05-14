package com.pluralsight;

import java.time.Year;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;


    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int presentYear = Year.now().getValue();
        int previousYear = presentYear-4;
        double value;
        // if less than 3, 6, 10 years, reduced 3%, 6%, 8% of cost per year
        if (previousYear <= 3) {
            value = getOriginalCost() * Math.pow(0.97, previousYear);
        } else if (previousYear <= 6) {
            value = getOriginalCost() * Math.pow(0.94, previousYear);
        } else if (previousYear <= 10) {
            value = getOriginalCost() * Math.pow(0.92, previousYear);
        } else {
            // if over 10 years, reduce by 25%
            value = 1000.0;
            }
        // checking if the miles are over 100k and is a Honda or a Toyota "||" means OR
        if (odometer > 100000 && !(makeModel.contains("Honda") || makeModel.contains("Toyota"))) {
            value *= 0.75;
        }
        return value;
    }

    }

