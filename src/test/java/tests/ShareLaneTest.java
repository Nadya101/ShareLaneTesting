package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ShareLaneTest {
    @Test
    public void fillInZipCodeTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("55555");
        driver.findElement(By.xpath("//*[@value = 'Continue']")).click();
        driver.close();
    }

    @Test
    public void fillInSignUpFormMandatoryFlieldsTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=55555");
        driver.findElement(By.name("first_name")).sendKeys("Tom");
        driver.findElement(By.name("email")).sendKeys("Angel.nadii36@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("11111");
        driver.findElement(By.name("password2")).sendKeys("11111");
        driver.findElement(By.xpath("//*[@value = 'Register']")).click();
        driver.close();
    }

    //there is the bug, form doesn't check password2
    @Test
    public void fillInDoNotMatchPasswordSTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=55555");
        driver.findElement(By.name("first_name")).sendKeys("Tom");
        driver.findElement(By.name("email")).sendKeys("Angel.nadii36@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("11111");
        driver.findElement(By.name("password2")).sendKeys("44444");
        driver.findElement(By.xpath("//*[@value = 'Register']")).click();
        driver.close();
    }

    @Test
    public void fillInFormWithoutPasswordConfirmationTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=55555");
        driver.findElement(By.name("first_name")).sendKeys("");
        driver.findElement(By.name("email")).sendKeys("Angel.nadii36@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("11111");
        driver.findElement(By.name("password2")).sendKeys("");
        driver.findElement(By.xpath("//*[@value = 'Register']")).click();
        driver.close();
    }

    @Test
    public void fillInFormWithEmptyFirstNameFieldTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=55555");
        driver.findElement(By.name("first_name")).sendKeys("");
        driver.findElement(By.name("email")).sendKeys("Angel.nadii36@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("11111");
        driver.findElement(By.name("password2")).sendKeys("11111");
        driver.findElement(By.xpath("//*[@value = 'Register']")).click();
        driver.close();
    }

    @Test
    public void fillInFormWithWrongEmailTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=55555");
        driver.findElement(By.name("first_name")).sendKeys("Tom");
        driver.findElement(By.name("email")).sendKeys("Angel.nadiigmail.com");
        driver.findElement(By.name("password1")).sendKeys("11111");
        driver.findElement(By.name("password2")).sendKeys("11111");
        driver.findElement(By.xpath("//*[@value = 'Register']")).click();
        driver.close();
    }

    @Test
    public void fillInNumbersInFirstNameFieldTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=55555");
        driver.findElement(By.name("first_name")).sendKeys("78787878");
        driver.findElement(By.name("email")).sendKeys("Angel.nadii36@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("11111");
        driver.findElement(By.name("password2")).sendKeys("11111");
        driver.findElement(By.xpath("//*[@value = 'Register']")).click();
        driver.close();
    }
}

