package tests;

import org.testng.*;
import org.testng.annotations.*;

public class TaskTests {
	@Test
	public void test1(){
		Boolean boolTrue = true;

		Assert.assertEquals(boolTrue, true, "Assert message 1");
	}

	@Test
	@Parameters({"hey"})
	public void test2(String str){
		Boolean boolTrue = true;

		System.out.println(str);

		Assert.assertEquals(boolTrue, false, "Assert message 2");
	}
}
