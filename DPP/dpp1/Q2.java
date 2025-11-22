package DPP.dpp1;
import java.util.*;
public class Q2 {
    Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int x=sc.nextInt();
        sc.close();
        System.out.println("result of ++n1 = "+(++x));
        System.out.println("result of n1++ = "+(x++));
        System.out.println("final value of n1 = "+x);
 }
}
