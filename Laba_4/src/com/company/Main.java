package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr_1 = new ArrayList<>();
        fill_Arr(arr_1);
        System.out.println(" Random array: ");
        System.out.println(arr_1);
        System.out.println(" Min elements: ");
        System.out.println(getMinimum(arr_1));

    }

    public static void fill_Arr(List<Integer> array) {
        final Random rand = new Random();
        int size = (rand.nextInt(10) + 25);
        for (int i = 0; i < size; i++) {
            array.add(rand.nextInt(200));
        }
    }

    public static List<Integer> getMinimum(List<Integer> array) {
        List<Integer> min_Arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int min = Collections.min(array);
            min_Arr.add(min);
            array.remove((Integer)min);
        }
        return min_Arr;
    }
}