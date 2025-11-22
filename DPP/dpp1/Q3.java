package DPP.dpp1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number ");
        int a=sc.nextInt();
        System.out.print("Enter 2st number ");
        int b=sc.nextInt();
        sc.close();
        System.out.println("a%b = "+a%b);
        System.out.println("b%a = "+b%a);
    }
}
