package com.dishige.groovyclass


/**
 * 一个简单的类就这么完成啦
 * @author wh
 *
 */
class Song {
	def name
	def gender
	def age
	String toString() {
		"我的名字叫：${name},性别：${gender},今年${age}岁."
		//return 呢？，在groovy中是可以省略return的
	};
}
