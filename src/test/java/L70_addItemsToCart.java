import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L70_addItemsToCart {

    public static void main(String [] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(5000);
        String []itemsNeeded = {"Cucumber","Brocolli","Tomato"};
        addItems(driver, itemsNeeded);

        }

        public static void addItems(WebDriver driver, String [] itemsNeeded) throws InterruptedException {

            List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
            Thread.sleep(3000);
            int count=0;

            for (int i=0; i<products.size(); i++ ){

                //convert array to list
                List itemsNeededList= Arrays.asList(itemsNeeded);
                Thread.sleep(2000);
                String []name = products.get(i).getText().split("-");
                String item = name[0].trim();
                Thread.sleep(2000);
                if (itemsNeededList.contains(item)){
                    count++;
                    driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                    if(count==itemsNeeded.length) {
                        break;
                    }
                }

            }



        }

    }

