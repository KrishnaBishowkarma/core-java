package com.krishna.a_data_types.i_primitive;

public class Byte {
    public static void main(String[] args){
        // The byte data type can store a whole number between -128 and 127
        byte age = 98;
        System.out.println("Age is: " + age);

        byte money = 127;
        byte loan = -128;

        int total = money + loan;
        System.out.println("Total Money : " + total);
    }
}
