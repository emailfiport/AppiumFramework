package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage {

	@FindBy(xpath="//android.widget.EditText[@resource-id='userid']")
	private WebElement Userid;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='password']")
	private WebElement Password;
	
	@FindBy(xpath="//android.view.View[@resource-id='button-login']")
	private WebElement LoginButton;

	@FindBy(name="Login")
	private WebElement Login;
	
	@FindBy(xpath="//android.widget.Spinner[@resource-id='serverurl']")
	private WebElement ServerURL;
	
	@FindBy(name="CompletePath")
	private WebElement CompletePath;
	
	@FindBy(xpath="//android.widget.EditText[@resource-id='localServerCompleteAddress']")
	private WebElement SelectPath;
	
	public LoginPage(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void userid(String userid){
		Userid.clear();
		Userid.sendKeys("hari@fiport.com");;
	}
	
	public void password(String password){
		Password.sendKeys("Monkey12");
	}
	
	public void loginButton(){
		LoginButton.click();
	}
	
	public void login(){
		Login.click();
	}
	
	public void serverUrl(){
		ServerURL.click();
	}

	public void completePath(){
		CompletePath.click();
	}

	public void enterServerUrl(String serverUrl){
		SelectPath.clear();
		SelectPath.clear();
		SelectPath.clear();
		SelectPath.sendKeys(serverUrl);
		System.out.println(SelectPath.getText());
		
		String count = SelectPath.getText();
		int len = count.length();
		for (int i = 0; i <= len; i++) {
			
			 
			
		}
		
		
		
	}
}
