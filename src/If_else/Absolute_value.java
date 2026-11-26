package If_else;

import java.util.Scanner;

public class Absolute_value {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int n = sc.nextInt();
//      if(n>=0) System.out.println(n);
//      else System.out.println(-n);
        if(n<0) n=-n;
        System.out.println(n);
    }
}
