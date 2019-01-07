package com.dataarray.util;

import java.util.Arrays;
import java.util.BitSet;

/**
 * @author chenjunlin
 * @date 2019-01-03
 */

/**
* 在一个给定的从1到100的整型数组中，如何快速找到缺失的数字？
 * 1) Sum of the series: Formula: n (n+1)/2( but only work for one missing number)
 * 2) Use BitSet, if an array has more than one missing elements.
*/
public class MissingNumberInArray {
    public static void main(String[] args) {
        printMissingNumber(new int[]{1,2,3,4,6},6);
        printMissingNumber(new int[]{1,2,3,4,6,7,8,9,10},10);
        printMissingNumber(new int[]{1,2,3,4,6,9,8},10);
        printMissingNumber(new int[]{1,2,3,4,9,8},10);

        int[] iArray = new int[]{1,2,3,5};
        int missing = getMissingNumber(iArray,5);
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n"
                ,Arrays.toString(iArray),missing);

    }
    private static void printMissingNumber(int[] numbers,int count){
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);

        for (int number : numbers){
            bitSet.set(number-1);
        }
        System.out.printf("Missing numbers in integer array %s, with total number %d is %n"
                ,Arrays.toString(numbers),count);
        int lastMissingIndex = 0;

        for (int i=0;i<missingCount;i++){
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(++lastMissingIndex);
        }
    }

    private static int getMissingNumber(int[] numbers,int totalCount){
        int expetedSum = totalCount *((totalCount+1)/2);
        int actualSum = 0;
        for (int i:numbers){
            actualSum += i;
        }
        return expetedSum - actualSum;
    }
}
