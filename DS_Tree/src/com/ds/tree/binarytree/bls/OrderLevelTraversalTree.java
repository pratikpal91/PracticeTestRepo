package com.ds.tree.binarytree.bls;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	
	Node left , right ;
	int value = 0;
	
	Node(int val)
	{
		value = val;
	}
	
}
public class OrderLevelTraversalTree {
	
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		levelOrderTraversal(root);
		
	}

	public static void levelOrderTraversal(Node root) {

		Queue<Node> queue = new LinkedList<Node>();
		
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			Node node = queue.poll();
			
			System.out.println(node.value);
			
			if(node.left != null)
			{
				queue.add(node.left);
			}
			
			if(node.right != null)
			{
				queue.add(node.right);
			}
		}
		
		
		
	}

}
