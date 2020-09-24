package com.ds.tree.binarytree.search;

import java.util.LinkedList;
import java.util.Queue;


public class BinaryTreeMaxSearchNonRecursive {

	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		int max = maxValueNonRecursive(root);
		
		System.out.println(max);
		
	}

	private static int maxValueNonRecursive(Node root) {

		Queue<Node> queue = new LinkedList<>();
		
		int max = 0;
		
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			Node node = queue.poll();
			if(max < node.value)
			{
				max = node.value;
			}
			
			if(node.left != null)
			{
				queue.add(node.left);
			}
			
			if(node.right != null)
			{
				queue.add(node.right);
			}
			
			
		}
		return max;
		
	}
	
	
}
