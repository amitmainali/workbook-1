package com.pluralsight;

public class methods {

    public static void main(String[] args) {
        brushTeeth();

        String watchLater = favoriteShow("Severance");
        System.out.println(watchLater);
        int sum = addNums(7, 9);
        System.out.println(sum);
    }

    public static void brushTeeth() {
        System.out.println("1. Wash the toothbrush.");
        System.out.println("2. Apply toothpaste.");
        System.out.println("3. Get scrubbing!");
    }

    public static String favoriteShow(String favShow) {
        return favShow;
    }

    public static int addNums(int x, int y) {
        return x + y;
    }
}
