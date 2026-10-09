import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class jumpSearch02 {
    public static void main(String[] args) {
        LinkedList<Integer> nums = random_initial();

        nums.sort((a, b) -> {
            return a.compareTo(b);
        });

        System.out.print("Elements after sorting: : ");
        for (int value : nums) {
            System.out.print(value + " ");
        }
        System.out.println("\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int result = jumpSearch(nums, target);
        if (result != -1) {
            System.out.println("The target (" + target + ") at index " + result);
        } else {
            System.err.println("Cannot found " + target + " in this linked list");
        }
        sc.close();
    }

    public static LinkedList<Integer> random_initial() {
        Random rnd = new Random();
        LinkedList<Integer> nums = new LinkedList<Integer>();
        while (nums.size() < 10) {
            nums.add(rnd.nextInt(99));
        }
        return nums;
    }

    public static int jumpSearch(LinkedList<Integer> nums, int target) {
        int n = nums.size();
        if (n == 0) {
            return -1;
        }

        int jump = (int) Math.floor(Math.sqrt(n));
        int start = 0;
        int m = 0;

        while (m < n) {
            int value = nums.get(m);
            if (value == target) {
                return m;
            } else if (value < target) {
                start = m;
                m += jump;
            } else {
                return linearBetween(nums, start, m, target);
            }
        }
        return linearBetween(nums, start, n - 1, target);
    }

    private static int linearBetween(LinkedList<Integer> nums, int from, int to, int target) {
        int last = Math.min(to, nums.size() - 1);
        for (int i = from; i <= last; i++) {
            if (nums.get(i) == target) {
                return i;
            }
        }
        return -1;
    }
}