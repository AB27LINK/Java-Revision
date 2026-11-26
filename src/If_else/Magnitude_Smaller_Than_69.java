package If_else;
import java.util.Scanner;
public class Magnitude_Smaller_Than_69 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n<0) n=-n;
        if(n<69) System.out.println("The number is smaller than 69");
        else System.out.println("The number is not smaller than 69");
    }
}
