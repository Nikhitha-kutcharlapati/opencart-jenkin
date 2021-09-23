package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browserfactory {
	
	static WebDriver driver;

	/*public Browserfactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	*/

	public static WebDriver starBrowser(String browser, String url)
	{
		if(browser.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\kunikhit\\OneDrive - Capgemini\\Desktop\\SELENIUM\\haha\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("edge")){
	
			System.setProperty("webdriver.edge.driver","C:\\Users\\kunikhit\\OneDrive - Capgemini\\Desktop\\SELENIUM\\haha\\msedgedriver.exe");
			driver = new EdgeDriver();
			
		}
		else {
			
			System.out.println("Browser is not correct");  
		}
		
		driver.get(url);
		return driver;
	}
}
