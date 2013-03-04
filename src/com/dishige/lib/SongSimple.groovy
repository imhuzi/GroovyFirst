package com.dishige.lib

import com.dishige.groovyclass.Song;


class SongSimple {
	public static void main(String[] args) {
		//好啦，这就用上我们刚才定义的Song类了
		def sng = new Song(name:"胡子",gender:"男",age:23)
		def sng1 = new Song(name:"猴子",gender:"女",age:23)
		def sng3 = new Song()
		sng3.name = "田瓜"
		sng3.gender = "女"
		sng3.age = 12
		
		println sng3.getName()
		sng3.setName("田瓜变臭了哈")
		println sng3.name
		//ok,从上面的代码可以明显看到，Groovy不仅给我们创建了构造函数，还允许传入属性及其值的映射，
		//还可以通过.的语法访问熟悉，而且生成了，标准的getter和setter方法
		
		//还有更高级的,Groovy中接受参数的方法，可以省去括号
		sng.setName "大胡子"
		println sng.getName()
		
		println "-----------再来试试 toString-------------"
		println sng
		println sng.toString()
		//重写下 toString试试
		
		//猜猜下面的代码可以执行成功嘛？
		def sng4 = new Song()
//		assert sng4.name == "tudou"
//		println sng4.name.toUpperCase()
		//我擦，空指针异常，去，还好groovy提供了？安全操作符，是是吧
		println sng4.name?.toUpperCase()
		
	}
}
