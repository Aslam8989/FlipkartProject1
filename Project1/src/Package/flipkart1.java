package Package;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.Year;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class flipkart1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream file=new FileInputStream("./src/test/resources/Data1.properties");
		Properties p=new Properties();
		p.load(file);
		String URL=p.getProperty("URL");
		String SEARCH= p.getProperty("SEARCH");
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(URL);
		BaseClass1 bs=new BaseClass1(driver);
		bs.SearchBar.sendKeys(SEARCH+Keys.ENTER);
		bs.Brand.click();
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		act.scrollToElement(bs.Ram).build().perform();
		act.moveToElement(bs.Ram).click().build().perform();
		Thread.sleep(2000);
		
		bs.Phone.click();
		WebElement p1=bs.Price;
		System.out.println(p1.getText());
	//	driver.quit();
		
	}

}
