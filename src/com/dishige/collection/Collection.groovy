package com.dishige.collection

class Collection {

	public static void main(String[] args) {

		def  coll = ["Groovy", "java", "Ruby"]

		assert coll instanceof Collection
		assert coll instanceof ArrayList
	}
}
