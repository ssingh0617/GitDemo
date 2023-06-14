import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L51_StaticDropDown {
    public static void main(String [] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //dropdown with 'Select' tag -- Static drop down
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(1);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("USD");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        System.out.println("Shivendra Git -----------------");
        System.out.println("Shivendra Status--------------------");
        System.out.println("Shivendra Hello");
        System.out.println("Shivendra Hello2");
        System.out.println("Shivendra Hello3");
        System.out.println("Shivendra Hello4");


    }

    public void dummy(){
        System.out.println("Branch 1");
        System.out.println("Branch 2");
        System.out.println("Branch 3");
        System.out.println("Branch 4");
        System.out.println("Branch 5");
    }

    public void dummy2() {
        System.out.println("Branch 1");
        System.out.println("Branch 2");
        System.out.println("Branch 3");
        System.out.println("Branch 4");
        System.out.println("Branch 5");
    }

        public void dummy3() {
            System.out.println("Branch 1");
            System.out.println("Branch 2");
            System.out.println("Branch 3");
            System.out.println("Branch 4");
            System.out.println("Branch 5");
        }

    public void dummy4() {
        System.out.println("Branch 1");
        System.out.println("Branch 2");
        System.out.println("Branch 3");
        System.out.println("Branch 4");
        System.out.println("Branch 5");
    }

    public void dummy5() {
        System.out.println("Branch 1");
        System.out.println("Branch 2");
        System.out.println("Branch 3");
        System.out.println("Branch 4");
        System.out.println("Branch 5");
    }

    public void dummy6() {
        System.out.println("Branch 1");
        System.out.println("Branch 2");
        System.out.println("Branch 3");
        System.out.println("Branch 4");
        System.out.println("Branch 5");
    }
    
}
