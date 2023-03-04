package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example10_DataProvider {
  @Test(dataProvider = "loginData")
  public void login(String userName1, String password1) {
	  
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver = new EdgeDriver();
	 
	 // url 
	 driver.get("https://demo.guru99.com/V1/index.php");
	 //Username
	 WebElement username = driver.findElement(By.xpath("//input[@name='uid']"));
	 username.sendKeys(userName1);
	 //Password
	 WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	 password.sendKeys(password1);
	 // click on submit
	 driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	 //exit to browser
	 driver.close();
  }
  
  @DataProvider(name = "loginData")
  public Object[][] getData(){
	  Object[][] data = new Object[3][2];
	  data[0][0]="pradeep";
	  data[0][1]="4587990";
	  data[1][0]="ersdfdfa";
	  data[1][1]="852963741";
	  data[2][0]="pradeep";
	  data[2][1]="&*()";
	  
	  return data;
  }
}
