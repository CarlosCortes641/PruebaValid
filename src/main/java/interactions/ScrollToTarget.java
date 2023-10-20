package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Interacción personalizada que desplaza la página web para que un elemento objetivo sea visible.
 * Se utiliza para permitir a un actor desplazar la página hasta que un elemento específico sea visible en la pantalla.
 */
public class ScrollToTarget implements Interaction {

    private final Target target;

    public ScrollToTarget(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Obtiene el controlador del navegador web actualmente utilizado por el actor.
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        // Resuelve el elemento objetivo utilizando el actor.
        WebElement element = target.resolveFor(actor);
        // Crea un objeto JavascriptExecutor para ejecutar JavaScript en la página.
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Ejecuta una secuencia de JavaScript para desplazar la página y hacer que el elemento sea visible.
        js.executeScript("arguments[0].scrollIntoView(true);", element);


    }

    /**
     * Método estático que crea una instancia de la interacción ScrollToTarget con un elemento objetivo.
     * Permite que el actor desplace la página para hacer que el elemento sea visible.
     *
     * @param target El elemento objetivo al cual se desea desplazar la página.
     * @return Una instancia de la interacción ScrollToTarget.
     */
    public static ScrollToTarget to(Target target) {
        return new ScrollToTarget(target);
    }
}
