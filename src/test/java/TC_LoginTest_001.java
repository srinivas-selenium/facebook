import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pro.pageobjects.LoginPage;
import com.pro.testcases.BaseClass;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws Exception{
		
		driver.get(baseURL);
		logger.info("Url is Open");
		LoginPage login= new LoginPage(driver);
		logger.info("Enter user name");
		login.setUserName(username);
		logger.info("Enter Password ");
		login.setPassword(password);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		login.clickLogin();
		
		if(driver.getTitle().equalsIgnoreCase("Facebook – log in or sign up"))
		{
			Assert.assertTrue(true);
			logger.info("Login test pass");
		}
		else {
			captureScreen(driver, "failed");
			Assert.assertFalse(false);
			logger.info("Login test faild");
		}
	}

	
}
