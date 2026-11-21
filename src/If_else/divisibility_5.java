package If_else;

import java.util.Scanner;

public class divisibility_5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int n = sc.nextInt();
        if(n/5==0)
        {
            System.out.println("The number "+n+" is divisible by 5");
        }
        else
        {
            System.out.println("The number "+n+" is not divisible by 5");
        }
    }
}
