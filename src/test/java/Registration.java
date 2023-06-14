import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Registration {

    public static void main(String [] args) throws InterruptedException{

        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Shiven\\Desktop\\CF109\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // And now use this to visit LMS login page
        driver.get("https://demo.opencart.com/");
        // Read the title of the page and  output it into results
        System.out.println("Page title is: " + driver.getTitle());
        // Find the text input element 'branch' by its name
        driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
        driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Register']")).click();
        driver.findElement(By.name("firstname")).sendKeys("ABC");
        driver.findElement(By.cssSelector("input#input-lastname"));
        driver.findElement(By.cssSelector("input[id='input-email']")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("abc@123");
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//div[@class='form-check form-switch form-switch-lg form-check-reverse form-check-inline']/input")).click();
        //System.out.println(driver.findElement(By.xpath("//input[@na")).isSelected());
        //Thread.sleep(5000);
        Actions actions = new Actions(driver);
        WebElement element=driver.findElement(By.xpath("//button[text()='Continue']"));
        actions.moveToElement(element).click().build().perform();
        //driver.execute_script("arguments[0].click();", element);
        //driver.a
        //Thread.sleep(2000);
        //element.click();
        //driver.findElement(By.css)
        //driver.close();
    }
}
