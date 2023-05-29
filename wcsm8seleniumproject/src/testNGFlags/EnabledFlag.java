package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag {
	
	//Method or Annotation is Enabled or Disabled
	
  @Test(enabled = false , description = "Login Method")
  public void method1() 
  {
	  Reporter.log("Login Performed", true);
  }
  
  @Test(enabled = true, description = "LogOut Method")
  public void method2()
  {
	  Reporter.log("LogOut Performed", true);
  }
}
