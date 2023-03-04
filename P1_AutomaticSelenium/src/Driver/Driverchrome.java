package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverchrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Pradeep B A/Downloads/Compressed/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Lanuch website
		
	//	driver.get("https://www.facebook.com/");
		//Thread.sleep(3000);
		
	//	driver.navigate().to("https://demo.guru99.com/v1/index.php");
		
	//	driver.navigate().back(); // <-- previous
		
	//	driver.navigate().forward(); // next -->
		//Thread.sleep(3000);
		
		//driver.navigate().refresh();  // reload
		
		driver.get("https://demo.guru99.com/v1/index.php");
		/*
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
		*/
		
		driver.findElement(By.name("uid")).sendKeys("mngr476493");
		
		driver.findElement(By.name("password")).sendKeys("tAqEtun");
		
		driver.findElement(By.cssSelector("input[type=submit][name=btnLogin]")).click();
		
		driver.findElement(By.partialLinkText("Edit Customer")).click();
		
		driver.navigate().back();
		
		//driver.findElement(By.name("cusid")).sendKeys("1254636");
		
		//driver.findElement(By.name("AccSubmit")).click();
		
		
		
		driver.findElement(By.linkText("New Customer")).click();
		driver.findElement(By.name("name")).sendKeys("Pradeep");
		//driver.findElement(By.linkText("male")).click();
		//driver.findElement(By.cssSelector("input[name=dob][id=dob]")).click();
		driver.findElement(By.name("addr")).sendKeys("3rd cross royal area left winvinaya foundation btm bengaluru = 560100");
		driver.findElement(By.name("city")).sendKeys("Bengaluru");
		driver.findElement(By.name("state")).sendKeys("Karnataka");
		driver.findElement(By.name("pinno")).sendKeys("560100");
		driver.findElement(By.name("telephoneno")).sendKeys("9876543210");
		driver.findElement(By.name("emailid")).sendKeys("Pradeep@gamil.com");
		driver.findElement(By.name("sub")).click();
		
		
		
		//driver.findElement(By.linkText("Log out")).click();
		
		
		
		driver.close();


	}

}
