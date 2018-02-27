package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by asingh on 1/29/18.
 */
public class projectBase {

    public WebDriver driver;

    public WebDriver initializeDriver() throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/asingh/selenium-tests/src/main/java/base/projectBase.properties");

        prop.load(fis);
        String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")) {

            System.setProperty("webdriver.chrome.driver", "/Users/asingh/Downloads/Chromedriver1");
            driver = new ChromeDriver();

        } else if (browserName.equals("firefox")) {

            System.setProperty("webdriver.gecko.driver", "/Users/asingh/Downloads/geckodriver");
            driver = new FirefoxDriver();


        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        return driver;

    }


}
