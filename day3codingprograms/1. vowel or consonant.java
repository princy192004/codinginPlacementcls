
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char nb;
        nb = sc.next().charAt(0);
        if(nb =='a'|| nb == 'e'|| nb == 'i'|| nb == 'o'|| nb == 'u'|| nb =='A'|| nb == 'E'|| nb == 'I'|| nb =='O'||nb=='U')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
