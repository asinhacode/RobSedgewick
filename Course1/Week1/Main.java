package com.company.week1;

import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        //avg_min_max();
        sort();

    }

    // find min, max and the average
    public static void avg_min_max()
    {
        double[] five = new double[5];
        double min = 10, max = -1, sum = 0;

        for(int i = 0; i < 5; i++)
        {
            five[i] = Math.random();

            if(five[i] < min)
            {
                min = five[i];
            }

            if(five[i] > max)
            {
                max = five[i];
            }

            sum += five[i];
        }

        System.out.println(Arrays.toString(five));

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Average: " + (sum / five.length));
    }

    // sort 3 numbers
    public static void sort()
    {
        int[] unsorted = new int[3];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < unsorted.length; i++)
        {
            unsorted[i] = (int)(Math.random() * 100);
            if(unsorted[i] < min)
            {
                min = unsorted[i];
            }

            if(unsorted[i] > max)
            {
                max = unsorted[i];
            }

            sum += unsorted[i];
        }

        System.out.println(Arrays.toString(unsorted));

        //System.out.println("Minimum: " + min);
        // System.out.println("Maximum: " + max);

        int[] sorted = {min, (sum - min - max), max};
        System.out.println(Arrays.toString(sorted));

    }
}
