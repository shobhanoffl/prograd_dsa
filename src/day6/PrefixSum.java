package day6;

public class PrefixSum {

    static int[] calculatePrefixSum(int[] array){
        int[] prefixSum = new int[array.length];
        prefixSum[0]=array[0];
        for(int i=1;i<array.length;i++){
            prefixSum[i]=prefixSum[i-1]+array[i];
        }
        return prefixSum;
    }
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        int[] prefixSum = calculatePrefixSum(array);

        for(int i=0; i<array.length; i++){
            System.out.println(prefixSum[i]);
        }
    }
}
