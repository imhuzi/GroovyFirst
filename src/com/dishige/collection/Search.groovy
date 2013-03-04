package com.dishige.collection

def coll = ["Groovy", "Java", "Ruby"];
coll.add("Python");
coll << "smalltalk"
coll[5] = "perl"
//集合中检索
assert coll[1] == "Java"

//不可以在集合中增加或者去掉集合
def numbers = [1,2,3,4]

assert numbers + 5 == [1,2,3,4,5]
assert numbers - [2,3] == [1,4]


