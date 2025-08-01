import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ab;
        ab = sc.next().charAt(0);
        if(ab >= 48 && ab<=57)
            System.out.println("NUMBER");
        else if (ab >=65 && ab <=122)
            System.out.println("ALPHABET");
        else 
            System.out.println("SPECIAL CHARACTER");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
