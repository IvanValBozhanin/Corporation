package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    test();
    }

    public static void test() {
        ArrayList<Payable> list = new ArrayList<>();
        list.add(new Invoice("a", "b", 10, 5.5));
        list.add(new SalariedEmployee("Ivan", "Ivanov", "001", 20002.23));
        list.add(new Invoice("g", "d", 50, 3.5));
        for(Payable payable : list){
            System.out.println(payable.getPaymentAmount() + "\t\t\t" + payable.toString());
        }
    }


}
