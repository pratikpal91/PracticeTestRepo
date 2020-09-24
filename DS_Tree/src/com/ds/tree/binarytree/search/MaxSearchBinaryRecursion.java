package com.ds.tree.binarytree.search;

public class MaxSearchBinaryRecursion {
	
	
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		int max = findMaxValueOfBT(root);
		
		System.out.println("Max value of BT is : "+max);		
		
	}

	private static int findMaxValueOfBT(Node root) {
		
		int max = 0;
		
		if(root == null)
		{
			return -1;
		}
		int leftMax = findMaxValueOfBT(root.left);
		int rightMax = findMaxValueOfBT(root.right);
		
		if(leftMax > rightMax)
		{
			max = leftMax;
		}else
		{
			max = rightMax;
		}
		
		if(root.value > max)
		{
			max = root.value;
		}
		
		return max;
	}

}
