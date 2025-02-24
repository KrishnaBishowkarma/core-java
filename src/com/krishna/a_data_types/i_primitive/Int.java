package com.krishna.a_data_types.i_primitive;

public class Int {
    public static void main(String[] args){
        // The int data type can store a whole number between -2,147,483,648 and 2,147,483,647

        int populationOfLastYear = 2_147_400_000;
        int populationOfThisYear = 2_147_483_647;

        int newbies = populationOfThisYear - populationOfLastYear;
        System.out.println("New born : " + newbies);
    }
}
