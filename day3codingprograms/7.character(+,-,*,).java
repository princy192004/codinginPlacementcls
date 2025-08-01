import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();             
        char operator = sc.next().charAt(0);
        int n2 = sc.nextInt();             

        int result = 0;

        if (operator == '+') {
            result = n1 + n2;
        } else if (operator == '-') {
            result = n1 - n2;
        } else if (operator == '*') {
            result = n1 * n2;
        } else if (operator == '/') {
            if (n2 != 0) {
                result = n1 / n2;
            } else {
                System.out.println("Division by zero error");
                return;
            }
        } else {
            System.out.println("Invalid operator");
            return;
        }

        System.out.println(result); 
    }
}
