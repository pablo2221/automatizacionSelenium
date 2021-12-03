import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {
    WebDriver driver;
    //String url = "https://demoqa.com/automation-practice-form";
    //String url = "https://demoqa.com/links";
    String url = "https://demoqa.com/text-box";

    @Test
    public void ejemplosLocators(){
        System.setProperty("webdriver.chrome.driver","/Users/pablomac/Downloads/UCreativa/automatizacionSelenium/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        //driver.findElement(By.id("firstName")).sendKeys("Pablo");
        //driver.findElement(By.xpath("//label[@for=\"gender-radio-1\"]")).click();
        //driver.findElement(By.className("practice-form-wrapper"));
        //driver.findElement(By.linkText("Home")).click();
        //driver.findElement(By.partialLinkText("ted")).click();
        driver.findElement(By.cssSelector("input[id=\"userName\"]")).sendKeys("Pablo Quiros");
        //testUtil.imprimir("VP Passed: " + driver.findElement(By.xpath("//div[@class=\"practice-form-wrapper\"]/h5")).getText());
        Util.Wait(5);
        testUtil.imprimir("VP Passed: By Classname" );
        driver.quit();
    }
}
