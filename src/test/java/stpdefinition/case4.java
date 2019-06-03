package stpdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case4 {
	WebDriver driver;
	@Given("user launches TestMeApp")
	public void user_launches_TestMeApp() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.findElement(By.linkText("SignIn")).click();
	 
	}

	@When("user enters a username")
	public void user_enters_a_username() {
		
		driver.findElement(By.name("userName")).sendKeys("lalitha");
	}

	@When("user enters a pssword")
	public void user_enters_a_pssword() {
		driver.findElement(By.name("password")).sendKeys("password123");
	}

	@Then("user clicks on ok")
	public void user_clicks_on_ok() {
		driver.findElement(By.cssSelector("input[name='Login'][type='submit']")).click();
	    
	}

	@When("user search for product")
	public void user_search_for_product() {
		 driver.findElement(By.name("products")).sendKeys("Shopping bag");
	    
	}

	@Then("clicks FIND DETAILS")
	public void clicks_FIND_DETAILS() {
		driver.findElement(By.cssSelector("input[value='FIND DETAILS'][type='submit']")).click();
	}

	@When("user clicks Add to cart")
	public void user_clicks_Add_to_cart() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@When("user clicks cart")
	public void user_clicks_cart() {
		
		driver.findElement(By.xpath("//*[@href='displayCart.htm']")).click();
	}

	@When("user clicks Checkout")
	public void user_clicks_Checkout() {
		driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a")).click();
	}

	@When("user clicks proceed to pay")
	public void user_clicks_proceed_to_pay() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@value='Proceed to Pay'][@type='submit']")).click();
	        Thread.sleep(3000);
	}

	@When("user selects bank and clicks continue")
	public void user_selects_bank_and_clicks_continue() {
		  driver.findElement(By.xpath("//label[contains(text(),'HDFC Bank')]")).click();
		  driver.findElement(By.xpath("//a[@id='btn']")).click();
	 
	}

	@When("user enters a username and password")
	public void user_enters_a_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("password123");
	   
	}

	@Then("clicks Login")
	public void clicks_Login() {
		driver.findElement(By.cssSelector("input[value='LOGIN'][type='submit']")).click();
	}



}
