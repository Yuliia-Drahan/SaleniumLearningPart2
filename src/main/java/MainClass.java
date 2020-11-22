import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class MainClass {

    static WebDriver driver;

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\TestProject\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.foxtrot.com.ua/");


        WebElement checkBox = driver.findElement(By.xpath("//ul[@class='navigator-ul-center']/li/a[@href='/collection/bags' and contains(text(),'Сумки')]"));

        CheckBox bagCheckBox = new CheckBox(checkBox, driver);
        bagCheckBox.checkElement(checkBox);
        bagCheckBox.isChecked(checkBox);
        bagCheckBox.SelectRadioButton("c-2334343", checkBox, driver);




    }
}
