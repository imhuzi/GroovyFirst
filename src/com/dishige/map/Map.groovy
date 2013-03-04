package com.dishige.map

def hash = [name:"Andy","VPN-#":3]

println hash
//就是java中的hash map,顺便复习下java的集合框架
assert hash.getClass() == java.util.LinkedHashMap
//可以和java中一样去操作
hash.put("id", 12)
assert hash.get("name") == "Andy"

//也可以和javascript中一样去操作，爽歪歪
hash.dob = "12/34/45"
assert hash.dob == "12/34/45"
println hash

//哇草，简直就是在写javascript嘛，爽
assert hash.name == "Andy"
hash["gender"] = "male"
assert hash.gender == "male"
assert hash["gender"] == "male"

println hash