package If_else;
import java.util.Scanner;
public class Rectangle_Condition {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();
        int p = 2 * (l + b); // Perimeter of the Rectangle
        int a = l * b; // Area of the Rectangle

        System.out.println("Perimeter of Rectangle: "+p);
        System.out.println("Area of Rectangle: "+a);
        if (a > p) System.out.println("Area of Rectangle is greater than Perimeter");
        else System.out.println("Area of Rectangle is not greater than Perimeter");
    }
}
