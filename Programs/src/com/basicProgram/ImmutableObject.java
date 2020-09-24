package com.basicProgram;


public class ImmutableObject {
	
	private static volatile ImmutableObject im;

	private ImmutableObject() {		
		
		}
	
	public ImmutableObject getInstance(){
		
		if(im == null){			
			synchronized(this)
			{
		     if(im == null)
			  im =  new ImmutableObject();
			}
			
		}
		return im;
		
		
	}

}
