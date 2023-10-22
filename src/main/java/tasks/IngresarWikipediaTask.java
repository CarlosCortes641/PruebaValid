package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import utils.Constantes;


public class IngresarWikipediaTask implements Task {

    // Sobrescritura del método
    @Override
    public <T extends Actor> void performAs(T actor) {
            // Abre la página de Wikipedia utilizando la URL definida en las constantes.
            actor.attemptsTo(
                    Open.url(Constantes.PAGINA_WIKIPEDIA)
            );
    }

    // Método estático para crear una instancia de la tarea
    public static Performable enLaPaginaPortada() {
        return Instrumented.instanceOf(IngresarWikipediaTask.class)
                .newInstance();
    }
}
