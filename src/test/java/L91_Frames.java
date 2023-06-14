import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class L91_Frames {

    public static void main(String[]args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        //driver.switchTo().frame(0);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        Actions action = new Actions(driver);
        WebElement source = driver.findElement(By.cssSelector("div.ui-widget-content.ui-draggable.ui-draggable-handle"));
        WebElement target = driver.findElement(By.cssSelector("div[id='droppable']"));
        action.dragAndDrop(source,target).build().perform();
        //driver.switchTo().defaultContent();



    }
}
