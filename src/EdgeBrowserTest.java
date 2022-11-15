import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {

    public static void main(String[] args) {

String url = "https://demo.nopcommerce.com/login?returnUrl=%2F";

//set Edge drive path
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        //start edge browser
        WebDriver driver = new EdgeDriver();

        //open url
        driver.get(url);

        //print the title page
        System.out.println("Page Title is:"+driver.getTitle());

        //Get current url
        System.out.println("Current Url is :" +driver.getCurrentUrl());

        //get web elements or page source
        System.out.println("Page source is :"+driver.getPageSource());

        //Find and enter email in email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("ajay123@gmail.com");

        //find and enter password in password field element

        WebElement passwordField =driver.findElement(By.name("Password"));
        passwordField.sendKeys("ajay123");
        //close browser
        driver.quit();















    }















}
