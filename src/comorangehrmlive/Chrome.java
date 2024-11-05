//**1. Set up Chrome browser.
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
package comorangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {

    public static void main(String[] args) {
        //get url
        String baseURL = "https://opensource-demo.orangehrmlive.com";
        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);

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
