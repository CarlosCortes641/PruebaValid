package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import ui.WikipediaHistorialPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarRadioButtonTask implements Task {

    // Sobrescritura del método
    @Override
    @Step("{0} selecciona dos RADIO BUTTON")
    public <T extends Actor> void performAs(T actor) {
            // El actor intenta seleccionar dos radios button
            actor.attemptsTo(
                    WaitUntil.the(WikipediaHistorialPage.RBT_UNO, isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(WikipediaHistorialPage.RBT_UNO),
                    WaitUntil.the(WikipediaHistorialPage.RBT_DOS, isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(WikipediaHistorialPage.RBT_DOS)
            );
    }

    // Método estático para crear una instancia de la tarea
    public static SeleccionarRadioButtonTask enHistorial() {
        return instrumented(SeleccionarRadioButtonTask.class);
    }
}

