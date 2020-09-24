package com.ds.tree.bst;

public class MinElementInBST {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(6);
		root.left.left = new Node(4);
		root.left.left.left = new Node(2);
		root.left.right = new Node(8);
		root.right = new Node(16);
		root.right.left = new Node(14);
		root.right.right = new Node(18);
		
		int val = minElementInBST(root);				
		System.out.println(val);	
		
		Node node = minElement(root);
		System.out.println(node.value);
		
		
	}

	private static int minElementInBST(Node root) {
		while(root.left != null)
		{
			root = root.left;
		}
		return root.value;
	}
	
	
	private static Node minElement(Node root)
	{
		if(root == null)
		{
			return null;
		}
		if(root.left == null)
		{
			return root;
		}
		return minElement(root.left);		
	}
	
	
}

