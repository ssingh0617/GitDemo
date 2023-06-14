import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class L88_ChildWindows {

    public static void main(String [] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("a.blinkingText")).click();
        Thread.sleep(7000);
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        String childdId = it.next();
        Thread.sleep(3000);
        driver.switchTo().window(childdId);
        System.out.println(driver.getTitle());

        //Thread.sleep(3000);
        String text = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim();
        String password = text.split(" ")[0].trim();
        System.out.println(password);
        driver.switchTo().window(childId);

        driver.findElement(By.cssSelector("input#username")).sendKeys("mentor@rahulshettyacademy.com");


    }
}
