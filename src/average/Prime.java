package average;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int count = 0;
//        while (count<10) {
            for (int n=2;count<10;n++) {
                boolean isPrime = true;
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(n + " ");
                    count++;
                } else {
//                System.out.println(n + " is not Prime");
                }
            }
//        }

    }
}
