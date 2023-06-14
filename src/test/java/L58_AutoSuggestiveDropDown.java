import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class L58_AutoSuggestiveDropDown {

    public static void main(String [] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ca");
        Thread.sleep(3000);
        List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
        for (WebElement option : options ) {
            if (option.getText().equalsIgnoreCase("Canada")) {
                option.click();
                break;

            }
        }
        }


    }
