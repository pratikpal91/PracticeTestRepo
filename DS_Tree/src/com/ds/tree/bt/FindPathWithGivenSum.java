package com.ds.tree.bt;

import com.ds.tree.bst.Node;

public class FindPathWithGivenSum {
	
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.println(findPathWithGivenSum(root, 11));
	}

	private static boolean findPathWithGivenSum(Node root, int sum) {
		
		if(root == null)
		{
			return false;
		}
		
		if(root.left == null && root.right == null && root.value == sum)
		{
			return true;
		}
		
		boolean lmatch = findPathWithGivenSum(root.left, sum - root.value);
		boolean rmatch =findPathWithGivenSum(root.right, sum- root.value);
		
	    return  lmatch || rmatch;
		
		
		
	}

}
