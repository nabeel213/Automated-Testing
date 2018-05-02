
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ChromeTest2 {

	ChromeDriver driver;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver_win32/chromedriver.exe");

		driver = new ChromeDriver();
	}

	@Test
	public void testCreateUser() throws InterruptedException {

		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");

		WebElement clickSignIn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		clickSignIn.click();

		WebElement inputEmail = driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
		inputEmail.sendKeys("nabeel.94@live.com");

		WebElement clickCreate = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		clickCreate.click();
		Thread.sleep(10000);

		WebElement genderInput = driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
		genderInput.click();

		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]"));
		firstName.sendKeys("Nabeel");

		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
		lastName.sendKeys("Mujadidi");

		WebElement passW = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		passW.sendKeys("Mujadidi123");
		
		WebElement address = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
		address.sendKeys("1 London Road");
		
		WebElement city = driver.findElement(By.xpath("//*[@id=\"city\"]"));
		city.sendKeys("London");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Select inputCity = new Select(driver.findElement(By.xpath("//*[@id=\"id_state\"]")));
		
		WebElement state = driver.findElement(By.id("mySelect"));
		
		Select dropdown= new Select(driver.findElement(Bystate);
		
		Select dropdown = new Select(driver.findElement(By.id("identifier")));
		
		
		//state.selectByVisibleText("Alabama");
		
				//state.selectByVisibleText("Alabama");
				
				//state.selectByIndex(2);
				 * 
				 */
	}

	@After
	public void teardown() {

		// driver.quit();
	}
}