
public class LinkedList {
	
	private Node head;
	
	public LinkedList() {
		this.head = null;
	}
	

	public String traversal() {
		Node current_node = head;
		boolean first_node = true;
		String result = "[";
		while (current_node != null) {
			result += (!first_node ? ", " : "") + current_node.data;
			current_node = current_node.next; //ขยับNode
			first_node = false;
		}
		result += "]";
		
		
		return result;
	}

	public void insert(int position, Object value) {
		Node new_node = new Node(value);
		
		if (head == null) {
			head = new_node;
		} else if (position == 0) {
			new_node.next = head;
			head = new_node;
		} else {
			Node current_node = head;
			int current_position = 0;
			while (current_node != null && current_position < position - 1) {
				current_node = current_node.next;
				current_position++;
			}
			new_node.next = current_node.next;
			current_node.next = new_node;
		}
	}
	
	public void insert(Object value) {
		Node new_node = new Node(value);
		if (head == null) {
			head = new_node;
		} else {
			Node current_node = head;
			while (current_node.next != null) {
				current_node = current_node.next;
			}
			current_node.next = new_node;
		}
	}

	public void remove(int position) {
		if (position == 0) {
			Node current_node = head;
			head = current_node.next;
		} else {
			Node current_node = head;
			int current_position = 0;
			while (current_node != null && current_position < position - 1) {
				current_node = current_node.next;
				current_position++;
			}
			current_node.next = current_node.next.next;
			
		}
		
	}
	
	public void removeLastElement() {
		if (head != null) {
			if (head.next == null) {
				head = null;
			} else {
				Node current_node = head;
				while (current_node.next.next != null) {
					current_node = current_node.next;
				}
				current_node.next = null;
			}
		}
	}

	public int length() {
		Node Allnode = head;
		int length = 0;

		while(Allnode != null){
			length++;
			Allnode = Allnode.next;
		}

		return length;
	}

	public Object get(int position){
		Node current_node = head;
		int current_position = 0;

		while (current_node != null && current_position < position){
			current_position++;
			current_node = current_node.next;
		}

		return current_node.data;
	}

	public void set(int position, Object value){
		Node current_node = head;
		int current_position = 0;

		while (current_node != null && current_position < position){
			current_position++;
			current_node = current_node.next;
		}
		current_node.data = value;
	}

	public void clear(){
		head = null;
	}

}
