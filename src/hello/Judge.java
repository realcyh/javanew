package hello;

import java.util.Scanner;

public class Judge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int max;
        if (x>y) max = x;
        else max = y;
        System.out.println(max);

        int type = in.nextInt();
        switch (type) {
            case 1: System.out.println("hello"); break;
            case 2: System.out.println("what"); break;
            default: System.out.println("none");
        }
    }
}
