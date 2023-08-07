package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod22 {
 
	  @Test
	  public void TestMethodd3() {
		  long threadId3 = Thread.currentThread().getId();
		  Reporter.log("tread id of testMethod3:"+threadId3, true);
		  }
	  
	  @Test
	  public void TestMethodd4() {
		  long threadId4 = Thread.currentThread().getId();
		  Reporter.log("tread id of testMethod4:"+threadId4, true);
		  }
	
}
