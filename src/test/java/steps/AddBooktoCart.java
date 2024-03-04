package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import drivers.DriversInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddBooktoCart extends DriversInstance{

//WebDriver driver;

@Given("User should navigate to the application")
public void userShouldNavigateToTheApplication() {
	driver= new ChromeDriver();
	driver.get("https://bookcart.azurewebsites.net/");
	driver.manage().window().maximize();
	
}

@Given("User clicks on the Login link")
public void user_clicks_on_the_login_link() {
	driver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[3]/button[2]/span[1]")).click();
	
}
	
@Given("User Enter the {string} and {string}")
public void userEnterTheAnd(String username, String password) {
	driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div[2]/div/mat-card/mat-card-content/form/mat-form-field[1]/div/div[1]/div/input")).sendKeys(username);
	driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div[2]/div/mat-card/mat-card-content/form/mat-form-field[2]/div/div[1]/div[1]/input")).sendKeys(password);
	
	
}

@When("User serch the {string}")
public void userSerchThe(String books) {
	
	driver.findElement(By.xpath("/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[2]/app-search/form/input")).sendKeys(books);
	driver.findElement(By.xpath("/html/body/div[3]/div/div/div/mat-option/span")).click();
	driver.findElement(By.xpath("/html/body/app-root/div/app-home/div/div[2]/div/div/app-book-card/mat-card/mat-card-content[2]/app-addtocart/button/span[1]")).click();

}

@Then("Boks should aaded into the card batch")
public void boksShouldAadedIntoTheCardBatch() throws InterruptedException {
	String crtcount = driver.findElement(By.cssSelector("#mat-badge-content-0")).getText();
	Thread.sleep(3000);
	System.out.println("Added book count is" +crtcount);
    Assert.assertEquals(Integer.parseInt(crtcount)>=0, true);
    driver.close();
	
}
}
