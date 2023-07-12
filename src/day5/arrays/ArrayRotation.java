/*
Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards
 the right.
 */

package day5.arrays;

public class ArrayRotation {

    public static int[] GetSlice(int[] array,int s, int e){
        int[] newArray = new int[e-s+1];
        int c=0;
        while(s<=e){
            newArray[c]=array[s];
            s+=1;
            c+=1;
        }
        return newArray;
    }

    public static int[] RotateArray(int[] array, int b) {
        int[] firstPart = GetSlice(array,0,array.length-b-1);
        int[] lastPart = GetSlice(array,array.length-b, array.length-1);
        int[] combined = new int[array.length];
        int combinedCount = 0;

        for(int i=0;i<lastPart.length;i++){
            combined[combinedCount]=lastPart[i];
            combinedCount++;
        }

        for(int i=0;i<firstPart.length;i++){
            combined[combinedCount]=firstPart[i];
            combinedCount++;
        }

        return combined;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2,5,6};
        int b=1;

        int[] newArray = RotateArray(array,b);
        for(int i=0;i< newArray.length;i++){
            System.out.println(newArray[i]);
        }
    }
}
