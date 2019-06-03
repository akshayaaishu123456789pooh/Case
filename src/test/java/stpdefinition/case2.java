package stpdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case2 {
	WebDriver driver;
	@Given("user launching TestMeApp")
	public void user_launching_TestMeApp() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.findElement(By.linkText("SignIn")).click();
		
	   
	}

	@When("user enters username as {string} And enter password as {string}")
	public void user_enters_username_as_And_enter_password_as(String string, String string2) {
		driver.findElement(By.name("userName")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
	    
	}

	@Then("clicks ok")
	public void clicks_ok() {
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	   
	}

	@Then("verify login result")
	public void verify_login_result() {
	
	

	 Assert.assertEquals("Username or Password is wrong here!!!","Username or Password is wrong here!!!");
	 System.out.println("Username and password is wrong");
	 
	
	}
}