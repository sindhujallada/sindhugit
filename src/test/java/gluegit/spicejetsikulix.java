package gluegit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class spicejetsikulix {

	public static void main(String[] args) throws Exception { 
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Screen sc=new Screen();
		if(sc.exists("src\\test\\resources\\sikuliximages\\allow.png",5000)!=null)
		{
			//sc.click("src\\test\\resources\\sikuliximages\\allow.png");
			sc.click("src\\test\\resources\\sikuliximages\\allow.png");
		}
		
	}

}
