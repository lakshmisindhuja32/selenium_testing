package multipleclses;

import org.testng.annotations.Test;

public class cls1 {
  @Test(priority=1)
  public void login() {
	  System.out.println("welcome to new tours");
	  
  }
  @Test(priority=2)
  public void customerdetails() {
	  System.out.println("customer details succesfully updated");
	  
  }
  @Test(priority=3)
  public void productdetails() {
	  System.out.println("product details are sucessfully updated");
	  
  }
}
