package com.company;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", SocialSecurityNumber='" + SocialSecurityNumber + '\'' +
                ", weeklySalary=" + weeklySalary +
                '}';
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("Salary should be a positive number!");
        }
        this.weeklySalary = weeklySalary;
    }
}
