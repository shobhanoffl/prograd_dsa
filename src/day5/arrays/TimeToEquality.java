/*
Given an integer array A of size N. In one second, you can increase the value of one element by 1.
Find the minimum time in seconds to make all elements of the array equal.
 */
package day5.arrays;

public class TimeToEquality {
    public static int findMax(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 1, 3, 2};
        int time = 0;
        int max = findMax(array);
        for(int i=0;i<array.length;i++){
            int elementTime=array[i]-max;
            if(elementTime<0){
                elementTime*=-1;
            }
            time+=elementTime;
        }
        System.out.println(time);
    }
}
