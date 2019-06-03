package stpdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case3 {
	WebDriver driver;
	@Given("User launching TestMeApp")
	public void user_launching_TestMeApp() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.findElement(By.linkText("SignIn")).click();
	  
	  
	}

	@When("user enters username")
	public void user_enters_username() {
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		
	    
	}

	@When("user enters password")
	public void user_enters_password() {
		driver.findElement(By.name("password")).sendKeys("password123");
	    
	}

	@Then("user clicks Login")
	public void user_clicks_Login() {
		driver.findElement(By.cssSelector("input[name='Login'][type='submit']")).click();
	 
	}

	@When("user clicks the search field and enters the product name")
	public void user_clicks_the_search_field_and_enters_the_product_name() {
		 driver.findElement(By.name("products")).sendKeys("Shopping bag");   
	  
	}

	@Then("user clicks FIND DETAILS")
	public void user_clicks_FIND_DETAILS() {
		driver.findElement(By.cssSelector("input[value='FIND DETAILS'][type='submit']")).click();
	}

/*	@Given("user clicks add to cart button")
	public void user_clicks_add_to_cart_button() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	    
	}

	@When("user clicks cart button shopping cart page will be displayed")
	public void user_clicks_cart_button_shopping_cart_page_will_be_displayed() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchSubCat.htm?val=search");
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")).click();
	}

	@Then("user clicks checkout")
	public void user_clicks_checkout() {
		driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a")).click();
	   
	}

	@Given("user will be directed to payment page")
	public void user_will_be_directed_to_payment_page() {
	   
	}

	@When("user clicks proceed to payment")
	public void user_clicks_proceed_to_payment() {
		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	}

	@When("user will be redirected to bank page")
	public void user_will_be_redirected_to_bank_page() {
		 driver.get("http://10.232.237.143:443/PaymentGateway/getOrderDetails.htm");
		
	    
	}

	@When("user clicks continue")
	public void user_clicks_continue() {
		driver.findElement(By.xpath("//*[@id='btn']")).click();
	    
	}

	@When("user enters a username as {string}")
	public void user_enters_a_username_as(String username) {
		driver.findElement(By.name("username")).sendKeys("lalitha");
	}

	@When("user enters a password as {string}")
	public void user_enters_a_password_as(String pswd) {
		driver.findElement(By.name("password")).sendKeys("password123");
	}

	@Then("clicks login")
	public void clicks_login(io.cucumber.datatable.DataTable dataTable) {
		driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	    
	}*/

}
