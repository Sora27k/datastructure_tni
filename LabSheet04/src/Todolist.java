
public class Todolist {
	public static void main(String[] args) {
		DoublyLinkedList Todolist = new DoublyLinkedList();
		Todolist.insert("Finish Home");
		System.out.println(Todolist.traversal()); 
		
		Todolist.insert("Laundry");
		Todolist.insert("Group Meeting");
		System.out.println(Todolist.traversal()); 
		
		//ex2
		Todolist.insert(0,"Submit Report");
		System.out.println("To-Do List = " + Todolist.traversal());
		
		Todolist.insert(2,"Buy Food");
		System.out.println("To-Do List = " + Todolist.traversal());
		
		Todolist.insert("Go to Gym");
		System.out.println("To-Do List = " + Todolist.traversal());
		
	}
}
