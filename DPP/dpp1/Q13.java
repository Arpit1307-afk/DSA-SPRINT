package DPP.dpp1;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number ");
        int a=sc.nextInt();
        System.out.print("Enter 2st number ");
        int b=sc.nextInt();
        double a1=(double)a;
        double b1=(double)b;
        sc.close();
        System.out.println(a1/b1);
    }
}
