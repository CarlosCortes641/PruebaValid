package tasks;

import exceptions.ErrorInfoException;
import interactions.ScrollEndPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.WikipediaPortadaPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CambiarVersionEscritorioTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        try{
            // El actor intenta realizar una serie de acciones para cambiar a la versión de Escritorio
            actor.attemptsTo(
                    // Utiliza la interacción ScrollEndPage para desplazarnos al final de la página
                    ScrollEndPage.toTheEnd(),
                    // Espera hasta que el enlace a la versión de Escritorio esté visible
                    WaitUntil.the(WikipediaPortadaPage.LNK_VERSION_ESCRITORIO, isVisible()).forNoMoreThan(10).seconds(),
                    // Hace clic en el enlace de la versión de Escritorio
                    Click.on(WikipediaPortadaPage.LNK_VERSION_ESCRITORIO)
            );
        } catch (Exception e) {
            // Si ocurre una excepción (error), la capturamos y lanzamos una nueva excepción personalizada
            throw new ErrorInfoException("Error al hacer scroll y dar click en la versión de Escritorio.",e);
        }

    }

    // Método estático para crear una instancia de CambiarVersionEscritorioTask
    public static CambiarVersionEscritorioTask versionEscritorio() {
        return Tasks.instrumented(CambiarVersionEscritorioTask.class);
    }
}
