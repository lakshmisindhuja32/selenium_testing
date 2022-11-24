package day1;
//DONT CREATE MODULE FOR THE TEST NG IF MODULE IS CREATED THEN TESTNG CLSES WONT WORK
//FIRST UNMENTIONED PRIORITY METHODS WILL EXECUTE 
//THEN ALL THE METHODS HAVING PRIORITY WILL EXECUTE BASED ON THE PRIORITIES ASSIGNED TO THEM

import org.testng.annotations.Test;

public class Program1 {
  @Test(priority=1)
  public void opening_browser() 
  {
	  System.out.println("applicaation succesfully opened");
  }
  @Test(priority=6)
  
  public void customerdetatils()
  {
	  System.out.println("customer details added succesfully");
  }
 @Test(priority=3)
  
  public void productdetails()
  {
	  System.out.println("product details added succesfully");
  }
 @Test(priority=4)
 
 public void paymentdetails()
 {
	  System.out.println("payment details added succesfully");
 }
 @Test(priority=5)
 
 public void deliveryprocess()
 {
	  System.out.println("deliverd to right address");
 }
 @Test(enabled=false)//this method will be skipped
 
 public void feedbackprocess()
 {
	  System.out.println("feedback sucessfully collected from customers");
 }
 @Test(priority=7)
 
 public void logoff()
 {
	  System.out.println("application succesfully closed");
 }
}
