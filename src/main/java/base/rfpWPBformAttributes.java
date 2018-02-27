package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by asingh on 1/30/18.
 */
public class rfpWPBformAttributes {

    public WebDriver driver;

    By presTitle = By.xpath("/html/body/div[1]/div[1]/div/main/article/div[2]/div[1]/form/div/input");
    By sessDesc = By.xpath("/html/body/div[1]/div[1]/div/main/article/div[2]/div[1]/form/div/div[1]/textarea");
    By duration = By.xpath("/html/body/div[1]/div[1]/div/main/article/div[2]/div[1]/form/div/div[2]/div[1]/label");
    By eduLevel = By.xpath("/html/body/div[1]/div[1]/div/main/article/div[2]/div[1]/form/div/div[3]/div[1]/label");
    By eduTrack = By.xpath("/html/body/div[1]/div[1]/div/main/article/div[2]/div[1]/form/div/div[4]/div[3]/label");
    By Obj = By.xpath("/html/body/div[1]/div[1]/div/main/article/div[2]/div[1]/form/div/div[5]/textarea");
    By fName = By.xpath("//*[@id='fname']");
    By lName = By.xpath("//*[@id='lname']");
    By cName = By.xpath("//*[@id='company']");
    By eMail = By.xpath("//*[@id='email']");
    By oPhone = By.xpath("//*[@id='phone']");
    By cPhone = By.xpath("//*[@id='cell']");
    By pRole = By.xpath("//*[@id='role']");
    By pQual = By.xpath("//*[@id='quals']");
    By vLink = By.xpath("//*[@id='video']");
    By terms = By.xpath("//*[@id='terms']/following-sibling::label");
    By fullN = By.xpath("/html/body/div[1]/div[1]/div/main/article/div[2]/div[1]/form/div/li/div[2]/input");
    By companyN = By.xpath("/html/body/div[1]/div[1]/div/main/article/div[2]/div[1]/form/div/li/div[3]/input");
    By fEmail = By.xpath("/html/body/div[1]/div[1]/div/main/article/div[2]/div[1]/form/div/li/div[4]/input");
    By submit = By.xpath("/html/body/div[1]/div[1]/div/main/article/div[2]/div[1]/form/div/li/div[4]/input");

    public rfpWPBformAttributes(WebDriver driver) {

        this.driver = driver;

    }

    public WebElement getpresTitle() {

        return driver.findElement(presTitle);
    }

    public WebElement getsessDesc() {

        return driver.findElement(sessDesc);
    }

    public WebElement getDuration() {

        return driver.findElement(duration);
    }

    public WebElement geteduLevel() {

        return driver.findElement(eduLevel);
    }

    public WebElement geteduTrack() {

        return driver.findElement(eduTrack);
    }

    public WebElement getObj() {

        return driver.findElement(Obj);
    }

    public WebElement getfName() {

        return driver.findElement(fName);
    }

    public WebElement getlName() {

        return driver.findElement(lName);
    }

    public WebElement getcName() {

        return driver.findElement(cName);
    }

    public WebElement getemail() {

        return driver.findElement(eMail);
    }

    public WebElement getoPhone() {

        return driver.findElement(oPhone);
    }

    public WebElement getcPhone() {

        return driver.findElement(cPhone);
    }

    public WebElement getpRole() {

        return driver.findElement(pRole);
    }

    public WebElement getpQual() {

        return driver.findElement(pQual);
    }

    public WebElement getvLink() {

        return driver.findElement(vLink);
    }

    public WebElement getterms() {

        return driver.findElement(terms);
    }

    public WebElement getfullN() {

        return driver.findElement(fullN);
    }

    public WebElement getcompanyN() {

        return driver.findElement(companyN);
    }

    public WebElement getfEmail() {

        return driver.findElement(fEmail);
    }

    public WebElement getsubmit() {

        return driver.findElement(submit);
    }


}
