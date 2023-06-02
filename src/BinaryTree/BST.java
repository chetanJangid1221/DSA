package BinaryTree;

public class BST {
	
	static void inOrderTrav(Node root) {
		if(root==null) {
			return ;
		}
		inOrderTrav(root.left);
		System.out.print(root.data+"\t");
		inOrderTrav(root.right);
	}
	static boolean  BinarySearchTree(Node root, int x) {
		if(root==null) {
			return false;
		}
		if(root.data==x) {
			return true;
		}
		if(root.data>x) {
			return BinarySearchTree(root.left, x);
		}
		else {
			return BinarySearchTree(root.right, x);
		}
	}
	
	static Node insert(Node root ,int key) {
		if(root==null) {
			return new Node(key);
		}
		if(root.data>key) {
			root.left= insert(root.left,key);
		}
		else {
			root.right=insert(root.right,key);
		}
		return root;
	}
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.left = new Node(6);
		root.right.left = new Node(7);
		root.right.right = new Node(8);
		root.right.right.left = new Node(9);
		root.right.right.right = new Node(10);
		System.out.println(BinarySearchTree(root, 1));
		insert(root,2);
		inOrderTrav(root);
	}
}
