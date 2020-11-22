import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class MainClass {

    static WebDriver driver;

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\TestProject\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.foxtrot.com.ua/");
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//li[@data-category='32014']/span[@class='icon dropdown-arrow']")).click();
        driver.findElement(By.xpath("//a[@href=\"/ru/shop/mobilnye_telefony_smartfon.html\"]")).click();

        WebElement checkBox = driver.findElement(By.xpath("//span[text()=\"SAMSUNG\"]"));


        CheckBox bagCheckBox = new CheckBox(checkBox, driver);
        bagCheckBox.checkElement(checkBox);
        bagCheckBox.isChecked(checkBox);
        bagCheckBox.SelectRadioButton("XIAOMI", checkBox, driver);


    }
}
