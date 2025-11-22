package DPP.dpp1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number ");
        int n1=sc.nextInt();
        System.out.print("Enter 2st number ");
        int n2=sc.nextInt();
        sc.close();
        System.out.println("remainder = "+(n1%n2));
    }
    
}
