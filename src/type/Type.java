package type;

import java.util.Scanner;

public class Type {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(Math.pow(2, 3));
        String s;
        //s = in.next();
        String name = "hello";
        String str1 = "one";
        String str2 = "";

        System.out.println(name.charAt(3));
        for (int i=0; i<name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        System.out.println(name.indexOf("l"));



    }
}
