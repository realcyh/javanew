package average;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.print(a+" and "+b+" gcd is ");
        while (b>0) {
            int c =a%b;
            a=b;
            b=c;
        }
        System.out.println(a);
    }
}
