package hello;

import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count=0;
        if (num<0) num =-num;
        do {
            num /= 10;
            count++;
        } while (num>0);
        System.out.println(count);
    }
}
