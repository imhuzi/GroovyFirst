package com.dishige.def

/**
 * groovy 之类型练习,
 * groovy 中还是有main函数的，
 * 没有main函数的类是不能执行的
 * 
 * @author wh
 *
 */
class DefOfGroovy {
	
	String message = "Hello World!"
	def message1 = "Hello def!"
	def msg = "的类型是："
	def msg1 = 12
	
	/**
	 * 显示消息
	 * @return
	 */
	def showMessage (){
		println message
		println message1
		println "msg" + msg + msg.class
		println "msg1" + msg + msg1.class
	}

	static void main(String[] args) {
		DefOfGroovy dg= new DefOfGroovy();
		dg.showMessage();
	}
}
