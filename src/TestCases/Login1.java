package TestCases;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



//import org.openqa.selenium.WebElement;

import projectI.Contact;
import projectI.Home;
import projectI.LogIn;

public class Login1 {
 public WebDriver driver;
 
 
Home homes;
LogIn login;
Contact Contacts;



@BeforeTest

public void beforetest() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium Project\\src\\Driver\\chromedriver.exe");
	


	driver = new ChromeDriver();
	driver.get("https://www.demoblaze.com");
	
	
	
}
@Test
	public void f() throws InterruptedException {
	
		
	System.out.println("The test is running");
	
	 LogIn login = new LogIn(driver);
	
	Home homes = new Home(driver);

	

	homes.clickLogin();
	Thread.sleep(2000);
	SoftAssert softAssert = new SoftAssert();
	

	//Enter username & password
	login.enterUsername("testmorning");
	
	softAssert.assertEquals(false, true);
	
	System.out.println("username is as expected - Assert passed");
	
	
	Thread.sleep(2000);
	login.enterPassword("test123");
	
	softAssert.assertEquals(false, true);
	System.out.println("password is as expected - Assert passed");
	
	
	Thread.sleep(2000);
	
	
	//Click on login button
	login.clickLogin();
	Thread.sleep(2000);
	
	Contact contacts = new Contact(driver);
	contacts.conntact();
	
	contacts.enterEmail("abc@gmail.com");
	softAssert.assertEquals(true, true);

	
	
	
	System.out.println("email is as expected - Assert passed");
	
	Thread.sleep(2000);

	contacts.enterName("User1");
	Thread.sleep(2000);
	
	softAssert.assertEquals(false, true);
	System.out.println("user-name is as expected - Assert passed");
	
Thread.sleep(2000);
	contacts.enterMessage("This is message");
	
	softAssert.assertEquals(true, true);
	System.out.println("uName is as expected - Assert passed");
	
	softAssert.assertAll();
	Thread.sleep(2000);
	}
	
	               //Close browser instance
	@AfterTest
	public void aftertest() {
	System.out.println("This is after test");
	driver.quit();
		}
	}



