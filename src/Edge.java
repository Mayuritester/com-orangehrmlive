//**//**1. Set up Chrome browser.
////2. Open URL.
////3. Print the title of the page.
////4. Print the current URL.
////5. Print the page source.
////6. Click on the ‘Forgot your password?’ link.
////7. Print the current URL.
////8. Navigate back to the login page.
////9. Refresh the page.
////10. Enter the email in the email field.
////11. Enter the password in the password field.
////12. Click on the Login Button.
////13. Close the browser.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) {
        //Get the URL
        String baseUrl = "https://opensource-demo.orangehrmlive.com";
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        //Print title page
        System.out.println(driver.getTitle());

        //4. Print the current URL.
        System.out.println("Current page is: " + driver.getCurrentUrl());
//5. Print the page source.
        System.out.println("Page Source is: " + driver.getPageSource());
//6. Click on the ‘Forgot your password?’ link.
        WebElement forgotyourpassword = driver.findElement(By.className("orangehrm-login-forgot-header"));
        forgotyourpassword.click();
//7. Print the current URL.
        System.out.println(driver.getCurrentUrl());
//8. Navigate back to the login page.
        driver.navigate().back();
//9. Refresh the page.
        driver.navigate().refresh();
//10. Enter the email in the email field.
        WebElement usernameinput = driver.findElement(By.name("username"));
        usernameinput.sendKeys("Admin");
//11. Enter the password in the password field.
        WebElement passwordinput = driver.findElement(By.name("password"));
        passwordinput.sendKeys("admin123");
//12. Click on the Login Button.
        WebElement loginlink = driver.findElement(By.tagName("button"));
        loginlink.click();
//13. Close the browser.
      driver.close();

    }
}
