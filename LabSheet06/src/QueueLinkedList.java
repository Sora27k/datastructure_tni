
public class QueueLinkedList {

    // pointer of the front and rear node
    private Node front;
    private Node rear;

    // create an empty queue
    public QueueLinkedList() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int value) {
        Node new_node = new Node(value);
        if (isEmpty()) {
            front = new_node;
            rear = new_node;
        } else {
            rear.next = new_node;
            rear = new_node;
        }

    }

    public int peek() {
            return isEmpty() ? -1 : front.data;
    }


    public int dequeue() {
        if (!isEmpty()){
            Node temp_node = front; // back up front node
            int temp_data = temp_node.data; //back up data in front node
            front = front.next; // move front to the next node
            temp_node = null; // remove from computer memory
            return temp_data;
        }
        return -1;
    }

}

