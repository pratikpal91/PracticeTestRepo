package com.ds.tree.bst;

public class CheckIsBST {
	
	private static int previous = Integer.MIN_VALUE;
	
	public static void main(String[] args) {
		
		
			
			Node root = new Node(10);
			root.left = new Node(6);
			root.left.left = new Node(4);
			root.left.right = new Node(8);
			root.right = new Node(16);
			root.right.left = new Node(11);
			root.right.right = new Node(18);
			
		    System.out.println("Is BST : "+checkValidBST(root));
		    
	}

	private static boolean checkValidBST(Node root) {

		return isBST(root);
		
		
	}

	private static boolean isBST(Node root) {

		if(root == null)
		{
			return true;
		}
		if(!isBST(root.left))
		{
			return false;
		}
		if(root.value < previous)
			return false;
		previous = root.value;
		
		return isBST(root.right);
	}

}
