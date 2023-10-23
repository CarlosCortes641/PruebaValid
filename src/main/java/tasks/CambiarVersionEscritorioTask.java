package tasks;

import interactions.ScrollEndPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import ui.WikipediaPortadaPage;

public class CambiarVersionEscritorioTask implements Task {

    // Sobrescritura del método
    @Override
    @Step("{0} cambia a la versión de Escritorio")
    public <T extends Actor> void performAs(T actor) {
            // El actor intenta realizar una serie de acciones para cambiar a la versión de Escritorio
            actor.attemptsTo(
                    ScrollEndPage.toTheEnd(), // Utilizamos la interacción ScrollEndPage
                    Click.on(WikipediaPortadaPage.LNK_VERSION_ESCRITORIO)
            );
    }

    // Método estático para crear una instancia de la tarea
    public static CambiarVersionEscritorioTask versionEscritorio() {
        return Tasks.instrumented(CambiarVersionEscritorioTask.class);
    }
}
