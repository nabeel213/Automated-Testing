
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ChromeTesting {
	
	ChromeDriver driver;
	
	@Before
	public void setup() {
	
		System.setProperty("webdriver.chrome.driver", 
				"C:/Users/Admin/Downloads/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	
	@Test
	public void methodTest() {
	
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
	}//*[@id="main"]/h2[2]
	
	@After
	public void teardown() {
		
		driver.quit();
	}
}
