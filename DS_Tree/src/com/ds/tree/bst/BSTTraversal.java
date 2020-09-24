package com.ds.tree.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BSTTraversal {
	
	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(6);
		root.left.left = new Node(4);
		root.left.right = new Node(8);
		root.right = new Node(16);
		root.right.left = new Node(14);
		root.right.right = new Node(18);
		
		levelOrderTraversal(root);
		
		
	}

	static void levelOrderTraversal(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(root);
		
		while(!q.isEmpty())
		{
			Node temp = q.poll();
			System.out.println(temp.value);
			
			if(temp.left != null)
			{
				q.add(temp.left);
			}
			
			if(temp.right != null)
			{
				q.add(temp.right);
			}
			
			
			
		}
		
		
	}
	
	

}
