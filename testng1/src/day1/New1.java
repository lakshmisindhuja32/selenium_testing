package day1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class New1 {
	
	@BeforeMethod
  
	public void login() {
		System.out.println("first class");
		System.out.println("login sucessfully opened");
	}
	public void operation() {
		System.out.println("performed sucessfully");
	}
	@AfterMethod
	public void close()
	{
		System.out.println("window sucessfully closed");
	}
}
