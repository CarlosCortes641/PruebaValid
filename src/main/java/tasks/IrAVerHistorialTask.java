package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.WikipediaPortadaPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IrAVerHistorialTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    // Espera hasta que el enlace "Ver Historial" esté visible
                    WaitUntil.the(WikipediaPortadaPage.LNK_VER_HISTORIAL, isVisible()).forNoMoreThan(10).seconds(),
                    // Hace clic en el enlace "Ver Historial"
                    Click.on(WikipediaPortadaPage.LNK_VER_HISTORIAL)
            );

    }

    // Método estático para crear una instancia de IrVerHistorialTask
    public static IrAVerHistorialTask enWikipedia() {

        return instrumented(IrAVerHistorialTask.class);
    }
}
