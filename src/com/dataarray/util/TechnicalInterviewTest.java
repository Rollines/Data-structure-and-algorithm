package com.dataarray.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @author chenjunlin
 * @date 2019-01-03
 */

/**
 * 如何找到一个给定的整型数组中的重复数字？
 */
public class TechnicalInterviewTest {
    private static final Logger logger = LoggerFactory.getLogger(TechnicalInterviewTest.class);

    public static void main(String[] args) {
        int[][] test = new int[][]{
                {1, 1, 2, 2, 3, 4, 5},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6, 7},
                {1, 2, 1, 1, 1, 1, 1},
        };

        for (int[] input : test){
            System.out.println("Array with duplicates    :"+Arrays.toString(input));
            System.out.println("Array removing duplicates    :"+Arrays.toString(removeDuplicates(input)));
        }
    }
    public static int[] removeDuplicates(int[] numbersWithDuplicates){
        Arrays.sort(numbersWithDuplicates);

        int[] result = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        result[0] = previous;

        for (int i=1;i<numbersWithDuplicates.length;i++){
            int ch = numbersWithDuplicates[i];

            if (previous != ch){
                result[i] = ch;
            }
            previous = ch;
        }
        return result;
    }
}


