package stepdefinition;

import java.util.List;


//import org.junit.runners.Parameterized.Parameter;
//import static org.junit.Assert.assertEquals;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.Ebay_search;
import pagefactory.Browserfactory;

public class Searchon_ebay {
	WebDriver driver;
	Ebay_search elp;
	Browserfactory bf;

	

	@Given("Open anybrowser of choice and navigate to ebay home page")
	public void open_anybrowser_of_choice_and_navigate_to_ebay_home_page() throws Exception {
		 driver =	Browserfactory.starBrowser("chrome","https://www.ebay.com/");  
		 			
	}
	
	@When("User enters search input {string} in search box")
	public void user_enters_search_input_in_search_box(String string) {
		elp= new Ebay_search(driver);
		elp.setsearchinput("watches");
	}
	
	@When("user selects the category {string} of choice")
	public void user_selects_the_category_of_choice(String string) {
		elp= new Ebay_search(driver);
		elp.selectCategory("Jewelry & Watches");
	}
	
	@When("Click on search button")
	public void click_on_search_button() {
		elp.clickonsearchBtn();
	}
	
	@When("print the result of the product")
	public void print_the_result_of_the_product() {
	   elp.getresultofProduct();
	}
	@When("Print all the products in first page")
	public void print_all_the_products_in_first_page() {
	   elp.getAllProducts();
	}
	@When("display nth product details")
	public void display_nth_product_details() {
	   elp.getNthProduct(5);
	}
	
	@When("print all the products along with scroll down")
	public void print_all_the_products_along_with_scroll_down() {
	  elp.getAllProductsViaScrollDown();
	}
	
	@Then("User should able to see the search results")
	public void user_should_able_to_see_the_search_results() {
		System.out.println("---------successfull------------------------------");
			
	}
}





	