package rfpBACE;

import base.projectBase;
import base.rfpWPBformAttributes;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by asingh on 1/30/18.
 */
public class rfpWPBFormTest extends projectBase {

    @Test
    public void rfpWPBTest() throws IOException {

        driver = initializeDriver();

        Properties data = new Properties();
        FileInputStream fis = new FileInputStream("/Users/asingh/selenium-tests/src/main/java/base/data.properties");

        data.load(fis);

        driver.get(data.getProperty("url1"));
        driver.manage().window().maximize();

        rfpWPBformAttributes rfp = new rfpWPBformAttributes(driver);

        rfp.getpresTitle().sendKeys(data.getProperty("pTitle"));
        rfp.getsessDesc().sendKeys(data.getProperty("sdesc"));
        rfp.getDuration().click();
        rfp.geteduLevel().click();
        rfp.geteduTrack().click();
        rfp.getObj().sendKeys(data.getProperty("obj"));

        rfp.getfName().sendKeys(data.getProperty("fname1"));
        rfp.getlName().sendKeys(data.getProperty("lname1"));
        rfp.getcName().sendKeys(data.getProperty("cName"));
        rfp.getemail().sendKeys(data.getProperty("eMail1"));
        rfp.getoPhone().sendKeys(data.getProperty("oPhone1"));
        rfp.getcPhone().sendKeys(data.getProperty("cPhone1"));
        rfp.getpRole().click();

        //create select object for dropdown selection

        Select s = new Select(driver.findElement(By.xpath("//*[@id='role']")));
        s.selectByVisibleText("Presenter");

        rfp.getpQual().sendKeys(data.getProperty("pQual"));
        rfp.getvLink().sendKeys(data.getProperty("vLink"));
        rfp.getterms().click();
        rfp.getfullN().sendKeys(data.getProperty("FullName1"));
        rfp.getcompanyN().sendKeys(data.getProperty("CompanyN"));
        rfp.getfEmail().sendKeys(data.getProperty("eMailF"));
        // rfp.getsubmit().click();

    }

}
