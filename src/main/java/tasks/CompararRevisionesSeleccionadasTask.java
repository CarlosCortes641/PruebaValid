package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import ui.WikipediaHistorialPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompararRevisionesSeleccionadasTask implements Task {

    // Sobrescritura del método
    @Override
    @Step("{0} hace clic en el botón 'Comparar revisiones seleccionadas'")
    public <T extends Actor> void performAs(T actor) {
            // Actor intenta hacer clic en el botón 'Comparar'
            actor.attemptsTo(
                    WaitUntil.the(WikipediaHistorialPage.BTN_COMPARAR, isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(WikipediaHistorialPage.BTN_COMPARAR)
            );
    }

    // Método estático para crear una instancia de la tarea
    public static CompararRevisionesSeleccionadasTask enHistorial() {
        return instrumented(CompararRevisionesSeleccionadasTask.class);
    }
}

