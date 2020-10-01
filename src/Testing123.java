import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing123 {

	public static void main(String[] args) {
		Logger log=Logger.getLogger(Testing123.class);
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//System.out.println("Browser launched");
		log.info("Browser launched");
		log.error("test");
		driver.quit();
		//System.out.println("Browser Closed");
		log.info("Browser Closed");

	}

}
