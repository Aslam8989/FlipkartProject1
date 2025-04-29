package Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BaseClass1 {

	WebDriver driver;
	
	@FindBy(xpath="//input[@class=\"Pke_EE\"]")
	 WebElement SearchBar;
	
	@FindBy(xpath = "//div[@data-tkid='8eb0f9fd-b511-4347-adc3-cd440b00afc9.mobile under 10000']")
	 WebElement Suggestion;
	
	@FindBy(xpath = "//div[text()='vivo']")
	 WebElement Brand;
	
	@FindBy(xpath = "//div[text()='4 GB']")
	 WebElement Ram;
	
	@FindBy(xpath = "//div[contains(text(),'vivo Y18t (Gem Green, 128 GB)')]")
	WebElement Product;
	
	@FindBy(xpath = "(//div[@class='KzDlHZ'])[1]")
	WebElement Phone;
	
	@FindBy(xpath = "//div[text()='vivo Y22 (Starlit Blue, 64 GB)']")
	WebElement Detail;
	
	@FindBy(xpath = "(//div[text()='₹8,909'])[1]")
	WebElement Price;
	
	public BaseClass1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	//utilization
	
	public WebElement getSearchbar() {
		return SearchBar;
	}
	public WebElement getBrand() {
		return Brand;
	}
	public WebElement getRam() {
		return Ram;
	}
	public WebElement getProduct() {
		return Product;
	}
	
	public WebElement getDetail() {
		return Detail;
	}
	public WebElement getPrice() {
		return Price;
	}
	public WebElement getPhone() {
		return Phone;
	}
}
