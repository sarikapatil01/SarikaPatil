package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupFlag {
	
	//It is to perform group Annotation
	
  @Test(groups = "Functional Testing")
  public void ft1()
  {
	  Reporter.log("FunctionalTestCase1", true);
  }
  
  @Test(groups = "Integration Testing")
  public void it1()
  {
	  Reporter.log("IntegrationTestCase1", true);
  }
  
  @Test(groups = "Smoke Testing")
  public void st1()
  {
	  Reporter.log("SmokeTestCase1", true);
  }
  
  //.....................................................
	
  @Test(groups = "Functional Testing")
  public void ft2()
  {
	  Reporter.log("FunctionalTestCase2", true);
  }
  
  @Test(groups = "Integration Testing")
  public void it2()
  {
	  Reporter.log("IntegrationTestCase2", true);
  }
  
  @Test(groups = "Smoke Testing")
  public void st2()
  {
	  Reporter.log("SmokeTestCase2", true);
  }
//----------------------------------------------------------------------------------------
  
  @Test(groups = "Functional Testing")
  public void ft3()
  {
	  Reporter.log("FunctionalTestCase3", true);
  }
  
  @Test(groups = "Integration Testing")
  public void it3()
  {
	  Reporter.log("IntegrationTestCase3", true);
  }
  
  @Test(groups = "Smoke Testing")
  public void st3()
  {
	  Reporter.log("SmokeTestCase3", true);
  }
  
  //---------------------------------------------------------------------------------------
 @Test(groups = "Functional Testing")
 public void ft4()
 {
	 Reporter.log("FunctinalTestCase4", true);
 }
 @Test(groups = "Integration Testing")
 public void it4()
 {
	  Reporter.log("IntegrationTestCase4", true);
 }
 @Test(groups = "Smoke Testing")
 public void st4()
 {
	  Reporter.log("SmokeTestCase4", true);
 }
//----------------------------------------------------------------------------------------------
 @Test(groups = "Functional Testing")
 public void ft5()
 {
	 Reporter.log("FunctinalTestCase5", true);
 }
 @Test(groups = "Integration Testing")
 public void it5()
 {
	  Reporter.log("IntegrationTestCase5", true);
 }
 @Test(groups = "Smoke Testing")
 public void st5()
 {
	  Reporter.log("SmokeTestCase5", true);
 }
 //---------------------------------------------------------------------------------------------
 @Test(groups = "Functional Testing")
 public void ft6()
 {
	 Reporter.log("FunctinalTestCase6", true);
 }
 @Test(groups = "Integration Testing")
 public void it6()
 {
	  Reporter.log("IntegrationTestCase6", true);
 }
 @Test(groups = "Smoke Testing")
 public void st6()
 {
	  Reporter.log("SmokeTestCase6", true);
 }



 	
  
}
