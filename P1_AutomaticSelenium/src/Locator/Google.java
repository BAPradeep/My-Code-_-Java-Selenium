package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Pradeep B A/Downloads/Compressed/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Launching the browser
		driver.get("https://www.google.com/");
		
		//driver.findelement(By.className("argu")).sendKeys("Selenium")'
		driver.findElement(By.className("gLFyf")).sendKeys("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("btnK")).click();

	}

}
r