package BinaryTree;

public class Symmetic {
	static boolean isSymmetic(Node root) {
		if(root==null) {
			return true;
		}
		else {
			return isSymmeticHelp(root.left,root.right);
		}
	}
			static boolean isSymmeticHelp(Node left,Node right) {
				if(left==null || right==null) {
					return left==right;
				}
				
				if(left.data!=right.data) {
					return false;
				}
				return isSymmeticHelp(left.left,right.right) && isSymmeticHelp(left.right ,right.left);
			}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(	5);
		root.right.right = new Node(3);
		System.out.println(isSymmetic(root));
	}
}
