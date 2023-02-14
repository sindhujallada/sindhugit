package gluegit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authenticationsikulix {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		Screen  s=new Screen();
		s.type("src\\test\\resources\\sikuliximages\\username.png","admin");
		s.type("src\\test\\resources\\sikuliximages\\password.png","admin");
		s.click("src\\test\\resources\\sikuliximages\\signin.png");
//C:\\eclipseworkspace\\org.git\\
	}

}
