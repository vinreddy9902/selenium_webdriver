package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_OrangeHrm {

	public static void main(String[] args) {
		
		//open web browser
		System.setProperty("Webdriver.chrome.driver","C://Drivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		//open URL
		driver.get(" https://opensource-demo.orangehrmlive.com/"); 
		
 
	}

}
