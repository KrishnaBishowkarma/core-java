package com.krishna.a_data_types.i_primitive;

public class Float {
    public static void main(String[] args){
        // The float data type can hold a value from 1.4e-045 to 3.4028235e+38
        float weight = 68.5f;
        float height = 1.65f;

        float bmi = weight / (height * height); // BMI(Body Mass Index) formula: weight (kg) / height² (m²)

        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " m");
        System.out.println("Calculated BMI: " + bmi);
    }
}
