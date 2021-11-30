public class PracticeForm {

    private selenium selenium = new selenium();
    private int time = 5;

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

}
