package DPP.dpp1;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number ");
        double n1=sc.nextDouble();
        int intPart=(int)n1;
        double ans=n1-intPart;
        System.out.println(ans);
        sc.close();
    }
}
