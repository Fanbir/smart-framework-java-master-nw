package base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import webdriver.Browser;

/**
 * Created by student on 9/3/2015.
 */
public class TestBase {
    //protected WebDriver driver;
	protected Browser browser;
	
    @BeforeTest
    public void setup() {
//        String browser = System.getProperty("browser", "firefox");

        /*switch (browser) {
            case "chrome": driver = new ChromeDriver(); break;
            case "firefox": driver = new FirefoxDriver(); break;
            case "ie": driver = new InternetExplorerDriver(); break;
            default: driver = new FirefoxDriver(); break;
        }*/

       /* driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.get("http://www.tut.by");*/
    	
    	browser = Browser.getInstance();
    	browser.windowMaximise();
    	browser.navigate("http://www.tut.by");
  
    }

    @AfterTest
    public void teardown() {
        browser.exit();
    }
}
