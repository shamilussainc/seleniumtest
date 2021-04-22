package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driver {
	public WebDriver driver;
	
	
	public void fox(String url){
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
	
	public void chrome(String url) {
		WebDriverManager.chromedriver().setup();				
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars");
		options.addArguments("--disable-extensions");
		options.addArguments("window-size=1024,768", "--no-sandbox");
		DesiredCapabilities dc = new DesiredCapabilities();
	    dc.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(options); 	
		driver.navigate().to(url);
		driver.manage().window().maximize();
	}
}