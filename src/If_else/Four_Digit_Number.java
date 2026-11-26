package If_else;

import java.util.Scanner;

public class Four_Digit_Number {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int n = sc.nextInt();
        if(n>999 && n<10000) System.out.println("4 Digit Number");
        else System.out.println("Not 4 Digit Number");
    }
}
