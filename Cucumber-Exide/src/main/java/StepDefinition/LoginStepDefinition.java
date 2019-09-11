package StepDefinition;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	protected static WebDriver driver;
	protected WebDriverWait wait;

	@Given("^user already in Login page$")
	public void user_already_in_Login_page() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://exidelifepte-stage.digidesk.co/index.php");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(45, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@When("^title of Login page is Heptagon-Portal$")
	public void title_of_Login_page_is_Heptagon_Portal() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Heptagon Portal", title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("rinash.a@heptagon.in");
		// sendKeys("id", "username", "rinash.a@heptagon.in");
		driver.findElement(By.id("password")).sendKeys("Admin@123");
		Thread.sleep(2000);
	}

	@Then("^user click on Login button$")
	public void user_click_on_Login_button() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//button[@class='loginLnk']"));
		element.click();
		Thread.sleep(4000);
	}
	
	@Then("^checked dashboard title is present$")
	public void checked_dashboard_title_is_present() {
		WebElement element = driver.findElement(By.xpath("//p[contains(text(),'View the candidate onboarding details - overall an')]"));
		wait = new WebDriverWait(driver, 15);
		String Expectetext = "View the candidate onboarding details - overall and each stage wise count (till Ecode generation).";
		wait.until(ExpectedConditions.textToBePresentInElement(element, Expectetext));
		String eleText= element.getText();
		Assert.assertEquals(Expectetext, eleText);
	}
}
