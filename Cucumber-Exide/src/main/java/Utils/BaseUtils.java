package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtils {

	public static ExtentReportUtils report = new ExtentReportUtils();
	public static WebDriver driver;
	public static WebDriverWait wait = new WebDriverWait(driver, 15);

//	public void driverinit(String env) {
//		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
//		// WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("http://exidelifepte-" + env + ".digidesk.co/index.php");
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().setScriptTimeout(45, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//	public static String captureScreenshot() throws IOException {
//		String date = new SimpleDateFormat("hh:mm:ss a").format(new Date());
//		TakesScreenshot shot = (TakesScreenshot) driver;
//		File source = shot.getScreenshotAs(OutputType.FILE);
//		String Dest = System.getProperty("user.dir") + "/Screenshots/error" + date.toString() + ".png";
//		File Destination = new File(Dest);
//		FileHandler.copy(source, Destination);
//		return Dest;
//	}
//
//	public static void sendKeys(String locator, String element, String value) {
//		try {
//			Thread.sleep(1000);
//			if (locator.equals("xpath")) {
//				driver.findElement(By.xpath(element)).sendKeys(value);
//			} else if (locator.equals("id")) {
//				driver.findElement(By.id(element)).sendKeys(value);
//			} else if (locator.equals("name")){
//				driver.findElement(By.name(element)).sendKeys(value);
//			} else if (locator.equals("className")){
//				driver.findElement(By.className(element)).sendKeys(value);
//			} else if (locator.equals("linkText")){
//				driver.findElement(By.linkText(element)).sendKeys(value);
//			} else if (locator.equals("partialLinkText")){
//				driver.findElement(By.partialLinkText(element)).sendKeys(value);
//			} else if (locator.equals("cssSelector")){
//				driver.findElement(By.cssSelector(element)).sendKeys(value);
//			} else {
//				System.out.println("no locator is identified");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static boolean click(WebElement element) {
//		try {
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return false;
//	}
//	
//	public static void quitDriver() {
//	    if (null != driver) {
//	      driver.quit();
//	    }
//	}
}
