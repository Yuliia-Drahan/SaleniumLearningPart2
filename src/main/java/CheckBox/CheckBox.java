package CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {

    private WebElement checkBox;
    private WebDriver driver;

    //Конструктор класу
    public CheckBox (WebElement checkBox, WebDriver driver){
        this.checkBox = checkBox;
        this.driver = driver;
    }

    //Вибираємо чек-бокс
    public void checkElement(WebElement button){
        button.click();
    }

    //Перевіряємо чи елемент селектнутий
    public void isChecked (WebElement button){
        if (button.isSelected()){
            System.out.println("This Element is selected");
        } else
            System.out.println("This element is not selected!");
    }


    //Якщо елемент не селектнутий, то вибираємо його
    public static void SelectRadioButton (String name, WebElement button, WebDriver driver){
        String buttonXpath = "//span[text()=\"%s\"]";
        if (!button.isSelected()){
            driver.findElement(By.xpath(String.format(buttonXpath,name))).click();
        }
    }

}
