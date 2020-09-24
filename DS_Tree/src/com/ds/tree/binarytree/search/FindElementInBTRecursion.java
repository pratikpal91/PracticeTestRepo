package com.ds.tree.binarytree.search;

public class FindElementInBTRecursion {

	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		boolean isExist = findElementInBinaryTree(root, 7);
		
		System.out.println("does element exist :"+isExist );
	}

	static boolean findElementInBinaryTree(Node root, int data) {
		
		if(root == null)
		{
			return false;
		}
		
		if(root.value == data)
		{
			return true;
		}
				
		return (findElementInBinaryTree(root.left, data) || findElementInBinaryTree(root.right, data));
	}
	
}
