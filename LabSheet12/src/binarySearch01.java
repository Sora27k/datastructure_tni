import java.util.Scanner;

public class binarySearch01 {

    public static void main(String[] args) {
        int[] nums = sorting(new int[]{96, 87, 18, 6, 31, 11, 56, 36, 76});

        for (int num : nums) {
            System.out.print(num + " ");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter a target number: ");
        int target = input.nextInt();

        int index = binarySearch(nums, target);

        if (index != -1) {
            System.out.println("\nThe target " + target + " is at index " + index);
        } else {
            System.out.println("\nCannot find " + target + " in this array");
        }
    }

    public static int[] sorting(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }

    public static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }
}