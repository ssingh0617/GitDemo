import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class L92_Links {

    public static void main(String[]args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        System.out.println(driver.findElements(By.tagName("a")).size());

        //Links in footer
        WebElement driver_footer = driver.findElement(By.id("gf-BIG"));
        System.out.println(driver_footer.findElements(By.tagName("a")).size());

        //links in footer first column
         WebElement driver_footer_column = driver_footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(driver_footer_column.findElements(By.tagName("a")).size());

        //click on each link and see if they work
        for(int i=0; i<driver_footer_column.findElements(By.tagName("a")).size(); i++) {
            String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            driver_footer_column.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
            Thread.sleep(4000);
        }//for loop opens all tabs
            Set<String> abc = driver.getWindowHandles();
            Iterator<String> it = abc.iterator();
            while(it.hasNext()){
                driver.switchTo().window(it.next());
                System.out.println(driver.getTitle());
            }

        }

    }

