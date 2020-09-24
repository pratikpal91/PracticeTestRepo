package com.ds.tree.bt;

import java.util.LinkedList;
import java.util.Queue;

import com.ds.tree.bst.Node;

public class HeightOfABinaryTree {
	
	public static void main(String[] args) {
		
		Node root = new Node(1000);
		root.left = new Node(6);
		root.left.left = new Node(400);
		root.left.right = new Node(8);
		root.right = new Node(16);
		root.right.left = new Node(14);
		root.right.right = new Node(18);
		
		
		System.out.println(heightOfBT(root));
		
		System.out.println(heigthOfBTNR(root));
		
		
	}

	private static int heightOfBT(Node root) {
        
		if(root == null)
		{
			return 0;
		}
		
		int lHeight =  heightOfBT(root.left);
		int rHeight =  heightOfBT(root.right);
		
		if(lHeight > rHeight)
		{
			return lHeight+1;
		}else
			return rHeight+1;
	}
	
	
	private static int heigthOfBTNR(Node root){
		
		Queue<Node> q1 = new LinkedList<>();
		Queue<Node> q2 = new LinkedList<>();
		
		q1.add(root);
		
		int count =0;
		
		while(!q1.isEmpty())
		{
			
           Node temp = q1.poll();
           if(temp.left != null)
           {
        	   q2.add(temp.left);
           }
          			
           if(temp.right != null)
           {
        	   q2.add(temp.right);
           }
			
           if(q1.isEmpty())
           {
        	   count++;
        	   q1 = q2;
        	   q2 = new LinkedList<>();
           }
		}
        return count;		
		
	}
	
	

}
