package day2;

import java.io.*;
import java.util.*;
public class MangoTree {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int r=scanner.nextInt();
        int c=scanner.nextInt();
        int t=scanner.nextInt();

        if(t<=r) {
            System.out.print(true);
        }
        else if((t-1)%r==0) {
            System.out.print(true);
        }
        else if(t%r==0) {
            System.out.print(true);
        }
        else {
            System.out.print(false);
        }

    }

}