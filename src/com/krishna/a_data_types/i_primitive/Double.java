package com.krishna.a_data_types.i_primitive;

public class Double {
    public static void main(String[] args){
        // The double data type can hold a value from 4.9e-324 to 1.7976931348623157e+308

        double principal = 10000.0;  // Principal amount in dollars
        double rate = 5.5;  // Interest rate in percent
        double time = 3.5;  // Time in years

        // Simple Interest Formula: SI = (P * R * T) / 100
        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Principal: " + principal + " USD");
        System.out.println("Rate of Interest: " + rate + " %");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + simpleInterest + " USD");
    }
}
