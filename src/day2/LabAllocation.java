package day2;

import java.io.*;
import java.util.*;
public class LabAllocation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l1=sc.nextInt();
        int l2=sc.nextInt();
        int l3=sc.nextInt();
        int s=sc.nextInt();
        String ans="";

        while(true) {
            s=s+1;
            if(s==l1) {
                System.out.print("L1");
                break;
            }
            if(s==l2) {
                System.out.print("L2");
                break;
            }
            if(s==l3) {
                System.out.print("L3");
                break;
            }
        }









    }

}