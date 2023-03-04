package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// locator by laptop
		System.setProperty("webdriver.chrome.driver", "C:/Users/Pradeep B A/Downloads/Compressed/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// object 
		driver.get("https://demo.guru99.com/v1/index.php");
		
		String expected = "Phoenix";
		String actual = driver.findElement(By.tagName("body")).getText();
		System.out.println(actual); // output
		
		// condition statement
		if(actual.contains(expected))
			System.out.println("Text found");
		else
			System.out.println("Text not found");

	}

}
