package tasks;

import interactions.ScrollEndPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.WikipediaPortadaPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class CambiarVersionMovilesTask implements Task {

    // Sobrescritura del método
    @Override
    public <T extends Actor> void performAs(T actor) {
            // El actor intenta realizar una serie de acciones para cambiar a la versión de Moviles
            actor.attemptsTo(
                    ScrollEndPage.toTheEnd(),  // Utilizamos la interacción ScrollEndPage
                    Click.on(WikipediaPortadaPage.LNK_VERSION_MOVIL)
            );
    }

    // Método estático para crear una instancia de la tarea
    public static Performable versionMoviles() {
        return instrumented(CambiarVersionMovilesTask.class);
    }
}
