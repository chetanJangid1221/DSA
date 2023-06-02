package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode1 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public ArrayList<Integer> inorderTraversal(TreeNode root) {
	        ArrayList<Integer> res= new ArrayList();
	    
	         if(root==null){
	             return res;
	         }
	         inorderTraversal(root.left);
	         res.add(root.val);
	         inorderTraversal(root.right);
	     
	         return res;
	            

	    }
	}
}
