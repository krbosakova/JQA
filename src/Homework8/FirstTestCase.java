
package Homework8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class FirstTestCase {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bosakova\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.epay.bg/v3main/front");

        driver.findElement(By.id("login_user")).sendKeys("yvonnej");
        driver.findElement(By.id("login_pass")).sendKeys("1223456");
        driver.findElement(By.id("login_submit")).click();

        String sampleText = driver.findElement(By.className("login_err_msg")).getText();
        System.out.println(sampleText);

        driver.quit();
    }
}
