package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import generics.BaseTest;
import generics.GenericClass;
import pom.LoginPage;

public class VerifyLogin extends BaseTest {

	String userid = GenericClass.getProperties("USERID");
	String password = GenericClass.getProperties("PASSWORD");
	String serverUrl = GenericClass.getProperties("URL");

	@Test
	public void testVerifyLogin() throws InterruptedException {
		LoginPage l = new LoginPage(driver);
		

		try {
			wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(By.name("Login")));

			l.login();
			l.userid(userid);
			l.password(password);
			l.loginButton();

			wait.until(ExpectedConditions.elementToBeClickable(By.name("SKIP"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@content-desc='CLOSE']"))).click();
			Thread.sleep(5000);
			driver.tap(1, 50, 90, 2);

			wait.until(ExpectedConditions.elementToBeClickable(By.name("Logout"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.name("LOGIN"))).click();
			
			loginToLocalServer();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	
	public void loginToLocalServer() throws InterruptedException{
		LoginPage l = new LoginPage(driver);
		l.userid(userid);
		l.password(password);
		l.serverUrl();
		l.completePath();
		Thread.sleep(3000);
		
		l.enterServerUrl(serverUrl);
		l.loginButton();
		Thread.sleep(5000);
		
	}
	
}
