package TestingAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FashionForth {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\src\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://pretest-qa.dcidev.id/documentation/v1#!/oauth/postApiV1OauthSignIn");

        driver.findElement(By.name("phone")).sendKeys("+6281330634213");
//        driver.findElement(By.xpath("//*[@id=\"phone.3422422446828124\"]")).click();

        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("latlong")).sendKeys("123456");
        driver.findElement(By.name("device_token")).sendKeys("123456");

        WebElement device_typeElement = driver.findElement(By.id("1"));
        Select device_typeDropdown = new Select(device_typeElement);
        device_typeDropdown.selectByVisibleText("1");

        driver.findElement(By.xpath("//*[@id=\"oauth_postApiV1OauthSignIn_content\"]/form/div[3]/input")).click();

        driver.quit();

    }
}
