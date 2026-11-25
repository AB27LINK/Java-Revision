package If_else;
import java.util.Scanner;
public class Is_sides_triangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        int a = sc.nextInt();
        System.out.print("Enter side2: ");
        int b = sc.nextInt();
        System.out.print("Enter side3: ");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b)
            System.out.println("The sides make a valid triangle");
        else System.out.println("The sides don't make a valid triangle");
    }
}
