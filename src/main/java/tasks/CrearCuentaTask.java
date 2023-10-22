package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.WikipediaCrearCuentaPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class CrearCuentaTask implements Task {

    // Sobrescritura del método
    @Override
    public <T extends Actor> void performAs(T actor) {
            // Actor intenta hacer clic en el botón 'Crea cuenta'
            actor.attemptsTo(
                    WaitUntil.the(WikipediaCrearCuentaPage.BTN_CREA_CUENTA, isClickable()),
                    Click.on(WikipediaCrearCuentaPage.BTN_CREA_CUENTA)
            );
    }

    // Método estático para crear una instancia de la tarea
    public static CrearCuentaTask crearCuenta() {
        return instrumented(CrearCuentaTask.class);
    }
}