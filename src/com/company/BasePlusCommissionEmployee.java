package com.company;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(double grossSales, double commissionRate, double baseSalary) {
        super(grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPaymentAmount() {
        return (getCommissionRate() * getGrossSales()) + baseSalary;
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", SocialSecurityNumber='" + SocialSecurityNumber + '\'' +
                ", grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                ", baseSalary=" + baseSalary +
                '}';
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary <= 0){
            throw new IllegalArgumentException("Base Salary must be more than 0!");
        }
        this.baseSalary = baseSalary;
    }
}
