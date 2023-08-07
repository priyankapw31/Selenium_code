package testNGExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethod1 {
  @Test
  public void TestMethodd1() {
	  long threadId1 = Thread.currentThread().getId();
	  Reporter.log("tread id of testMethod1:"+threadId1, true);
	  }
  
  @Test
  public void TestMethodd2() {
	  long threadId2 = Thread.currentThread().getId();
	  Reporter.log("tread id of testMethod2:"+threadId2, true);
	  }
}
