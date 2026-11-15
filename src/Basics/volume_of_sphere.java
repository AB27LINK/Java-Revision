package Basics;

import java.util.Scanner;

public class volume_of_sphere {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of r : ");
        double r = sc.nextDouble();
        double volume = (4 /3) * r * r * r ;
        System.out.println("Volume of Sphere is "+ volume);
    }
}