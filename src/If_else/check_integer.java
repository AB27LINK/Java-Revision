package If_else;

import java.util.Scanner;

public class check_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a real number : ");
        double n = sc.nextDouble();
        if(n==(int)n) System.out.println("It is integer");
        else System.out.println("It is not integer");
    }
}
