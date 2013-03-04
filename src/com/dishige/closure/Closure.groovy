package com.dishige.closure

class Closure {
	public static void main(String[] args) {
		
		/**
		 * 等号后面的代码块是excite的闭包,这个闭包接受一个world参数 
		 * return String 
		 */
		def excite = { world ->
			return "${world}??"
		}
		//调用闭包
		println "-----------直接调用--------"
		println excite("Groovy ")
		println "-----------通过call调用-----------"
		println excite.call("Java ")
	}
}
