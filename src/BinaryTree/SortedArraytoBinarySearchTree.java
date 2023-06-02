package BinaryTree;

public class SortedArraytoBinarySearchTree {
	static Node convertToBTS(int [] arr,int start, int end) {
		if(start>end) {
			return null;
		}
		int mid =(start+end)/2;
		Node root= new Node(arr[mid]);
			root.left=convertToBTS(arr, start, mid-1);
			System.out.println(root.data);
			root.right=convertToBTS(arr, mid+1,end);
		
		return root;
	}
	public static void main(String[] args) {
		int [] array1= {-10,-3,0,5,9};
		convertToBTS(array1, 0, array1.length-1);
	}
	
	
	
	
	
	
	
	
}


