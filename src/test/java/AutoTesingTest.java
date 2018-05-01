import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;


public class AutoTesingTest {
	private WebDriver driver;
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/Tiffany/Development/Chrome_Driver/chromedriver");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Test
	public void methodTest() throws InterruptedException {
		driver.get("https://www.google.co.uk");
		WebElement checkElement = driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
		checkElement.sendKeys("tib is being tibical");
		//checkElement = driver.findElement(By.xpath(""));
		checkElement.submit();
		Thread.sleep(2000);
	}
}
