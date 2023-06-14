import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class L85_ActionsClass {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        //WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
        //action.moveToElement(move);
        //action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello");
        //action.build().perform();
        //action.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
        Thread.sleep(3000);
        //action.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
        //action.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']")));
        //WebElement element = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
        //action.moveToElement(element).build().perform();
        //System.out.println(element.getText());
        //action.moveToElement(element);
        WebElement element = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        action.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
        Thread.sleep(2000);
        WebElement element2 = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
        action.moveToElement(element2).contextClick().build().perform();


    }
}
