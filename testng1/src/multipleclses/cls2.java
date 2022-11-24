package multipleclses;

import org.testng.annotations.Test;

public class cls2 extends cls1{
  @Test(priority=4)
  public void paymentdetails() {
	  System.out.println("payment sucessfully through credit card");
  }
  @Test(priority=5)
  public void deliveryprocess() {
	  System.out.println("delivered to right address");
  }
  @Test(priority=6)
  public void feedbackprocess() {
	  System.out.println("feedback successfully collected from customers");
  }
  @Test(priority=7)
  public void close() {
	  System.out.println("window successfully closed");
  }
}
