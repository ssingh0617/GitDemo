import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class L102_TableGrids {
    public static void main(String[]args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

       List<WebElement> elements = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int count=0;
        int val=0;
       for (int i=0; i<elements.size(); i++){

            val = Integer.parseInt(elements.get(i).getText());
           count = count + val;
       }
       System.out.println(count);
    }
}
