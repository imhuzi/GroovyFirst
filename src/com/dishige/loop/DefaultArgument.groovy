package com.dishige.loop

/**
 * 重复输出函数
 * @param val
 * @return
 */

def repeat(val,repeat=4) {
	for (i in 0..repeat) {
		println val
	}
}

//默认重复5次
repeat("default argument")
//重复3次
repeat("set argument",2)
