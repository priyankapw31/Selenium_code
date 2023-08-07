package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod33 {
  @Test
  public void TestMethodd5() {
	  long threadId5 = Thread.currentThread().getId();
	  Reporter.log("tread id of testMethod5:"+threadId5, true);
	  }
  
  @Test
  public void TestMethodd6() {
	  long threadId6 = Thread.currentThread().getId();
	  Reporter.log("tread id of testMethod6:"+threadId6, true);
	  }
}
