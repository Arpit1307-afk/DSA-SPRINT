package DPP.dpp1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ASCII Value ");
        int n=sc.nextInt();
        char ch=(char) n;
        sc.close();
        System.out.println("Corresponding value = "+ch);
    }
}
