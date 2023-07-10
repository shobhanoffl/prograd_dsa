import java.io.*;
import java.util.*;
public class LabAllocation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l1=sc.nextInt();
        int l2=sc.nextInt();
        int l3=sc.nextInt();
        int students=sc.nextInt();
        String ans="";

        while(true) {
            students=students+1;
            if(students==l1) {
                System.out.print("L1");
                break;
            }
            if(students==l2) {
                System.out.print("L2");
                break;
            }
            if(students==l3) {
                System.out.print("L3");
                break;
            }
        }









    }

}