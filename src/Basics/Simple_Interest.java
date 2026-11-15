package Basics;

import java.util.Scanner;

public class Simple_Interest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        double p = sc.nextInt();
        System.out.print("Enter rate: ");
        double r = sc.nextInt();
        System.out.print("Enter time taken: ");
        double t = sc.nextInt();

        double si = (p*r*t)/100;
        System.out.println("SI is "+si);
    }
}
