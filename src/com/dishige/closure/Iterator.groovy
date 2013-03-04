package com.dishige.closure

import java.io.ObjectInputStream.ValidationList;

/**
 * 
 * @author wh
 *
 */
class Iterator {
	public static void main(String[] args) {

		def acoll = ["Groovy", "Java", "Ruby"]
		
		//  java中的迭代方法，好麻烦呀，写这么多
		for (java.util.Iterator iter = acoll.iterator(); iter.hasNext();) {
			println iter.next()
		}
		
		// Groovy 中的迭代，擦，就这么点儿
		println "------------Groovy Iterator-----------"
		acoll.each {
			println it
		}
		
		// it是吗神？ 可以替换嘛？是是看？
		println "-------------替换 it 后的结果--------------"
		acoll.each { val ->
			println val
		}
	}
}