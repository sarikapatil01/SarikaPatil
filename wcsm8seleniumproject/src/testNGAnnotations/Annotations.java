package testNGAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void f()
  {
	  Reporter.log("Test Annotation", true);
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("Before method Annotation", true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("AfterMethod Annotation", true);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("BeforeClass Annoation", true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("AfterClass Annotion", true);
  }

  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("BeforeTest Annotation", true);
  }

  @AfterTest
  public void afterTest()
  {
	  Reporter.log("AfterTest Annotion", true);
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  Reporter.log("BeforeSuite Annotion", true);
  }

  @AfterSuite
  public void afterSuite() 
  {
	  Reporter.log("AfterSuite Annotion", true);
	 
  }
  @Test
  public void testMethod()
  {
	  Reporter.log("Test Annotion2", true);
  }

}
