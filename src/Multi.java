import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multi {

    static String browser = "Chrome";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        //print current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());
        //print title page
        System.out.println("the title page is: " + driver.getTitle());

        //print page source
        System.out.println("the source page is: " + driver.getPageSource());

        //Elements
        WebElement forgotpasswordlink = driver.findElement(By.className("orangehrm-login-forgot"));
        forgotpasswordlink.click();
        System.out.println("current URL is: " + driver.getCurrentUrl());

        //back to login back
        driver.navigate().back();
        //refresh the page
        driver.navigate().refresh();
        //Enter username
        WebElement emailinput = driver.findElement(By.name("username"));
        emailinput.sendKeys("Admin");
        //Enter Password
        WebElement passwordinput = driver.findElement(By.name("password"));
        passwordinput.sendKeys("admin123");

        //Click on login
        WebElement loginLink = driver.findElement(By.xpath("//button[text()=' Login ']"));
        loginLink.click();

        //close the browser
        driver.quit();
    }
    }


