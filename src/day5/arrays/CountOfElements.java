/*
Given an array A of 'n' integers.
Count the number of elements that have at least 1 elements greater than itself.
 */
package day5.arrays;

import java.lang.reflect.Array;

public class CountOfElements {
    public static int FindCount(int[] arr, int size){
        int newMax=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if (arr[i]>newMax){
                newMax=arr[i];
            }
        }
        int c = 0;
        for(int i=0;i<size;i++){
            if (arr[i]==newMax){
                c+=1;
            }
        }
        return size-c;
    }

    public static void main(String[] args) {
        int[] array= new int[]{5,5,5,1};
        System.out.println(FindCount(array,4));
    }
}
