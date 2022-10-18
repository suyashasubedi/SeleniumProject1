package projectI;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;


//import java.time.Duration;
//import java.util.concurrent.TimeUnit;
public class LogIn {

	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public LogIn(WebDriver driver) {
          this.driver= driver;
        //  PageFactory.initElements(driver,this);
	}
	
	//Locator for username field
//	WebDriverWait wait=new WebDriverWait(driver, 10);
//	By uName = By.id("loginusername");
	
	//Locator for password field
	By pswd = By.id("loginpassword");
	
	
	
	//Locator for login button
	By loginBtn = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
	
	
	//Method to enter username
	public void enterUsername(String user) {
		
		//@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement uName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginusername\"]")));
		uName.sendKeys(user);
		//String ExpectedText = "testmorning";
		//Assert.assertEquals(ExpectedText,uName.getText());
		
		//System.out.println("uName is as expected - Assert passed");
	}

	//Method to enter password
	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys(pass);
		//Assert.assertEquals(pass,pswd);
		//System.out.println("password is as expected - Assert passed");

	}
	
	//Method to click on Login button
	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}

}
