package com.company;

public class CommissionEmployee extends Employee{
    protected double grossSales, commissionRate;

    public CommissionEmployee(double grossSales, double commissionRate) {
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPaymentAmount() {
        return commissionRate*grossSales;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", SocialSecurityNumber='" + SocialSecurityNumber + '\'' +
                ", grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                '}';
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales <= 0){
            throw new IllegalArgumentException("Gross Sales must be a positive number!");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate <= 0 || commissionRate >= 1){
            throw new IllegalArgumentException("Commission Rate must be more than 0 and less than 1!");
        }
        this.commissionRate = commissionRate;
    }
}
