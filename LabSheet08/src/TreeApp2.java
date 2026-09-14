
public class TreeApp2 {

	public static void main(String[] args) {
		
		
		System.out.println("-----------------------------------------");
		System.out.println("Binary Tree from create Tree4");
		System.out.println("-----------------------------------------");
		BinaryTree tree1 = new BinaryTree();
		tree1.createTree4();
		tree1.printTree(tree1.getRoot(), 0);
		
		//System.out.println();
		//tree1.searchDeleteNode(15);
		
		System.out.println("-----------------------------------------");
		System.out.println("Binary Tree from create Tree5");
		System.out.println("-----------------------------------------");
		BinaryTree tree = new BinaryTree();
		tree.createTree5();
		tree.printTree(tree.getRoot(), 0);
		
		System.out.println("-----------------------------------------");
		System.out.println("Binary Tree from create Tree6");
		System.out.println("-----------------------------------------");
		
		BinaryTree tree2 = new BinaryTree();
		tree2.createTree6();
		tree2.printTree(tree2.getRoot(), 0);
	}

}
