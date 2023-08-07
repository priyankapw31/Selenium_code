package testNGAnnotation_Flags;

import org.junit.AfterClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsClass {
  @Test
  public void Method1() {
	  Reporter.log("TestAnnotation", true);
  }
  
  @AfterMethod
  public void Method2()
  {
	 Reporter.log("AfterMethod1Annotation", true); 
  }
  
  @AfterSuite
  public void Method3()
  {
	 Reporter.log("AfterSuiteAnnotation", true); 
  }
  
  @AfterClass
  public void Method4()
  {
	 Reporter.log("AfterClassAnnotation", true); 
  }
  
  @AfterTest
  public void Method5()
  {
	 Reporter.log("AfterTestAnnotation", true); 
  }
  
  @BeforeMethod
  public void Method6()
  {
	 Reporter.log("BeforeMethod2Annotation", true); 
  }
  
  @BeforeClass 
  public void Method7()
  {
	 Reporter.log("BeforeClassAnnotation", true); 
  }
  
  @BeforeSuite 
  public void Method8()
  {
	 Reporter.log("BeforeSuiteAnnotation", true); 
  }
  @BeforeTest 
  public void Method9()
  {
	 Reporter.log("BeforeTestAnnotation", true); 
  }
}
