import java.io.*;
import java.util.*;

public class Day1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        Scanner scan = new Scanner(System.in);
        
        // declaring user input variables
        int i1;
        double d1;
        String s1;
        
        // reading inputs
        i1 = scan.nextInt();
        d1 = scan.nextDouble();
        
        scan.nextLine();
        s1 = scan.nextLine();
        
        // printing sum of int variable
        System.out.println(i+i1);
        
        // printing sum of double variable
        System.out.println(d+d1);
        
        // concatenating and print string
        System.out.println(s.concat(s1));

        scan.close();
    }
}