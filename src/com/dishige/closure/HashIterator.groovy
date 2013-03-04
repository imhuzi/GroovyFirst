package com.dishige.closure

class HashIterator {
	public static void main(String[] args) {

		def hash = [name:"Andy","VPN-#":3]
		//好方便呀
		hash.each { key,val ->
			println "${key}:${val}"
		}
	}
}
