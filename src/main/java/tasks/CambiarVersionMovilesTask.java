package tasks;

import interactions.ScrollEndPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.WikipediaPortadaPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
public class CambiarVersionMovilesTask implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    // Desplazarse al final de la página
                    ScrollEndPage.toTheEnd(),
                    // Esperar a que el enlace de la versión móvil sea visible
                    WaitUntil.the(WikipediaPortadaPage.LNK_VERSION_MOVIL, isVisible()).forNoMoreThan(10).seconds(),
                    // Hacer clic en el enlace de la versión móvil
                    Click.on(WikipediaPortadaPage.LNK_VERSION_MOVIL)
            );

    }

    // Método estático para crear una instancia de la tarea
    public static Performable aLaOpcion() {
        return instrumented(CambiarVersionMovilesTask.class);
    }
}