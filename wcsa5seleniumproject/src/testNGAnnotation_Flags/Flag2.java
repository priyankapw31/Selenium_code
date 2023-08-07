package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	 @Test(description="login method1",enabled=true)
	  public void method1() {
		  Reporter.log("method1 from flag1");
	  }
	  
	  @Test(description="logout method2",enabled=false)
	  public void method2() {
		  Reporter.log("method2 from flag2");
	  }
}
