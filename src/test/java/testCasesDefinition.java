import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testCasesDefinition extends PruebaPaginaPracticeForm{

     String browser = "Chrome";
     String url = "https://demoqa.com/forms";
     String tituloPagina = "ToolsQA";
     String tituloForm = "Student Registration Form";

     @BeforeTest
     public void lanzarBrowser(){
         lanzarBrowser(browser);
     }

     @Test
     public void testCase1(){
         irUrl(url);
         validarTituloPagina(tituloPagina);
     }

    @Test
    public void testCase2(){
        irPracticeForm();
        clickElemento();
    }

    @Test
    public void testCase3(){
        irPracticeForm();
        clickElemento();
        irPracticeFormTitulo();
        validarTituloForm(tituloForm);
    }

     @AfterTest
     public void liberarBrowser(){
         cerrarBrowser();
     }


}

//div[class$=option]