package com.ds.tree.bst;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.stream.Stream;

public class CheckIsBST2 {

	public static void main(String[] args) {
		
		Node root = new Node(5);
		root.left = new Node(2);
		root.left.left = new Node(1);
		root.left.right = new Node(3);
		root.right = new Node(12);
		root.right.left = new Node(9);
		root.right.right = new Node(21);
		root.right.right.left = new Node(19);
		root.right.right.right = new Node(25);
		boolean isBST = isBST(root);
		System.out.print(isBST);
		
	}
	
	public static boolean isBST(Node root){
		if(root==null)
			return true;
		if(root.left!=null && root.right!=null){
		if((root.value<root.left.value )|| root.value>root.right.value)
			return false;
		}
		return isBST(root.left) && isBST(root.right);
	}
	
}
