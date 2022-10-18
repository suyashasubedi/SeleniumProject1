package projectI;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class something extends Object {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium Project\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com");
		//maximize the window
		driver.manage().window().maximize();
		//Creating object of home page

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


	FileUtils.copyFile(src, new File("C:\\Screenshot selenium\\screenshot.png"));

	}

}
