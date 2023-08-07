package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
  @Test(groups = "Functional Test Case")
  public void ft1() 
  {
	  Reporter.log("ftc1", true);
  }
  
  @Test(groups = "Integration Test Case")
  public void it1() 
  {
	  Reporter.log("itc1", true);
  }
  
  @Test(groups = "System Test Case")
  public void st1() 
  {
	  Reporter.log("stc1", true);
  }
  //..............................................................................................
  @Test(groups = "Functional Test Case")
  public void ft2() 
  {
	  Reporter.log("ftc2", true);
  }
  
  @Test(groups = "Integration Test Case")
  public void it2() 
  {
	  Reporter.log("itc2", true);
  }
  
  @Test(groups = "System Test Case")
  public void st2() 
  {
	  Reporter.log("stc2", true);
  }
  //................................................................................................
  @Test(groups = "Functional Test Case")
  public void ft3() 
  {
	  Reporter.log("ftc3", true);
  }
  
  @Test(groups = "Integration Test Case")
  public void it3() 
  {
	  Reporter.log("itc3", true);
  }
  
  @Test(groups = "System Test Case")
  public void st3() 
  {
	  Reporter.log("stc3", true);
  }
}
