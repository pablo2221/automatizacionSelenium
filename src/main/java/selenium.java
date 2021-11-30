import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

    private WebDriver driver;
    private String url;
    private String browser;

    public void iniciarBrowser(String browser){

        if (browser.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver","/Users/pablomac/Downloads/UCreativa/automatizacionSelenium/src/main/resources/chromedriver");
            driver=new ChromeDriver();
        }
    }

    public void cerrarBrowser(){
        driver.quit();
    }

    public String obtenerTituloPagina(){
        return driver.getTitle();
    }

    public void iniciarUrl(String url){
        driver.get(url);
    }

}
