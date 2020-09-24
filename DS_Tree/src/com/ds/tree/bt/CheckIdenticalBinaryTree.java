package com.ds.tree.bt;

import com.ds.tree.bst.Node;

public class CheckIdenticalBinaryTree {
	
	public static void main(String[] args) {
		
		Node root1 = new Node(1000);
		root1.left = new Node(6);
		root1.left.left = new Node(400);
		root1.left.right = new Node(8);
		root1.right = new Node(16);
		root1.right.left = new Node(14);
		root1.right.right = new Node(18);
		
		
		Node root2 = new Node(1000);
		root2.left = new Node(6);
		root2.left.left = new Node(400);
		root2.left.right = new Node(8);
		root2.right = new Node(16);
		root2.right.left = new Node(14);
		root2.right.right = new Node(18);
		
		
		System.out.println(checkIfIdentical(root1,root2));
		
	}
	
	public static boolean checkIfIdentical(Node root1,Node root2)
	{
	    if(root1 == null && root2 == null)
	    {
	    	return true;
	    }
	    if(root1 == null || root2 == null)
	    	return false;
	    
	    if(root1.value != root2.value)
	    {
	    	return false;    	
	    }
	       
	    return (checkIfIdentical(root1.left, root2.left) && checkIfIdentical(root1.right, root2.right));
		
		
	}

}
