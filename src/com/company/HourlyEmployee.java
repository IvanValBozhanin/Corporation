package com.company;

public class HourlyEmployee extends Employee{
    private double wage, hours;

    public HourlyEmployee(double wage, double hours) {
        this.wage = wage;
        this.hours = hours;
    }

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double getPaymentAmount() {
        return (hours <= 40 ? wage * hours: 40*wage + (hours - 40)*wage*1.5);
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", SocialSecurityNumber='" + SocialSecurityNumber + '\'' +
                ", wage=" + wage +
                ", hours=" + hours +
                '}';
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage <= 0){
            throw new IllegalArgumentException("Wage must be more than 0!");
        }
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if(hours <= 0 || hours >168){
            throw new IllegalArgumentException("Hours must be more than 0 and less or equal to 168!");
        }
        this.hours = hours;
    }
}
