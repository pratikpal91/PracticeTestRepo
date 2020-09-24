package com.ds.tree.bt;

import com.ds.tree.bst.Node;

public class CheckIfBTIsMirror {

	public static void main(String[] args) {
		
		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		root1.left.right = new Node(5);
		root1.right.left = new Node(6);
		root1.right.right = new Node(7);
		
		Node root2 = new Node(1);
		root2.left = new Node(3);
		root2.right = new Node(2);
		root2.left.left = new Node(70);
		root2.left.right = new Node(6);
		root2.right.left = new Node(5);
		root2.right.right = new Node(4);
		
		System.out.println(isMirror(root1,root2));
		
	}

	private static boolean isMirror(Node root1, Node root2) {

		if(root1 == null && root2 == null)
		{
			return true;
		}
		if(root1 == null || root2 == null)
		{
			return false;
		}
		
		if(root1.value == root2.value)
		{
			return true;
		}
		
		return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
		
	}
	
	
	
}
