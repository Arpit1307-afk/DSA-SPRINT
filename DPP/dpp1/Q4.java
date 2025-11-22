package DPP.dpp1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character ");
        char ch=sc.next().charAt(0);
        int value=(int) ch;
        sc.close();
        System.out.println("ASCII Value = " + value);
    }
    
}
