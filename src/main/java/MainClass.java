import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MainClass {

    static WebDriver driver;

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\IdeaProjects\\TestProject\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://github.com/");



    }
}
