package com.krishna.a_data_types.i_primitive;

public class LongExample {
    public static void main(String[] args){
        // The long data type can store a whole number between -9,223,372,036,854,775,808 and 9,223,372,036,854,775,807
        long destination = 9_525_234_243_231L; // Should add "L" suffix
        long reachedAt = 9_525_234_243_000L;

        long remainedDistance = destination - reachedAt;
        System.out.println("Remained Distance : " + remainedDistance);
    }
}
