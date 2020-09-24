package com.ds.tree.bt;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.tree.bst.Node;

public class SearchElementInBT {
	
	public static void main(String[] args) {
		Node root = new Node(1000);
		root.left = new Node(6);
		root.left.left = new Node(400);
		root.left.right = new Node(8);
		root.right = new Node(16);
		root.right.left = new Node(14);
		root.right.right = new Node(18);
		
		System.out.println(findElement(root, 8));
		
		System.out.println(findElementWR(root,15));
	}

	private static boolean findElementWR(Node root, int i) {
		
		if(root == null)
		return false;
		
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		
		while(!q.isEmpty())
		{
			Node temp = q.poll();
			if(temp.value == i)
				return true;
			if(temp.left != null)
			{
				q.offer(temp.left);
			}
			if(temp.right != null)
			{
				q.offer(temp.right);
			}
			
		}
		
		return false;
	}

	private static boolean findElement(Node root, int i) {
		
		if(root == null)
		  return false ;
		
		if(root.value == i)
		{
			return true;
		}
		
		Boolean lfound = findElement(root.left, i);
		Boolean rfound = findElement(root.right, i);
	    
		
		
		return lfound || rfound;
	}
	
	

}
