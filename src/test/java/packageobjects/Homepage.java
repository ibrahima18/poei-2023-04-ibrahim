package packageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homepage {

    int TIMEOUT_SIDE_PPANEL = 1000;
    By searchBarlocator= By.cssSelector("#twotabsearchtextbox");

    By menuSelector=By.cssSelector("#nav-hamburger-menu > i");
    By GameSelector=By.cssSelector("nav_em_1_1_1_17");
    By ConsoleSelector=By.cssSelector(" nav_em_allvg_0_2_12_2");
    WebDriver driver;
    public Homepage(WebDriver driver){
        this.driver=driver;
    }
    public void search(String keyword){
        driver.findElement(searchBarlocator).sendKeys(keyword + Keys.ENTER);
    }
    public void goToGamesAndConsolesPage(){
        driver.findElement(menuSelector).click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_SIDE_PPANEL));
        WebElement BoutonJeuxVideos1 = wait1.until(ExpectedConditions.elementToBeClickable(menuSelector));
        BoutonJeuxVideos1.click();
        //driver.findElement(GameSelector).click();
        //river.findElement(ConsoleSelector).click();
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_SIDE_PPANEL));
        WebElement BoutonJeuxVideos2 = wait2.until(ExpectedConditions.elementToBeClickable(menuSelector));
        BoutonJeuxVideos2.click();
    }
}
