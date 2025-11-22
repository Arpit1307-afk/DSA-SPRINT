package DPP.dpp1;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number ");
        int n1=sc.nextInt();
        System.out.print("Enter 2st number ");
        int n2=sc.nextInt();
        sc.close();
        System.out.println("Sum of "+n1+" & "+n2+" = "+ (n1+n2));
        System.out.println("Difference of "+n1+" & "+n2+" = "+ (n1-n2));
        System.out.println("Product of "+n1+" & "+n2+" = "+ (n1*n2));
        System.out.println("Quotient of "+n1+" & "+n2+" = "+ (n1/n2));
    }
}
