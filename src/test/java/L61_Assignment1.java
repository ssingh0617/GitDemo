import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class L61_Assignment1 {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("checkBoxOption1")).click();
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
        Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
        driver.findElement(By.id("checkBoxOption1")).click();
        Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
        //driver.findElement(By.id("checkBoxOption1")).
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
        //driver.findElement(By.id("checkBoxOption1")).
        System.out.println("Shivendra Git");
        System.out.println("Shivendra Status");
        System.out.println("Shivendra Hello");
        System.out.println("Shivendra Hello");



    }
}
