package com.ds.tree.bst;

public class AddElementInBST {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(6);
		root.left.left = new Node(4);
		root.left.right = new Node(8);
		root.right = new Node(16);
		root.right.left = new Node(14);
		root.right.right = new Node(18);
		
		AddElementToBST(root, 12);				
		BSTTraversal.levelOrderTraversal(root);	
		
	}

	private static void AddElementToBST(Node root, int data) {

		int temp = 1;
		
		while(temp != 0)
		{
		   if(root.value > data)
		   {
			   if(root.left == null)
			   {
				   root.left = new Node(data);
				   temp = 0;
			   }
			   root= root.left;
			   
		   }
			
		   if(root.value < data)
		   {
			   if(root.right == null)
			   {
				   root.right = new Node(data);
				   temp = 0;
			   }
			   root = root.right;
			   
		   }
			
		}
		
		
	}
	
	
}
