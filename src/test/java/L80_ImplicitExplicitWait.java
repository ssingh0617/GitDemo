import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class L80_ImplicitExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(6));
        String [] itemsNeeded = {"Cucumber","Brocolli","Tomato"};
        addItems(driver,itemsNeeded);
    }
        public static void addItems(WebDriver driver, String[] itemsNeeded) throws InterruptedException {
            int count=0;
           List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
           List itemsNeededList = Arrays.asList(itemsNeeded);
           for(int i=0; i<products.size(); i++){
               String [] name = products.get(i).getText().split("-");
               String product_name = name[0].trim();
               if(itemsNeededList.contains(product_name)){
                   driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                   Thread.sleep(5000);
                   if(count==itemsNeeded.length) break;
               }
           }
            driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
           driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
           driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
           driver.findElement(By.cssSelector("button.promoBtn")).click();
           //Thread.sleep(5000);
            WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(6));
            w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Code applied ..!']")));
           String text = driver.findElement(By.xpath("//span[text()='Code applied ..!']")).getText();
            System.out.println(text);
           Assert.assertEquals(text,"Code applied ..!");
           driver.findElement(By.xpath("//button[text()='Place Order']")).click();

        }

}
