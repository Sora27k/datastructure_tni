import java.util.Scanner;
public class jumpSearch01 {

    public static void main(String[] args) {
        int[] nums = sorting(new int[] { 96, 87, 18, 6, 31, 11, 56, 36, 76 });

        for (int num : nums) {
            System.out.print(num + " ");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("\n\nEnter a target number: ");
        int target = input.nextInt();

        int index = jumpSearch(nums, target);
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

    public static int jumpSearch(int[] nums, int target) {
        int n = nums.length;
        int jump_size = (int) Math.floor(Math.sqrt(n));
        int start = 0;
        int end = jump_size;

        while (start < n && nums[Math.min(end, n) - 1] < target) {
            start = end;
            end += jump_size;
        }

        for (int i = start; i < Math.min(end, n); i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}