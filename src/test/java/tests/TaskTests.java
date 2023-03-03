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
	public void test2(){
		Boolean boolTrue = true;

		Assert.assertEquals(boolTrue, false, "Assert message 2");
	}
}
