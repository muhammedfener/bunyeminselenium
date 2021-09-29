package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class Test1 {

    public static void main (String[] args) {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.gittigidiyor.com";
        driver.get(baseUrl);

        WebElement girisbuton = driver.findElement(By.className("hnYHyk"));
        girisbuton.click();

        baseUrl = "https://www.gittigidiyor.com/uye-girisi?s=1";
        driver.get(baseUrl);
        WebElement username = driver.findElement(By.name("kullanici"));
        WebElement password = driver.findElement(By.name("sifre"));

        username.sendKeys("bunyeminaktan@gmail.com");
        password.sendKeys("b123456");
        WebElement login=driver.findElement(By.id("gg-login-enter"));
        login.click();

        String baseUrl = "https://www.gittigidiyor.com/";
        driver.get(baseUrl);

        WebElement search = driver.findElement(By.name("k"));
        search.sendKeys("bilgisayar");
        search.sendKeys(Keys.ENTER);

    }
}
