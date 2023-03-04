package all;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppleWebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Pradeep B A/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.apple.com/in/");
		
		String URLname =driver.getCurrentUrl();
		System.out.println("URL Name"+URLname);
		Thread.sleep(2000);
		
		String Pagesource = driver.getPageSource();
		System.out.println("PageSource"+Pagesource);
		Thread.sleep(1000);
		driver.close();

	}

}
