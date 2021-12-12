public class PracticeForm {

    private selenium selenium = new selenium();
    private int time = 2;
    private String practiceFormElementName = "Practice Form";
    private String practiceFormElemento = "//div[@class=\"left-pannel\"]/div/div[2]/div/ul/li/span";
    private String practiceFormLocator = "Xpath";

    private String practiceFormTitulo = "Student Registration Form";
    private String practiceFormTituloLocator = "Xpath";
    private String practiceFormTituloElemento = "//div[@class=“practice-form-wrapper”]/h5";

    public String obtenerTituloPagina(){
        return selenium.obtenerTituloPagina();
    }

    public void iniciarBrowser(String browser){
        selenium.iniciarBrowser(browser);
    }

    public void irUrl(String url){
        selenium.iniciarUrl(url);
        Util.Wait(time);
    }

    public void cerrarBrowser(){
        selenium.cerrarBrowser();
    }

    public void irElemento(String elementoPagina){
        switch (elementoPagina){
            case "Practice Form": {
                selenium.initSeleniumElement(practiceFormElementName,practiceFormElemento,practiceFormLocator);
                selenium.find();
                break;
            }
            case "Student Registration Form": {
                selenium.initSeleniumElement(practiceFormTitulo,practiceFormTituloElemento,practiceFormTituloLocator);
                selenium.find();
                break;
            }
        }
        Util.Wait(2);
    }

    public void clickElemento(){
        selenium.elementoClick();
    }

    public String obtenerTexto(){
        return selenium.textoElement();
    }
}

