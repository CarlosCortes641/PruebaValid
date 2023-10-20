package interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 * Interacción personalizada que desplaza la página web hasta el final.
 * Se utiliza para permitir a un actor realizar un desplazamiento hasta el final de la página.
 */
public class ScrollEndPage implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Obtiene el controlador del navegador web actualmente utilizado por el actor
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        // Crea un objeto JavascriptExecutor para ejecutar JavaScript en la página
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Ejecuta una secuencia de JavaScript para desplazar la página web hasta el final
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }

    /**
     * Método estático que crea una instancia de la interacción ScrollEndPage.
     * Permite que el actor realice un desplazamiento hasta el final de la página.
     */
    public static ScrollEndPage toTheEnd() {

        return new ScrollEndPage();
    }
}