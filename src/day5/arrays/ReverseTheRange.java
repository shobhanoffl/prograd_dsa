/*
Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given
inclusive range [B, C].
 */

package day5.arrays;

public class ReverseTheRange {

    public static int[] ReverseIt(int[] array){
        int l = array.length;
        int i=0;
        int j=l-1;
        int temp=0;
        while(i<j){
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
        return array;
    }

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

    public static int[] ReverseRange(int[] array,int s,int e){
        int[] firstPart = GetSlice(array,0,s-1);
        int[] revPart = ReverseIt(GetSlice(array,s,e));
        int[] lastPart = GetSlice(array,e+1,array.length-1);
        int[] combined = new int[array.length];
        int combinedCount=0;

        for(int i=0; i<firstPart.length; i++){
            combined[combinedCount]=firstPart[i];
            combinedCount++;
        }

        for(int i=0; i<revPart.length; i++){
            combined[combinedCount]=revPart[i];
            combinedCount++;
        }

        for(int i=0; i<lastPart.length; i++){
            combined[combinedCount]=lastPart[i];
            combinedCount++;
        }
        return combined;
    }

    public static void main(String[] args) {
        int[] array = new int[]{2,5,6};
        int s = 0;
        int e = 2;
        int[] newArray = ReverseRange(array,s,e);
        for(int i=0;i< newArray.length;i++){
            System.out.println(newArray[i]);
        }
    }
}
