import java.io.*;
import java.util.*;
public class CollatzSeq {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<Integer>();
        System.out.println(n);
        while(n>1) {
            if (n%2==0) {
                n=n/2;
                System.out.println(n);
            }
            else {
                n=3*(n)+1;
                System.out.println(n);
            }
        }







    }

}