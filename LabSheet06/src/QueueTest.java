public class QueueTest {
    static void main() {
        QueueArrayBased q = new QueueArrayBased();
        q.enqueue(10);
        q.enqueue(11);
        q.enqueue(12);

        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.peek());

        System.out.println("");

        QueueLinkedList e = new QueueLinkedList();
        e.enqueue(10);
        e.enqueue(11);
        e.enqueue(12);

        System.out.println(e.peek());
        System.out.println(e.dequeue());
        System.out.println(e.peek());

    }
}
