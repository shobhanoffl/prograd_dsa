package day6;
import java.util.Scanner;

public class EvenNumbersInARange {
    public static int[] findEvenNosInRange(int[] array, int[][] query){
        int[] prefixSumArray = PrefixSum.calculatePrefixSum(array);
        int[] totEven = new int[query.length];
        for(int i=0; i<query.length; i++){
            totEven[i]=prefixSumArray[query[i][1]-1]-prefixSumArray[query[i][0]];
        }
        return totEven;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int qSize= sc.nextInt();
        int[][] query=new int[qSize][2];
        for(int i=0;i<qSize;i++) {
            for (int j = 0; j < 2; j++) {
                query[i][j] = sc.nextInt();
            }
        }

        int[] evenNos = findEvenNosInRange(array,query);

        for(int i=0;i< evenNos.length;i++){
            System.out.println(evenNos[i]);
        }
    }

}
