import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Traverselnorder {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree3();    // Try to test with createTree2() and createTree3()
		tree.printTree(tree.getRoot(), 0);
		System.out.println();
		System.out.println("Inorder = " + traversal(tree.getRoot()));
	}
	
	public static ArrayList<Integer> traversal(Node node) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Deque<Node> stack = new ArrayDeque<Node>();

        Node current_Node = node;
        
        while(!stack.isEmpty()||current_Node!=null){
        	while(current_Node != null){
        		stack.push(current_Node);
        		current_Node = current_Node.left;
				}	
        	current_Node = stack.pop();
    		list.add(current_Node.data);
    		current_Node = current_Node.right;
        	}
		return list;
	}
}