package com.test;

public class Integer {
    public static <T extends Comparable<T>> T maximum(T value1, T value2, T value3) {
            T max = value1;

            if (value2.compareTo(max) > 0)
                max = value2;

            if (value3.compareTo(max) > 0)
                max = value3;

            return max;
        }
        public static void main(String args[]) {
            System.out.printf("Maximum of %d,%d and %d is %d\n" , 1, 2, 3 ,maximum(1, 2, 3));

        }
    }


