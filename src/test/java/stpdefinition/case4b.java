package stpdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case4b {
	WebDriver driver;
	@Given("user launches testmeapp")
	public void user_launches_testmeapp() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enters user name")
	public void user_enters_user_name() {
		driver.findElement(By.name("userName")).sendKeys("lalitha");
	  
	}

	@When("user enters pass word")
	public void user_enters_pass_word() {
		driver.findElement(By.name("password")).sendKeys("password123");

	}

	@When("user clicks on Login")
	public void user_clicks_on_Login() {
		driver.findElement(By.cssSelector("input[name='Login'][type='submit']")).click();
	}

	@When("user search for a product")
	public void user_search_for_a_product() {
		 driver.findElement(By.name("products")).sendKeys("Shopping bag");   
	}

	@Then("clicks find details")
	public void clicks_find_details() {
		driver.findElement(By.cssSelector("input[value='FIND DETAILS'][type='submit']")).click();
	   
	}

	@Then("user tries to purchase a product without adding into cart")
	public void user_tries_to_purchase_a_product_without_adding_into_cart() {
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement link:links)
		{
			System.out.println(link.getText());
		}
		for(WebElement link:links)
		{
			if(link.getText().equals("Add to cart"));
			{
				driver.close();
			}
		}
	  
	}

}
