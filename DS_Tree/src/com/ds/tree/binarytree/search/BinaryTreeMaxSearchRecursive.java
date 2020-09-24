package com.ds.tree.binarytree.search;



class Node {
	
	Node left , right ;
	int value = 0;
	
	Node(int val)
	{
		value = val;
	}
	
}

public class BinaryTreeMaxSearchRecursive {
	
public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		int maxValue = findMaxElement(root);
		
		System.out.println(maxValue);
		
	}

private static int findMaxElement(Node root) {
	
	int maxValue = Integer.MIN_VALUE;
	
	if(root != null)
	{
		int maxLeft = findMaxElement(root.left);
		int maxRight = findMaxElement(root.right);
		
		if(maxLeft > maxRight)
		{
			maxValue = maxLeft;
		}else
			maxValue = maxRight;
		
		if(root.value > maxValue)
			maxValue = root.value;
						
	}
	return maxValue;
	
}
	

}
