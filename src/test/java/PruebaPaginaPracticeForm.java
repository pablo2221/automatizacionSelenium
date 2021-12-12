import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class PruebaPaginaPracticeForm{

    WebDriver driver;

    private PracticeForm paginaPracticeForm = new PracticeForm();
    public void lanzarBrowser(String browser){
        paginaPracticeForm.iniciarBrowser(browser);
        imprimir("abriendo browser");
    }

    public static void imprimir(String mensaje){
        System.out.println(mensaje);
        Reporter.log(mensaje);
    }

    public void cerrarBrowser(){
        paginaPracticeForm.cerrarBrowser();
        imprimir("Cerrando browser");

    }

    public void irUrl(String url){
        paginaPracticeForm.irUrl(url);
        testUtil.imprimir("Navegando al URL: "+url);
        Util.Wait(5);
    }

    public String obtenerTituloPagina(){
        return paginaPracticeForm.obtenerTituloPagina();
    }

    public void maximizarVentana(){
        driver.manage().window().maximize();
    }

    public void validarTituloPagina(String tituloPagina){
        testUtil.imprimir("vamos a comparar el titulo de la pagina con el titulo" + tituloPagina);
        Assert.assertEquals(obtenerTituloPagina(),tituloPagina,"VP - Failed: El titulo no coincide con el titulo de la pagina ");
        testUtil.imprimir("VP - Passed: El titulo corresponde con el titulo de la pagina");
    }

    public void irPracticeForm(){
        testUtil.imprimir("ir a practice Form");
        paginaPracticeForm.irElemento("Practice Form");
    }

    public void clickElemento(){
        testUtil.imprimir("Hace click en el elemento");
        paginaPracticeForm.clickElemento();
    }

    public void irPracticeFormTitulo(){
        testUtil.imprimir("Vamos a ver el titulo");
        paginaPracticeForm.irElemento("Practice Form Titulo");
    }

    public void validarTituloForm(String tituloValidar){
        testUtil.imprimir("Validar el titulo del form que sea igual a: "+tituloValidar);
        Assert.assertEquals(paginaPracticeForm.obtenerTexto(),tituloValidar,"Validation Point failed: El "+tituloValidar+ "no coincide con el esperado");
    }
}
