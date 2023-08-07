package testNGAnnotation_Flags;

import org.testng.annotations.Test;

public class Groups {
  @Test(groups = "FT")
  public void ft1() 
  {
	  System.out.println("ft1");
  }
  @Test(groups = "ST")
  public void st1() 
  {
	  System.out.println("st1");
  }
  @Test(groups = "IT")
  public void it1() 
  {
	  System.out.println("it1");
  }
  @Test(groups = "FT")
  public void ft2() 
  {
	  System.out.println("ft2");
  }
  @Test(groups = "ST")
  public void st2() 
  {
	  System.out.println("st2");
  }
  @Test(groups = "IT")
  public void it2() 
  {
	  System.out.println("it2");
  }
  @Test(groups = "FT")
  public void ft3() 
  {
	  System.out.println("ft3");
  }
  @Test(groups = "ST")
  public void st3() 
  {
	  System.out.println("st3");
  }
  @Test(groups = "IT")
  public void it3() 
  {
	  System.out.println("it3");
  }
  @Test(groups = "FT")
  public void ft4() 
  {
	  System.out.println("ft4");
  }
  @Test(groups = "ST")
  public void st4() 
  {
	  System.out.println("st4");
  }
  @Test(groups = "IT")
  public void it4() 
  {
	  System.out.println("it4");
  }
  
}
