package packageobjects;

import org.checkerframework.checker.units.qual.Length;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GamesAndConsolesPage {
    WebDriver driver;

    public GamesAndConsolesPage(WebDriver driver){
        this.driver=driver;
    }
    public void OpenBestSeller(int index){
        List<WebElement> searchResult=driver.findElements(By.cssSelector("[cel_widget_id=\"handsfree-browse_OctopusBestSellerAsin\"] li"));
        searchResult.get(index).click();
}
}
