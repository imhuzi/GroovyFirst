package com.dishige.loop

class ForGroovy {
	
	/**
	 * 
	 * @param val
	 * @return
	 */
	public repeat(String val){
		
		for (int i = 0; i < 5; i++) {
			println val	
		}	
	}
	
	/**
	 * main 方法
	 */
	public static void main (String []args){
		
		ForGroovy fg = new ForGroovy();
		fg.repeat("Hello Groovy")
		
	}
}
