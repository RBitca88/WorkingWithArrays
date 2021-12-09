package example.sumElements;

import java.util.Scanner;

public class ArraySum {
    public void getSum(){
        Scanner scanner = new Scanner(System.in);
        int [] nums = new int[5];
        int s = 0;

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
            s += nums[i];
        }

        System.out.println("Sum of elements are: " + s);
    }
}
