package com.ds.tree.bst;

public class AddElementInBSTRecursion {

	
	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(6);
		root.left.left = new Node(4);
		root.left.right = new Node(8);
		root.right = new Node(16);
		root.right.left = new Node(14);
		root.right.right = new Node(18);
		
		AddElementInBSTRecursive(root,12);
		
		BSTTraversal.levelOrderTraversal(root);
		
		
		
		
		
	}

	private static Node AddElementInBSTRecursive(Node root, int data) {
		
		if(root == null)
		{
			root = new Node(data);
		}
		
		if(root.value > data)
		{
			root.left = AddElementInBSTRecursive(root.left,data);
		}
		if(root.value < data)
		{
			root.right = AddElementInBSTRecursive(root.right, data);
		}
		
		return root;
	}
	
	
}
