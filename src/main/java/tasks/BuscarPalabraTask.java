package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import ui.WikipediaPortadaPage;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarPalabraTask implements Task {
    private final String palabraClave;

    // Constructor para inicializar la tarea con la palabra clave
    public BuscarPalabraTask(String palabraClave) {

        this.palabraClave = palabraClave;
    }

    // Sobrescritura del método
    @Override
    @Step("{0} realiza la búsqueda de la palabra Sistema")
    public <T extends Actor> void performAs(T actor) {
            // El actor intenta realizar la búsqueda de la palabra clave en la página web.
            actor.attemptsTo(
                    WaitUntil.the(WikipediaPortadaPage.INPUT_BUSQUEDA, isVisible()).forNoMoreThan(10).seconds(),
                    SendKeys.of(palabraClave).into(WikipediaPortadaPage.INPUT_BUSQUEDA),
                    Click.on(WikipediaPortadaPage.BTN_BUSCAR)
            );
    }

    // Método estático para crear una instancia de la tarea con la palabra clave
    public static BuscarPalabraTask conPalabra(String palabraClave) {
        return instrumented(BuscarPalabraTask.class, palabraClave);
    }
}
