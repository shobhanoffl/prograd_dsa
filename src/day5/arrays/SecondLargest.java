/*
You are given an integer array A. You have to find the second largest element/value in the array or report that no such
element exists.
 */
package day5.arrays;

public class SecondLargest {

    public static int findMax(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    public static int findSecondLargest(int[] array){
        int max = findMax(array);
        int[] newArray = new int[array.length - 1];
        int c=0;
        for(int i=0;i<newArray.length;i++){
            if(array[i]!=max){
                newArray[c]=array[i];
            }
        }
        return findMax(newArray);
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,1,1};
        System.out.println(findSecondLargest(array));
    }
}
