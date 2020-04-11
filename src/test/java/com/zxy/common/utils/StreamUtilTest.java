package com.zxy.common.utils;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class StreamUtilTest {



	@Test
	public void testRead() throws IOException {
	  List<String> list = StreamUtil.read(new File("e:\\data.txt"));
	    for (String string : list) {
			System.out.println(string);
		}
	}

	

}
