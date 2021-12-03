import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testCasesDefinition extends PruebaPaginaPracticeForm{

     String browser = "Chrome";
     String url = "https://demoqa.com/forms";
     String tituloPagina = "ToolsQA";

     @BeforeTest
     public void lanzarBrowser(){
         lanzarBrowser(browser);
     }

     @Test
     public void  testCase1(){
         irUrl(url);
         validarTituloPagina(tituloPagina);
     }

     @AfterTest
     public void liberarBrowser(){
         cerrarBrowser();
     }
}
