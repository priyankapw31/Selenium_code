package testNGAnnotation_Flags;

import org.testng.annotations.Test;

public class Flag5 {
  @Test
  public void loginMethod() 
  {
	  System.out.println("login page is open");
  }
  
  @Test(dependsOnMethods = "loginMethod")
  public void createUserMethod()
  {
	  System.out.println("create user page is open");
  }
  
  @Test(dependsOnMethods = "createUserMethod")
  public void logoutMethod()
  {
	  System.out.println("logout page is open");
  }
}
