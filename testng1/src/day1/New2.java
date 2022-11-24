package day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class New2 {
  @BeforeClass
  public void login() 
  {
	  System.out.println("Second class");
	  System.out.println("welcome to amazon page");
  }
  @Test
  public void operation() 
  {
	  System.out.println("this is my session");
  }
  @AfterClass
  public void logout() 
  {
	  System.out.println("welcome to amazon page");
  }
}
