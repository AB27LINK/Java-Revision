package If_else;
import java.util.Scanner;
public class Greatest_of_Three {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st No.: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd No.: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd No.: ");
        int c = sc.nextInt();

        if(a>b){
            if(a>c) System.out.println(a+" is greatest");
            else System.out.println(c+" is greatest");
        }
        else{
            if(b>c) System.out.println(b+" is greatest");
            else System.out.println(c+" is greatest");
        }
    }
}
