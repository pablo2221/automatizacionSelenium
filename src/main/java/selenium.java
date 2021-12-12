import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class selenium extends Util{

    private WebDriver driver;
    private String url;
    private String browser;

    private String elementName;
    private String locator;
    private String elemento;
    private WebElement webElement = null;

    private String listaElement;
    private String listaLocator;
    private String buscarItem;

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

    public void initSeleniumElement( String elementName, String elemento, String locator){
        System.out.println("Inicializando: "+elementName+" locator: "+locator+" element: "+elemento);
        this.elementName = elementName;
        this.locator = locator;
        this.elemento = elemento;
    }

    public void find(){
        try{
            System.out.println("Buscando Locator: " + locator);
            switch (locator){
                case "Id":{
                    this.webElement=driver.findElement(By.id(elemento));
                    break;
                }
                case "Xpath":{
                    this.webElement=driver.findElement(By.xpath(elemento));
                    break;
                }
                case "Name":{
                    this.webElement=driver.findElement(By.name(elemento));
                    break;
                }
                case "Class":{
                    this.webElement=driver.findElement(By.className(elemento));
                    break;
                }
                case "Link":{
                    this.webElement=driver.findElement(By.linkText(elemento));
                    break;
                }
                case "PartialLink":{
                    this.webElement=driver.findElement(By.partialLinkText(elemento));
                    break;
                }
                case "css":{
                    this.webElement=driver.findElement(By.cssSelector(elemento));
                    break;
                }
                case "tagName":{
                    this.webElement=driver.findElement(By.tagName(elemento));
                    break;
                }
            }
        }catch (Exception e){
            throw new RuntimeException("Web Element not found");
        }
    }

    public void elementoClick(){
        webElement.click();
    }

    public void elementoSendKeys(String texto){
        webElement.sendKeys(texto);
    }

    public String textoElement(){
        return webElement.getText();
    }

    public void scrollWebElement(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", webElement);
    }

    public void initSeleniumList(String elementName, String locator, String elemento, String listaElement, String listaLocator, String buscarItem){
        Util.imprimir("Inicializando");
        this.elemento = elemento;
        this.elementName = elementName;
        this.locator = locator;
        this.listaLocator = listaLocator;
        this.listaElement = listaElement;
        this.buscarItem = buscarItem;
        find();
    }

    public void findInList(){
        boolean found = false;
        elementoClick();
        List<WebElement> listelements=null;
        try{
            Util.imprimir("Buscando locator en lista:" +listaLocator);
            switch (listaLocator){
                case "Id": {listelements=this.webElement.findElements(By.id(listaElement));break;}
                case "Name": {listelements=this.webElement.findElements(By.name(listaElement));break;}
                case "Link": {listelements=this.webElement.findElements(By.linkText(listaElement));break;}
                case "PartialLink":{listelements=this.webElement.findElements(By.partialLinkText(listaElement));break;}
                case "Class": {listelements=this.webElement.findElements(By.className(listaElement));break;}
                case "Xpath":{listelements=this.webElement.findElements(By.xpath(listaElement));break;}
                case "css": {listelements=this.webElement.findElements(By.cssSelector(listaElement));break;}
                case "tagName":{listelements=this.webElement.findElements(By.tagName(listaElement));break;}
            }

            for(WebElement elementoLista :listelements){
                Util.imprimir("Revisando: "+elementoLista.getText());
                if (elementoLista.getText().equals(buscarItem)){
                    this.webElement=elementoLista;
                    Util.imprimir("Item seleccionado:"+this.webElement.getText());
                    found=true;
                    break;
                }
            }
            if (!found){
                throw new RuntimeException("Web Element not found");
            }
        }
        catch (Exception e){
            System.out.println("Web Element not found");
        }
    }
}

