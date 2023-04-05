package packageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductPage {

    By price2pay=By.cssSelector(".priceToPay");
    By avdate=By.cssSelector("#availability span");


    WebDriver driver;
    public  ProductPage(WebDriver driver){
        this.driver=driver;
    }
    public String getPrice(){
       String prix = driver.findElement(price2pay).getText();
        return prix;
    }
    public String getAvailableDate(){
        String vdate = driver.findElement(avdate).getText();
        return vdate;

    }
    public void addToCart(){
    }
    public void refuseInsurance(){
    }
    public void openCart(){
    }


}
