package com.ds.tree.bt;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.ds.tree.bst.Node;

public class ReverseLevelOrderTraversal {
	
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
	    Stack<Node> st =reverseBinaryTree(root);
	    
	    while(!st.isEmpty())
	    {
	    	System.out.println(st.pop().value);
	    	
	    }
		
		
		
		
		
		
	}

	private static Stack<Node> reverseBinaryTree(Node root) {
            
		Queue<Node> q = new LinkedList<>();
		Stack<Node> st = new Stack<>();
		
		q.offer(root);
		
		while(!q.isEmpty())
		{
			Node temp = q.poll();
		    
			st.push(temp);
			
			if(temp.left != null)
			{
				q.offer(temp.left);
			}
			if(temp.right !=null)
			{
				q.offer(temp.right);
			}		
			
		}
		
		return st;
		
	}
	
	

}
