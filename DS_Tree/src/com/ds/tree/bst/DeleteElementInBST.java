package com.ds.tree.bst;

public class DeleteElementInBST {
	
	
	public static void main(String[] args) {
		
		Node root = new Node(4);
		root.left = new Node(2);
		root.right = new Node(8);
		root.right.left = new Node(5);
		root.right.right = new Node(1);
		root.right.left.right = new Node(7);
		root.right.left.right.left = new Node(6);
		
		remove(8,root);
		System.out.println(root.value);
		System.out.println(root.right.value);
		
	}
	public static void remove (int key, Node pos)
	    {
	        if (pos == null) return;
	        if (key > pos.value)
	            remove (key, pos.right);
	        else if (key > pos.value)
	            remove (key, pos.left);
	        else {
	            if (pos.left != null && pos.right != null)
	            {
	                /* pos has two children */
	                Node maxFromLeft = findMax (pos.left); //need to make a findMax helper 
	                //"Replacing "  pos.key " with " maxFromLeft.key
	                pos.value = maxFromLeft.value;
	                remove (maxFromLeft.value, pos.left);
	            }
	            else if(pos.left != null) {
	                /* node pointed by pos has at most one child */
	                Node trash = pos;
	                //"Promoting " pos.leftChild.key " to replace " pos.key
	                pos = pos.left;
	                trash = null;
	            }
	            else if(pos.right != null) {
	                /* node pointed by pos has at most one child */
	                Node trash = pos;
	                /* "Promoting " pos.rightChild.key" to replace " pos.key */
	                pos = pos.right;
	                trash = null;
	            }
	            else {
	                pos = null;
	            }
	        }
	    }
	
	
	public static Node findMax(Node root)
	{
		while(root.right != null)
		{
			root = root.right;
		}
       return root;		
		
	}
		
		
		
		


}
