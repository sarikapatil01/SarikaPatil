package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodFlag {
  @Test(description ="Login TestCase")
  public void loginMethod()
  {
	  Reporter.log("Login Performed !!",true);
  }
  @Test(description = "CreateUser TestCase", dependsOnMethods = "loginMethod")
  public void createUserMethod()
  {
	  Reporter.log("User Created", true);
  }
  @Test(description = "LogOut TestCase", dependsOnMethods = "createUserMethod")
  public void logoutMethod()
  {
	  Reporter.log("logout Performed", true);
  }
}
