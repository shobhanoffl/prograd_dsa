/*
Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
 */
package day5.arrays;

public class GoodPair {

    //    This method returns the count of such pairs, which is ofcourse not asked, but we're just trying
    public static int FindTheCount(int[] array, int k){
        int c=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==k){
                    c+=1;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,2};
        int k=4;
        int c = FindTheCount(array,k);
        if(c>0){
            System.out.println("Yes "+c+" Pairs Exists");
        }else{
            System.out.println("No");
        }

    }
}
