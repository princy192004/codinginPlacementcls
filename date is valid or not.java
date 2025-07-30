import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[]t = time.split("/");
        int dd = Integer.parseInt(t[0]);
        int mm = Integer.parseInt(t[1]);
        int yy = Integer.parseInt(t[2]);

 
        if (dd >= 0 && dd <= 31 && mm >= 0 && mm <= 12 && yy >= 1900 && yy <= 9999) 
        {
            System.out.println("Valid");
        }
        else {
                    System.out.println("Invalid");
        }
 
    }
}