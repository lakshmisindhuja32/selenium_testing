package amazonpage;


import org.testng.annotations.AfterTest;

public class closing extends acls2 {
  
  @AfterTest
  public void close() {
	  d.close();
  }

}
