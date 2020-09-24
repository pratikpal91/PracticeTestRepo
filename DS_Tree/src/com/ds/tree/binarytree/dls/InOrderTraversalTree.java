package com.ds.tree.binarytree.dls;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversalTree {
	
	
	public static void main(String[] args) {

		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		InOrderTraversal(root);
				
		
		
	}

	private static void InOrderTraversal(Node root) {
		
		Stack<Node> stack = new Stack<Node>();
		
		List<Integer> list = new ArrayList<Integer>();
		Node current = root;
		while(current != null || stack.size() > 0 )
		{
		  		   
		   while(current != null)
		   {
			   stack.push(current);
			   current = current.left;
		   }
			
		   current = stack.pop();
		   System.out.println(current.value);
		   
		   current = current.right;
			
		}
		
		
	}

}
