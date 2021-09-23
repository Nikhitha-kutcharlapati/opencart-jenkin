package pagefactory;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Ebay_search {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"gh-ac\"]")
	WebElement txt_search;
	
	@FindBy(id="gh-cat")
	WebElement choose_category;
	
	@FindBy(id="gh-btn")
	WebElement btn_search;
	
	public Ebay_search(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void selectCategory(String s)
	{
	Select choose = new Select(choose_category);
	choose.selectByVisibleText(s);
	}
	public void setsearchinput(String in) {
		txt_search.sendKeys(in);	
		}
	//method that performs search action
	public void clickonsearchBtn() {
		   btn_search.click();	
		}
	public void getresultofProduct(){
		String productXpath = String.format("//*[@id=\"srp-river-results\"]/ul/li[1]");
		String nthProduct = driver.findElement(By.xpath(productXpath)).getText();
		System.out.println("result of the product ________________________________________");
		
		System.out.println(" ________________________________________");
		
		System.out.println("Nth Product :: "+ nthProduct);
	}
	
	
	public void getNthProduct(int itemNumber){
		String productXpath = String.format("//*[@id=\"srp-river-results\"]/ul/li[%d]", itemNumber);
		String nthProduct = driver.findElement(By.xpath(productXpath)).getText();
		System.out.println("result of the nth product ________________________________________");
		
		System.out.println(" ________________________________________");
		System.out.println("Nth Product :: "+ nthProduct);
	}
	public void getAllProducts() {
		// TODO Auto-generated method stub
		List<WebElement> allProduct = driver.findElements(By.xpath("//*[@id=\"srp-river-results\"]/ul/li"));
		System.out.println("result of all  products ________________________________________");
		for(WebElement product: allProduct){
			System.out.println(" ________________________________________");
			System.out.println(product.getText());
			
			System.out.println("-----------------------------------------");
		}
	}
	
	public void getAllProductsViaScrollDown(){
		List<WebElement> allProduct = driver.findElements(By.xpath("//*[@id=\"srp-river-results\"]/ul/li"));
		Actions action = new Actions(driver);
		System.out.println("result of all  via products ________________________________________");
		
		for(WebElement product: allProduct){
			
			action.moveToElement(product).build().perform(); 
			
			System.out.println(product.getText());
			
			System.out.println("-----------------------------------------");
		}
		}
	
	
}
