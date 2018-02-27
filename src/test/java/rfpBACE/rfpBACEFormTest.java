package rfpBACE;

import base.projectBase;
import base.rfpFormAttributes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by asingh on 1/25/18.
 */
public class rfpBACEFormTest extends projectBase {


    @Test
    public void rfpTest() throws IOException {

        //Set the system properties to initiate Chrome browser

        driver = initializeDriver();

        //Create properties object to fetch the data

        Properties data = new Properties();
        FileInputStream fis = new FileInputStream("/Users/asingh/selenium-tests/src/main/java/base/data.properties");

        data.load(fis);

        //Get the URL and initiate the webpage
        driver.get(data.getProperty("url"));
        driver.manage().window().maximize();

        rfpFormAttributes rfp = new rfpFormAttributes(driver);

        rfp.getPresTitle().sendKeys(data.getProperty("PresentationTitle"));
        rfp.getSessId().sendKeys(data.getProperty("SessionDesc"));
        rfp.getSkillsObj().sendKeys(data.getProperty("SkillsObj"));
        rfp.getintAud().sendKeys(data.getProperty("IntendedAud"));
        rfp.getsessDur().click();
        rfp.geteduLevel().click();
        rfp.geteduTrck().click();


        driver.findElement(By.xpath("//*[@id='fname']")).sendKeys(data.getProperty("FirstName"));
        driver.findElement(By.xpath("//*[@id='lname']")).sendKeys(data.getProperty("LastName"));
        driver.findElement(By.xpath("//*[@id='company']")).sendKeys(data.getProperty("Company"));
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys(data.getProperty("Email"));
        driver.findElement(By.xpath("//*[@id='phone']")).sendKeys(data.getProperty("OPhone"));
        driver.findElement(By.xpath("//*[@id='address']")).sendKeys(data.getProperty("Address"));
        driver.findElement(By.xpath("//*[@id='city']")).sendKeys(data.getProperty("City"));
        driver.findElement(By.xpath("//*[@id='state']")).sendKeys(data.getProperty("State"));
        driver.findElement(By.xpath("//*[@id='zip']")).sendKeys(data.getProperty("Zip"));

        driver.findElement(By.xpath("//*[@id='role']")).click();
        //select dropdown
        Select s = new Select(driver.findElement(By.xpath("//*[@id='role']")));
        s.selectByVisibleText("Presenter");

        driver.findElement(By.xpath("//*[@id='quals']")).sendKeys(data.getProperty("Bio"));

        driver.findElement(By.xpath("//*[@id='add']")).click();

        driver.findElement(By.xpath("//*[@id='fname2']")).sendKeys(data.getProperty("FirstName1"));
        driver.findElement(By.xpath("//*[@id='lname2']")).sendKeys(data.getProperty("LastName1"));
        driver.findElement(By.xpath("//*[@id='company2']")).sendKeys(data.getProperty("Company1"));
        driver.findElement(By.xpath("//*[@id='email2']")).sendKeys(data.getProperty("Email1"));
        driver.findElement(By.xpath("//*[@id='phone2']")).sendKeys(data.getProperty("OPhone1"));
        driver.findElement(By.xpath("//*[@id='cell2']")).sendKeys(data.getProperty("CPhone1"));
        driver.findElement(By.xpath("//*[@id='address2']")).sendKeys(data.getProperty("Address1"));
        driver.findElement(By.xpath("//*[@id='city2']")).sendKeys(data.getProperty("City1"));
        driver.findElement(By.xpath("//*[@id='state2']")).sendKeys(data.getProperty("State1"));
        driver.findElement(By.xpath("//*[@id='zip2']")).sendKeys(data.getProperty("Zip1"));

        driver.findElement(By.xpath("//*[@id='role2']")).click();

        //select dropdown
        Select s1 = new Select(driver.findElement(By.xpath("//*[@id='role2']")));
        s1.selectByVisibleText("Moderator");

        driver.findElement(By.xpath("//*[@id='quals2']")).sendKeys(data.getProperty("Bio1"));
        driver.findElement(By.xpath("//*[@id='terms']/following-sibling::label")).click();

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/div[2]/div[1]/form/div/li[1]/div[2]/input")).sendKeys(data.getProperty("FullName"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/div[2]/div[1]/form/div/li[1]/div[3]/input")).sendKeys(data.getProperty("CompanyName"));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/div[2]/div[1]/form/div/li[1]/div[4]/input")).sendKeys(data.getProperty("Email2"));

        //Submit
        //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/main/article/div[2]/div[1]/form/div/li[2]/input")).click();

        driver.close();


    }

}
