package com.ds.tree.binarytree.search;

import com.ds.tree.binarytree.bls.OrderLevelTraversalTree;

public class InsertionInBTRecursion {
	
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		Node node = InsertIntoABT(root,4);
		
		boolean status = FindElementInBTRecursion.findElementInBinaryTree(node,4);
		System.out.println("is Inserted " +status);
	}

	private static Node InsertIntoABT(Node root, int data) {

		if(root == null)
		{
			Node node = new Node(data);
			return node;
		}
		
		if(root.left == null)
		{
			root.left = new Node(data);
			return root;
		}else{
			
			InsertIntoABT(root.left, data);
		}
		
		if(root.right == null)
		{
			root.right = new Node(data);
			return root;
		}else{
			InsertIntoABT(root.right, data);
		}
		return root;
	}

}
