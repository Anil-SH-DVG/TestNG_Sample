package example_1;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class Example_Listeners {
	
	@Test
	public void test1() {
		System.out.println("this is test1...");
		Assert.assertEquals(1, 1);
	}
	
	@Test
	public void test2() {
		System.out.println("this is test2...");
		Assert.assertEquals(1, 2);
	}
	
	@Test
	public void test3() {
		System.out.println("this is test3...");
		throw new SkipException("This method is skipped...");
	}

}
