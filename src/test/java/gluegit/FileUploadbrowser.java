package gluegit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadbrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("identifier")).sendKeys("sindhujaalladacma@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		driver.findElement(By.name("Passwd")).sendKeys("Dishan@111");
		driver.findElement(By.xpath("//span[text()='Next']/parent::button")).click();
		

	}

}
