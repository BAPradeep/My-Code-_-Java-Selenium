package all;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Pradeep B A/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Lanuch website
		
		driver.get("https://demo.guru99.com/v1/index.php");
		//Thread.sleep(3000);
		//driver.navigate().to("https://www.facebook.com/");
		//
		//driver.navigate().back();
		//
		//driver.navigate().forward();
		//Thread.sleep(3000);
		//driver.navigate().refresh();
		
		String urlname = driver.getCurrentUrl();
		System.out.println("URLname"+urlname);
		Thread.sleep(3000);
		
		String pagesource = driver.getPageSource();
		System.out.println("Pagesource"+pagesource);
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		System.out.println("Title"+title);
		Thread.sleep(3000);
		
		String a = driver.getWindowHandle();
		System.out.println("WindowHandle"+a);
		
		//String b = driver.getWindowHandles();
		//System.out.println("WindowHandles"+b);
		
		driver.close();

	}

}
