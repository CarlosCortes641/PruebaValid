package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import ui.WikipediaPortadaPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IrAVerHistorialTask implements Task {

    // Sobrescritura del método
    @Override
    @Step("{0} hace clic en el link 'Ver historial'")
    public <T extends Actor> void performAs(T actor) {
            // Actor intenta hacer clic en el link 'Ver historial'
            actor.attemptsTo(
                    WaitUntil.the(WikipediaPortadaPage.LNK_VER_HISTORIAL, isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(WikipediaPortadaPage.LNK_VER_HISTORIAL)
            );
    }

    // Método estático para crear una instancia de la tarea
    public static IrAVerHistorialTask enWikipedia() {
        return instrumented(IrAVerHistorialTask.class);
    }
}
