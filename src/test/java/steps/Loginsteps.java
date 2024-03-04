package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import drivers.DriversInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Loginsteps extends DriversInstance{
//WebDriver driver;

	@Given("User should navigate to the applications")
	public void userShouldNavigateToTheApplication() {
		driver= new ChromeDriver();
		driver.get("https://bookcart.azurewebsites.net/");
		driver.manage().window().maximize();
	
		
	}
	
	@Given("User clicks on the Login links")
	public void user_clicks_on_the_login_link() {
		driver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[2]/span[1]")).click();
	    
	    
	}
	@Given("User Enter the username as {string}")
	public void user_enter_the_username_as(String username) {
		driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div[2]/div/mat-card/mat-card-content/form/mat-form-field[1]/div/div[1]/div/input")).sendKeys(username);
	    
	}
	@Given("User enter the password as {string}")
	public void user_enter_the_password_as(String password) {
		driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div[2]/div/mat-card/mat-card-content/form/mat-form-field[2]/div/div[1]/div[1]/input")).sendKeys(password);
		         
	}
	@When("User clicks on the Login button")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div[2]/div/mat-card/mat-card-content/form/mat-card-actions/button/span[1]")).click();
	    
	    
	}
	@Then("Login should be success")
	public void login_should_be_success() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
	
	
	@When("Login should be failed")
	public void loginShouldBeFailed() throws InterruptedException {
		//String errormesage = driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div[2]/div/mat-card/mat-card-subtitle/mat-error")).getText();
		//Assert.assertEquals(errormesage, "Username or Password is incorrect.");
		Thread.sleep(1000);
		driver.quit();
		
	}
	
	
	}
	
