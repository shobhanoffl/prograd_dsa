import java.io.*;
import java.util.*;
public class MangoTree {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int columns=scanner.nextInt();
        int tree=scanner.nextInt();

        if(tree<=rows) {
            System.out.print(true);
        }
        else if((tree-1)%rows==0) {
            System.out.print(true);
        }
        else if(tree%rows==0) {
            System.out.print(true);
        }
        else {
            System.out.print(false);
        }

    }

}