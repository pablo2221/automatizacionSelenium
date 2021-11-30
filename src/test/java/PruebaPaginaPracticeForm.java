import org.testng.Reporter;

public class PruebaPaginaPracticeForm {

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
        imprimir("Navegando al URL: "+url);
    }
}
