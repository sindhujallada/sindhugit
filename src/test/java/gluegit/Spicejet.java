package gluegit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicejet {
	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(co);
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
	}

}
