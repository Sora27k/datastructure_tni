import java.util.ArrayDeque;
import java.util.Queue;

public class LabQueue01 {
    static void main() {
        Queue<Integer> qNumber = new ArrayDeque<Integer>();

        for (int i = 101; i <= 105;i++){
            qNumber.offer(i);
            System.out.println("Enqueue " + i);
        }

        System.out.print("Queue " + qNumber);
        System.out.println();

        while (!qNumber.isEmpty()) {
            System.out.println("Calling number " + qNumber.peek());
            System.out.println("Providing service number: " + qNumber.poll());
            System.out.println();
        }
        System.out.println("Queue => " + qNumber);
    }


}
