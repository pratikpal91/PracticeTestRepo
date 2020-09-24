package com.ds.tree.bt;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.tree.bst.Node;

public class MirrorABinaryTree {

	public static void main(String[] args) {
		
		Node root = new Node(1000);
		root.left = new Node(6);
		root.left.left = new Node(400);
		root.left.right = new Node(8);
		root.right = new Node(16);
		root.right.left = new Node(14);
		root.right.right = new Node(18);
		
	    root = mirrorBT(root);
	    
	    BFSTraversal(root);
		
	}

	private static void BFSTraversal(Node root) {
		
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty())
		{
			
			Node temp = q.poll();
			System.out.println(temp.value);
			
			if(temp.left != null)
			{
				q.offer(temp.left);
			}
			
			if(temp.right != null)
			{
				q.offer(temp.right);
			}
			
		}
		
	}

	private static Node mirrorBT(Node root) {

	   if(root == null)
	   return root;
	   
	   mirrorBT(root.left);
	   mirrorBT(root.right);
	   
	   Node temp = root.left;
	   root.left = root.right;
	   root.right = temp;
	   
	   return root;
	
	
	}
	
}
