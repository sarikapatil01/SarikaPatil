package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountFlag {
	
	//use to execute Annotation or method multiple time !!
	
  @Test(invocationCount = 10)
  public void method1() 
  {
	  Reporter.log("Login test case", true);
  }
}
