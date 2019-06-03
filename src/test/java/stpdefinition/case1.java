package stpdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class case1 {
	WebDriver driver;
	@Given("user launch chrome browser And enters an TestMeApp url")
	public void user_launch_chrome_browser_And_enters_an_TestMeApp_url() {
		  System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	    
	}

	@When("user clicks SignUp")
	public void user_clicks_SignUp() {
		
	}

	@When("user enters  User Name as {string}")
	public void user_enters_User_Name_as(String s1) {
		driver.findElement(By.name("userName")).sendKeys(s1);
	  
	}

	@When("user enters  First  Name as {string}")
	public void user_enters_First_Name_as(String s2) {
		driver.findElement(By.name("firstName")).sendKeys(s2);
	   
	}

	@When("user enters Last Name as {string}")
	public void user_enters_Last_Name_as(String s3) {
		
		driver.findElement(By.name("lastName")).sendKeys(s3);
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String s4) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(s4);
	   
	}

	@When("user enters confirm password as {string}")
	public void user_enters_confirm_password_as(String s5) {
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(s5);
	  
	}

	@When("user selects Gender as  {string}")
	public void user_selects_Gender_as(String string) {
		driver.findElement(By.xpath("//input[@type='radio'][@value='Female']"));
	   
	}

	@When("user enters a E-Mail as {string}")
	public void user_enters_a_E_Mail_as(String s6) {
		driver.findElement(By.name("emailAddress")).sendKeys(s6);
	   
	}

	@When("user enters a mobile number as {string}")
	public void user_enters_a_mobile_number_as(String s7) {
		driver.findElement(By.name("mobileNumber")).sendKeys(s7);
	    
	}

	@When("user enters a DOB as {string}")
	public void user_enters_a_DOB_as(String s8) {
		driver.findElement(By.name("dob")).sendKeys(s8);
	    
	}

	@When("user enters a Address as {string}")
	public void user_enters_a_Address_as(String s9) {
		driver.findElement(By.name("address")).sendKeys(s9);
	    
	  
	}

	@When("user selects a security question as {string}")
	public void user_selects_a_security_question_as(String string) {
		Select a=new Select(driver.findElement(By.xpath("//*[@id='securityQuestion']")));
		a.selectByIndex(0);
		
	  
	}

	@When("user enters a Answer as {string}")
	public void user_enters_a_Answer_as(String s10) {
		driver.findElement(By.name("answer")).sendKeys(s10);
	
	   
	}

	@Then("the user clicks Register")
	public void the_user_clicks_Register() {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	    
	}

}
