
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TempTest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento2demo.rootways.com/");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//body/div/div/div/div[@id='store.menu']/div/nav/ul[@id='rw-menutop']/li[2]/a[1]"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//body/div/div/div/div[@id='store.menu']/div/nav/ul[@id='rw-menutop']/li[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[2]"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//ul[@id='rw-menutop']//div//div//div//ul//li//ul//li//span[contains(text(),'Domande giudiziali 1')]"))).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'testing')]")).click();
	}

}
	
	
