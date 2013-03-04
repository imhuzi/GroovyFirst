package com.dishige.collection

class Jion {
	public static void main(String[] args) {
		def numbers = [1, 2, 3, 4]

		assert numbers.join(",") == "1,2,3,4"
		assert [1, 2, 3, 4, 3].count(3) == 2
		
		assert ["JAVA", "GROOVY"] ==
		  ["Java", "Groovy"]*.toUpperCase()

	}
}