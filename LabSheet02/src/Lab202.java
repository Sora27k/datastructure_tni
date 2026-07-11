import java.util.ArrayList;
import java.util.Scanner;
public class Lab202 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        for (int num : initial_numbers) {
            numbers.add(num);
        }

        System.out.print("Enter value to add at the end: ");
        numbers.add(scan.nextInt());

        System.out.print("Enter value to insert at index 8: ");
        numbers.add(8, scan.nextInt());

        numbers.remove(2);

        numbers.set(1, 10);
        System.out.println("Final ArrayList numbers = " + numbers);
    }

}