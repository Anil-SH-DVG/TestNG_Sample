package example_1;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener{
	
	public void onStart(ITestContext arg) {
		System.out.println("starts execution at class level......."+arg.getName());
	}
	
	public void onFinish(ITestContext arg) {
		System.out.println("finish test execution at class level......"+arg.getName());
	}
	
	public void onTestStart(ITestResult arg) {
		System.out.println("starts test at method level........"+arg.getName());
	}
	
	public void onTestSuccess(ITestResult arg) {
		System.out.println("test is completed successfully......."+arg.getName());
	}
	
	public void onTestFailure(ITestResult arg) {
		System.out.println("test failed......."+arg.getName());
	}
	
	public void onTestSkipped(ITestResult arg) {
		System.out.println("test skipped......."+arg.getName());
	}
}
