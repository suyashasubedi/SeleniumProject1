package projectI;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Contact {

	WebDriver driver;
	
	public Contact(WebDriver driver) {
		this.driver = driver;	
		 // PageFactory.initElements(driver,this);
	
		
	}
	
	By contactUrl = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");
	By contactname = By.id("recipient-name");
	By messageText = By.id("message-text");
	
	public void conntact() {
		driver.findElement(contactUrl).click();
		
	}
	
	public void enterEmail(String email) {
		
		//@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement contactEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("recipient-email")));
		contactEmail.sendKeys(email);
		//SoftAssert assertion = new SoftAssert();
		//System.out.println("Test for email started");
		//String ExpectedText = "abc@gmail.com";
		//assertion.assertEquals(ExpectedText,"abc");
		
		//System.out.println("Email is as expected - Assert passed");
		//assertion.assertAll();
	}
	
	public void enterName(String Name) {
	driver.findElement(contactname).sendKeys(Name);
	//Assert.assertEquals(contactname,Name);
	//System.out.println("contactname is as expected - Assert passed");
	

	
	}

	public void enterMessage(String message) {
		
		driver.findElement(messageText).sendKeys(message);
		//Assert.assertEquals(messageText, message);
		//System.out.println("messageText is as expected- Assert passed");
	}

}
