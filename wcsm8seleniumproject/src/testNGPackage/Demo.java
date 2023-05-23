package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	  
	  //Massage display only output Console
	  //System.out.println("Hello TestNG !!");
	  
	  //Massage display only  HTML report
	  //Reporter.log("Hii TestNG");
	  
	  //Massage display both output console and HTML repoter
	  Reporter.log("Hii TestNG!!", true);
	  
	  
	  
  }
  @Test
  public void g() {
	  
	  //Massage display only output Console
	  //System.out.println("Hii Sarika");
	  
	  //Massage display only HTML report
	  //Reporter.log("Hii Sarika");
	  
	  //Massage display both output console and HTML repoter
	  Reporter.log("Hii Sarika!!", true);
	  
  }
  
  
}
