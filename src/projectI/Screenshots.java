package projectI;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
//import projectI.Home;
//import org.apache.commons.io.FilenameUtils.*;
import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils.*;
public class Screenshots {

	
	public static void main () throws IOException {	
		
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

