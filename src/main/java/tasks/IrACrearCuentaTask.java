package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import ui.WikipediaPortadaPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IrACrearCuentaTask implements Task {

    // Sobrescritura del método
    @Override
    @Step("{0} hace clic en el link 'Crear una cuenta'")
    public <T extends Actor> void performAs(T actor) {
            // Actor intenta hacer clic en el link 'Crear una cuenta'
            actor.attemptsTo(
                    WaitUntil.the(WikipediaPortadaPage.LNK_CREAR_CUENTA, isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(WikipediaPortadaPage.LNK_CREAR_CUENTA)
            );
    }

    // Método estático para crear una instancia de la tarea
    public static IrACrearCuentaTask enWikipedia() {
        return instrumented(IrACrearCuentaTask.class);
    }
}
