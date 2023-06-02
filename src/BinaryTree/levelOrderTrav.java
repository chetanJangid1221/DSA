package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class levelOrderTrav {

	static void levelOrderTrav(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
	
		while (!q.isEmpty()) {
			Node curr = q.poll();
			System.out.print(curr.data +"\t");
			if (curr.left != null) {
				q.add(curr.left);
			}
			if (curr.right != null) {
				q.add(curr.right);
			}

		}
	}
	public static void inOrderTrav(Node root) {
		if(root==null) {
			return;
		}
		inOrderTrav(root.left);
		System.out.print(root.data+"\t");
		inOrderTrav(root.right);
	}
	public static int height(Node root) {
		if(root==null) {
			return 0;
		}
		return Math.max(height(root.left),height(root.right))+1;
	}
	public static int maximum(Node root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data, Math.max(maximum(root.left),maximum(root.right)));
	}
	public static void converToDLL(Node root) {
		Node prev=null;
		Node head=null;
		if(root==null) {
			return;
		}
		
		converToDLL(root.left);
		if(head==null) {
			head=root;
		}
		else {
			root.left=prev;
			prev.right=root;  
		}
		prev=root;
		System.out.print(prev.data +"\t");
		converToDLL(root.right);
	}

	public static void main(String args[]) {

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

		
//		levelOrderTrav(root);
//		System.out.println();
		System.out.print("Height is "+height(root)+"\n");
//		System.out.println("Maximum value is " +maximum(root));
		converToDLL(root);
		System.out.println();
		inOrderTrav(root);

	
	}
}
