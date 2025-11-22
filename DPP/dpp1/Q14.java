package DPP.dpp1;

import java.util.Scanner;

public class Q14 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a char dgit ");
        char ch=sc.next().charAt(0);
        sc.close();
        int value=ch-'0';
       System.out.println(value);
 }   
}
