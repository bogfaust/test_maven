package tests;

import org.testng.*;
import org.testng.annotations.*;

public class TaskTests {
	@Test
	public void test1(){
		Boolean boolTrue = true;

		Assert.assertEquals(boolTrue, false, "Assert message");
	}
}
