package basic_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateRegisterPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("firstname")).sendKeys("Naziya");
		driver.findElement(By.id("lastname:")).sendKeys("Sultana");
		driver.findElement(By.name("Email")).sendKeys("naziyasultana0230@gmail.com");
		
		driver.findElement(By.name("Password")).sendKeys("secret");
		driver.findElement(By.name("Confirm password")).sendKeys("secret");
		
		driver.findElement(By.id("register button")).click();
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
