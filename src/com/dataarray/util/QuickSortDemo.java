package com.dataarray.util;

/**
 * @author chenjunlin
 * @date 2019-01-04
 */

import java.util.Arrays;

/**
 * 如何利用快速排序对一个整型数组进行排序？
 * Import points about Quicksort algorithm
 * Now we know how quick sort works and how to implement quicksort in Java, its time to revise some of the important points about this popular sorting algorithm.
 *
 * 1) QuickSort is a divide and conquer algorithm. Large list is divided into two and sorted separately (conquered), sorted list is merge later.
 * 2) On "in-place" implementation of quick sort, list is sorted using same array, no additional array is required. Numbers are re-arranged pivot, also known as partitioning.
 * 3) Partitioning happen around pivot, which is usually middle element of array.
 * 4) Average case time complexity of Quicksort is O(n log n) and worst case time complexity is O(n ^2), which makes it one of the fasted sorting algorithm. Interesting thing is it's worst case performance is equal to Bubble Sort :)
 * 5) Quicksort can be implemented with an in-place partitioning algorithm, so the entire sort can be done with only O(log n) additional space used by the stack during the recursion.
 * 6) Quicksort is also a good example of algorithm which makes best use of CPU caches, because of it's divide and conquer nature.
 * 7) In Java, Arrays.sort() method uses quick sort algorithm to sort array of primitives. It's different than our algorithm, and uses two pivots. Good thing is that it perform much better than most of the quicksort algorithm available on internet for different data sets, where traditional quick sort perform poorly.
 * One more reason, not to reinvent the wheel but to use the library method, when it comes to write production code.
 */
public class QuickSortDemo {
    public static void main(String[] args) {
        int[] unsorted = {6, 5, 3, 1, 8, 7, 2, 4};
        System.out.println("Unsorted array : " + Arrays.toString(unsorted));

        QuickSort algorithm = new QuickSort();

        algorithm.sort(unsorted);
        System.out.println("Sorted array : " + Arrays.toString(unsorted));
    }
}
    class QuickSort{
        private int input[];
        private int length;

        public void sort(int[] numbers){
            if (numbers == null || numbers.length==0){
                return;
            }
            this.input = numbers;
            length = numbers.length;
            quickSort(0,length - 1);
        }

        private void quickSort(int low, int high) {
            int i = low;
            int j = high;

            //pivot is middle index
            int pivot = input[low+(high-low)/2];

            //divide into two array
            while (i <= j){
                while (input[i]<pivot){
                    i++;
                }
                while (input[j]>pivot){
                    j--;
                }
                if (i<=j){
                    swap(i,j);
                    //2个指针移动到下一个位置
                    i++;
                    j--;
                }
            }
        }

        private void swap(int i, int j) {
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
        }
    }
