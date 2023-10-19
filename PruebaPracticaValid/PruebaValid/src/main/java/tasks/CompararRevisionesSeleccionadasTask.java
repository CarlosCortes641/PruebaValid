package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.WikipediaHistorialPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompararRevisionesSeleccionadasTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    // Espera hasta que el botón de comparar sea visible
                    WaitUntil.the(WikipediaHistorialPage.BTN_COMPARAR, isVisible()).forNoMoreThan(10).seconds(),
                    // Hace clic en el botón de comparar
                    Click.on(WikipediaHistorialPage.BTN_COMPARAR)
            );


    }

    // Método estático para crear una instancia de CompararRevisionesSeleccionadasTask
    public static CompararRevisionesSeleccionadasTask enHistorial() {
        return instrumented(CompararRevisionesSeleccionadasTask.class);
    }
}

