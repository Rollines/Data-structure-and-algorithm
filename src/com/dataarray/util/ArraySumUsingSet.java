package com.dataarray.util;

/**
 * @author chenjunlin
 * @date 2019-01-04
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * 在一个整型数组中，如何找到一个所有成对的数字，
 * 满足它们的和等于一个给定的数字？
 * Java Program to find two elements in an array that sum to k.
 *
 */
public class ArraySumUsingSet {

    public static void main(String[] args) {
        prettyPrint(getRandomArray(9),11);
        prettyPrint(getRandomArray(10),12);
    }

    /**
     * given an array of integers finds two elements in the array
     * whose sum is
     */
    public static void printPairsUsingSet(int[] numbers,int n){
        if (numbers.length<2){
            return;
        }
        Set set = new HashSet(numbers.length);

        for (int value : numbers){
            int target = n - value;

            //if target number is not in set then add
            if (!set.contains(target)){
                set.add(value);
            }else {
                System.out.printf("(%d,%d) %n",value,target);
            }
        }
    }

    /**
     * utility method to find two elements in an array that sum to k;
     */
    public static void prettyPrint(int[] random,int k){
        System.out.println("Random Integer array : "+Arrays.toString(random));
        System.out.println("Sum : "+k);
        System.out.println("pair of numbers from an array whose sum equals : "+k);
        printPairsUsingSet(random,k);
    }

    public static int[] getRandomArray(int length){
        int[] randoms = new int[length];
        for (int i=0;i<length;i++){
            randoms[i] = (int) (Math.random()*15);
        }
        return randoms;
    }
}
