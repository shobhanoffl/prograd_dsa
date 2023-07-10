import java.io.*;
import java.util.*;
public class Salary {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int sal=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==8) {
                int val=8*100;
                sal=sal+val;
            }
            if(arr[i]>8) {
                sal=sal+800;
                int v1=(arr[i]-8)*115;

                sal=sal+v1;

            }
            if(arr[i]<8) {
                sal=sal+(arr[i]*100);
            }
            sum=sum+arr[i];

        }

        if(arr[0]!=0) {
            sal=sal+(arr[0]*50);
        }

        if(arr[6]!=0) {
            sal=sal+(arr[6]*25);
        }
        System.out.println(sal);
    }

}