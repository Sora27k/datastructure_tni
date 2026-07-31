import java.util.Stack;

public class LabStack02 {
	public static void main(String[] args) {
		
		Stack<Integer> stacks = new Stack<Integer>();
		
		int[] data = {1,2,3,4,5}; 
		
		for(int i=0; i<data.length;i++) {
			stacks.push(data[i]);
			System.out.println("Push in track: " + stacks.peek() );
		}
		
		System.out.println("Train car after into dead-end track : " + stacks + "\n");
		
		while (!stacks.isEmpty()) {
			 System.out.println("Push in track: " + stacks.pop());
		}
		
		System.out.println("Train car after into dead-end track : " + stacks);
		
		
	}
}
