import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        scanner.nextLine();

        for (int i = 0; i < n; i++) 
        {
            String string = scanner.nextLine();
            char[] charArray = string.toCharArray();

            for (int j = 0; j < charArray.length; j++) 
            {
                if (j % 2 == 0) 
                {
                    System.out.print(charArray[j]);
                }
            }

            System.out.print(" ");

            for (int j = 0; j < charArray.length; j++) 
            {
                if (j % 2 != 0) 
                {
                    System.out.print(charArray[j]);
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}