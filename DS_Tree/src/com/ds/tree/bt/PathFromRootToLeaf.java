package com.ds.tree.bt;

import java.util.ArrayList;
import java.util.List;

import com.ds.tree.bst.Node;

public class PathFromRootToLeaf {
	
	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		List<List<String>> list = new ArrayList<>();
		List<String> path = new ArrayList<>();
		list = getPath(root,path, list);
		
	     for(List<String> pth :list)
	     {
	    	 for(String route : pth)
	    	 {
	    		 System.out.print(route);	    		 
	    	 }
	    	 System.out.println();
	    	 System.out.print("====================");
	    	 System.out.println();
	     }
		
	}	
	
	public static List<List<String>> getPath(Node root, List<String> path, List<List<String>> paths)
	{
	    
		if(root == null)
		{			
		    return paths;
		}
				
	    path.add(String.valueOf(root.value));
		
		if(root.left == null && root.right == null)
		{
			paths.add(path);			
		}
		
	   getPath(root.left,new ArrayList<>(path) , paths);
	   getPath(root.right,new ArrayList<>(path) ,paths);
	   return paths;
		
		
	}

}
