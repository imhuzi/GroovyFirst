package com.dishige.loop

class ForGroovy1 {
	
	/**
	 * 
	 * @param val
	 * @return
	 */
	def repeat(val){
		for (def i = 0; i < 5; i++) {
			println val	
		}	
	}
	
	/**
	 * main 方法
	 */
	static void main (args){
		
		ForGroovy1 fg = new ForGroovy1();
		fg.repeat("Hello Groovy")
		
	}
}
