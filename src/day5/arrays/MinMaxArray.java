/*
Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
 */
package day5.arrays;

public class MinMaxArray {
    public static int findMax(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,-6};
        System.out.println(findMax(array)+findMin(array));
    }
}
