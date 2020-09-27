/*
Program2test.java
This program reads a text file and sorts 
the numbers by a range of values.
 */
package program2test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Program2test {

    public static void main(String[] args) throws IOException 
    { 
        int count_a = 0;            // count variables for the different ranges
        int count_b = 0;            // of numbers
        int count_c = 0;
        int count_d = 0;
        int count_e = 0;
        int count_f = 0;
        int count_g = 0;
        int count_h = 0;
        int number_students;
        String line;
        
        Scanner in = new Scanner(Paths.get("lab2_input.txt"), "UTF-8");
        number_students = in.nextInt();
        while (in.hasNext())         
        {   
            int a= in.nextInt();
                
                if (a<25 && a >= 0)             // for deciding which count
                    count_a++;                  // increases by determing
                else if (a >= 25 && a <= 49)    // what range the variable is in
                    count_b++;
                else if (a >= 50 && a <= 74)
                    count_c++;
                else if (a >= 75 && a <= 99)
                    count_d++;
                else if (a >= 100 && a <= 124)
                    count_e++;
                else if (a >= 125 && a <= 149)
                    count_f++;
                else if (a >= 150 && a <= 174)
                    count_g++;
                else
                    count_h++;
        }
        
        System.out.println("[0-24]: " + count_a);
        System.out.println("[25-49]: " + count_b);
        System.out.println("[50-74]: " + count_c);
        System.out.println("[75-99]: " + count_d);
        System.out.println("[100-124]: " + count_e);
        System.out.println("[125-149]: " + count_f);
        System.out.println("[150-174]: " + count_g);
        System.out.println("[175-200]: " + count_h);
    }    
}
