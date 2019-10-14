package average;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        int cnt = 0;
        cnt = in.nextInt();
        if (cnt>0) {
            int[] nums = new int[cnt];
            for (int i=0; i<cnt; i++) {
                nums[i] = in.nextInt();
                sum += nums[i];
            }
            double average = sum/cnt;
            for (int i=0; i<cnt; i++) {
                if (nums[i] > average) {
                    System.out.print(nums[i]+" ");
                }
            }
        }
    }
}
