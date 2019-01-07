package com.dataarray.util;

import java.util.Arrays;

/**
 * @author chenjunlin
 * @date 2019-01-04
 */


/**
 *
 * 在一个整型数组中，如何找到一个所有成对的数字，
 * 满足它们的和等于一个给定的数字？
 * Java Program to find two elements in an array that sum to k.
 *
 */
public class PrintArrayPairs {

    public static void main(String[] args) {
        prettyPrint( new int[]{ 12, 14, 17, 15, 19, 20, -11}, 9);
        prettyPrint( new int[]{ 2, 4, 7, 5, 9, 10, -1}, 9);

    }

    /**
     *
     * @param numbers
     * @param k
     */
    public static void printPairsUsingTwoPointers(int[] numbers,int k){
        if (numbers.length<2){
            return;
        }
        Arrays.sort(numbers);

        int left=0;int right = numbers.length-1;
        while (left<right){
            int sum = numbers[left] + numbers[right];
            if (sum == k){
                System.out.printf("(%d,%d) %n",numbers[left],numbers[right]);
                left = left+1;
                right = right-1;
            }else if (sum<k){
                left = left+1;
            }else if (sum>k){
                right = right-1;
            }
        }
    }

    /**
     *
     */

    public static void prettyPrint(int[] random,int k){
        System.out.println("input int array : "+Arrays.toString(random));
        System.out.println("All pairs in an array of integers whose sum is" + k);
        printPairsUsingTwoPointers(random,k);
    }

}
