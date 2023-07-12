/*
Given an array of n elements, find the count of occurence of the element - k
 */
package day5.arrays;

public class LinearSearch {

    public static int findCount(int[] array, int k){
        int c=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==k){
                c+=1;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,5};
        System.out.println(findCount(array,55));
    }
}
