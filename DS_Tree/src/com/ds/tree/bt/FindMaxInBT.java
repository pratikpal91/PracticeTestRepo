package com.ds.tree.bt;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.tree.bst.Node;

public class FindMaxInBT {
	
	public static void main(String[] args) {
		Node root = new Node(1000);
		root.left = new Node(6000);
		root.left.left = new Node(400);
		root.left.right = new Node(800);
		root.right = new Node(16);
		root.right.left = new Node(14);
		root.right.right = new Node(18);
		
		System.out.println(findMax(root));
		
		System.out.println(findMaxWR(root));
		
		
	}
	
	private static int findMaxWR(Node root) {
		
		int max = Integer.MIN_VALUE;
		
		Queue<Node> q = new LinkedList<Node>();		
		q.offer(root);		
		while(!q.isEmpty())
		{
			Node temp = q.poll();
			if(temp.value > max)
			{
				max = temp.value;
			}
			if(temp.left != null)
			{
				q.offer(temp.left);
			}
			if(temp.right != null)
			{
				q.offer(temp.right);
			}
		}
		
		return max;
	}

	public static int findMax(Node root)
	{		
		if(root == null)
		{
			return 0;
		}
		int max = root.value;
		
		int lmax = findMax(root.left);
		int rmax = findMax(root.right);
		
		if(lmax > rmax && lmax > max)
		{
             max =  lmax;
		}else if(rmax > lmax && rmax > max)
		{
			max = rmax;
		}
		
		return max;
	}
	

}
