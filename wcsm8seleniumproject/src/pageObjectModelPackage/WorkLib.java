package pageObjectModelPackage;

public class WorkLib extends BaseTest{
	
	public void handleConfermationPopup()
	{
		driver.switchTo().alert().accept();
	}

}
