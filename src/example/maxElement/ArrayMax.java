package example.maxElement;

import java.util.Scanner;

public class ArrayMax {
    public void getMax(){
        Scanner scanner = new Scanner(System.in);
        int [] nums = new int[5];
        int max = -2147483648;
        int min = 2147483647;

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
            if (max < nums[i]){
                max = nums[i];
            }
            if (min > nums[i]){
                min = nums[i];
            }
        }

        System.out.println("Tne maximum element is: " + max);
        System.out.println("Tne minimum element is: " + min);
    }
}
