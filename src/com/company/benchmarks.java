package com.company;

import java.text.DecimalFormat;

public class benchmarks {
    public static void quicksortarray(int n){
        //initialising values
        long t0, t1 = 0;
        int rounds = 1000;
        double max = 0, t_total = 0, mean = 0;
        double min = Double.POSITIVE_INFINITY;
        //measure execution time in ns
        for (int i = 0; i < rounds; i++) {
            int[] array = com.company.array.create(n);
            t0 = System.nanoTime();
            quicksort.sort(array);
            t1 = System.nanoTime() - t0;
            min = Math.min(t1,min);
            max = Math.max(t1,max);
            t_total += t1;
        }
        mean = t_total / rounds;
        //taking no decimals values
        String minS, maxS, meanS;
        DecimalFormat df = new DecimalFormat("#");
        minS = df.format(min);
        meanS = df.format(mean);
        maxS = df.format(max);
        /* minS = String.format("%.3g%n", min);
        maxS = String.format("%.3g%n", max);
        meanS = String.format("%.3g%n", mean);*/
        if (n >= 400)
        System.out.println("quicksortarray " + " size " + n + " min " + minS + " mean "
                + meanS + " max " + maxS + " ns ");
    }
    public static void quicksortlink(int n){
        //initialising values
        long t0, t1 = 0;
        int rounds = 1000;
        double max = 0, t_total = 0, mean = 0;
        double min = Double.POSITIVE_INFINITY;
        //measure execution time in ns
        for (int i = 0; i < rounds; i++) {
            linkedlist list = new com.company.linkedlist();
            list.addlength(n);
            t0 = System.nanoTime();
            quicksortlinkedlist.sort(list);
            t1 = System.nanoTime() - t0;
            min = Math.min(t1,min);
            max = Math.max(t1,max);
            t_total += t1;
        }
        mean = t_total / rounds;
        //taking no decimals values
        String minS, maxS, meanS;
        DecimalFormat df = new DecimalFormat("#");
        minS = df.format(min);
        meanS = df.format(mean);
        maxS = df.format(max);
        if(n >= 400)
        System.out.println("quicksortlink  " + " size " + n + " min " + minS + " mean "
                + meanS + " max " + maxS + " ns ");
    }
}
