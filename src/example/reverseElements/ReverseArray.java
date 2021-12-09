package example.reverseElements;

import java.util.Scanner;

public class ReverseArray {
    public void getReverse(){
        Scanner scanner = new Scanner(System.in);
        int [] nums = new int[5];
        System.out.println("Enter array elements: ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Reversed array is: ");
        for (int i = nums.length-1; i >= 0 ; i--) {
            System.out.println(nums[i]);
        }
    }


}
