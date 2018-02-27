package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by asingh on 1/29/18.
 */
public class rfpFormAttributes {

    public WebDriver driver;

    By presTitle = By.xpath("/html/body/div[1]/div[1]/div/main/article/div[2]/div[1]/form/div/input");
    By sessionD = By.xpath("/html/body/div[1]/div[1]/div/main/article/div[2]/div[1]/form/div/div[1]/textarea");
    By skillsObj = By.xpath("/html/body/div[1]/div[1]/div/main/article/div[2]/div[1]/form/div/div[2]/textarea");
    By intAud = By.xpath("/html/body/div[1]/div[1]/div/main/article/div[2]/div[1]/form/div/div[3]/textarea");
    By sessDur = By.xpath("//*[@id='duration2']/following-sibling::label");
    By eduLevel = By.xpath("//*[@id='level3']/following-sibling::label");
    By eduTrack = By.xpath("/html/body/div[1]/div[1]/div/main/article/div[2]/div[1]/form/div/div[6]/div[5]/label/strong");


    public rfpFormAttributes(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement getPresTitle() {

        return driver.findElement(presTitle);

    }

    public WebElement getSessId() {

        return driver.findElement(sessionD);
    }

    public WebElement getSkillsObj() {

        return driver.findElement(skillsObj);
    }

    public WebElement getintAud() {

        return driver.findElement(intAud);
    }

    public WebElement getsessDur() {

        return driver.findElement(sessDur);
    }

    public WebElement geteduLevel() {

        return driver.findElement(eduLevel);
    }

    public WebElement geteduTrck() {

        return driver.findElement(eduTrack);
    }


}
