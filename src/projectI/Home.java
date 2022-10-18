package projectI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



//import org.openqa.selenium.support.PageFactory;

public class Home {
 WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Home(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver,this);
	}
	

	//Locator for login button
	By LoginUrl = By.id("login2");
	
	
	public void maximize_window() {
		driver.manage().window().maximize();
	}
	
	//Method to click login button
	public void clickLogin() {
		driver.findElement(LoginUrl).click();
	}

}
