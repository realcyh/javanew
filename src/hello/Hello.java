package hello;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("amount=");
            int amount = in.nextInt();
            System.out.println("confirm amount=" + amount);
            System.out.println(amount >= 10);
            if (amount >= 10) {
                System.out.println("change:" + (amount - 10));
            } else {
                System.out.println("not enough");
            }
        }

    }
}
