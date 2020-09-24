package com.ds.tree.bst;

public class MaxElementInBST {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(6);
		root.left.left = new Node(4);
		root.left.right = new Node(8);
		root.right = new Node(16);
		root.right.left = new Node(14);
		root.right.right = new Node(18);
		
		int val = maxElementInBST(root);				
		System.out.println(val);	
	}

	private static int maxElementInBST(Node root) {
		
		while(root.right != null)
		{
			root = root.right;
		}
		return root.value;
	}
	
	
}
