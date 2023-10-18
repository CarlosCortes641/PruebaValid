package tasks;

import exceptions.ErrorInfoException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.WikipediaPortadaPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IrACrearCuentaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                    // Espera hasta que el enlace 'Crear cuenta' sea visible por un máximo de 10 segundos
                    WaitUntil.the(WikipediaPortadaPage.LNK_CREAR_CUENTA, isVisible()).forNoMoreThan(10).seconds(),
                    // Hace clic en el enlace 'Crear cuenta'
                    Click.on(WikipediaPortadaPage.LNK_CREAR_CUENTA)
        );

    }




    // Método estático para crear una instancia de la tarea 'IrACrearCuentaTask'
    public static IrACrearCuentaTask enWikipedia() {

        return instrumented(IrACrearCuentaTask.class);
    }
}
