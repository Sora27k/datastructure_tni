
public class StackTest {

	public static void main(String[] args) {

		StackLinkedList stacks = new StackLinkedList();

		stacks.push(10);
		stacks.push(11);
		stacks.push(12);

		System.out.println(stacks.peek());
		System.out.println(stacks.pop());
		System.out.println(stacks.peek());

		StackArrayBased stack = new StackArrayBased();

		stack.push(10);
		stack.push(11);
		stack.push(12);

		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());

	}
}
