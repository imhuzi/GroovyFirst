package com.dishige.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.dishige.groovyclass.Song;

public class SongTest {

	@Test
	public void testToString(){
		Song song = new Song();
		song.setName("胡子");
		song.setGender("男");
		song.setAge(23);
		
		Assert.assertEquals("我的名字叫：胡子,性别：男,今年23岁.", song.toString());
	}

}
