//**1. Set up FireFoxbrowser.
//2. Open URL.
//3. Print the title of the page.
//4. Print the current URL.
//5. Print the page source.
//6. Click on the ‘Forgot your password?’ link.
//7. Print the current URL.
//8. Navigate back to the login page.
//9. Refresh the page.
//10. Enter the email in the email field.
//11. Enter the password in the password field.
//12. Click on the Login Button.
//13. Close the browser.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFox {
    public static void main(String[] args) {
        //2. Open URL.
        String baseurl = "https://opensource-demo.orangehrmlive.com";
        WebDriver driver = new FirefoxDriver();
        driver.get(baseurl);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

//3. Print the title of the page.
        System.out.println(driver.getTitle());
//4. Print the current URL.
        System.out.println(driver.getCurrentUrl());
//5. Print the page source.
        System.out.println(driver.getPageSource());
//6. Click on the ‘Forgot your password?’ link.
        WebElement forgotyourpassword = driver.findElement(By.tagName("p"));
        forgotyourpassword.click();
//7. Print the current URL.
        System.out.println(driver.getCurrentUrl());
//8. Navigate back to the login page.
        driver.navigate().back();
//9. Refresh the page.
        driver.navigate().refresh();
//10. Enter the email in the email field.
        WebElement emailinput = driver.findElement(By.name("username"));
        emailinput.sendKeys("Admin");
//11. Enter the password in the password field.
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
//12. Click on the Login Button.
        WebElement loginLink = driver.findElement(By.tagName("button"));
        loginLink.click();
//13. Close the browser.
        driver.close();
    }
}
