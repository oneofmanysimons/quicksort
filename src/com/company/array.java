package com.company;

import java.util.Random;

public class array {
    public static int[] create(int size){
        Random rnd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(size*10);
        }
        return array;
    }
}
