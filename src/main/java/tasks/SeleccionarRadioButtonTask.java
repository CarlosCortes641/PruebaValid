package tasks;

import exceptions.ErrorInfoException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.WikipediaHistorialPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarRadioButtonTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            // El actor intenta realizar la siguiente secuencia de acciones:
             actor.attemptsTo(
                     // Espera hasta que el primer radio button sea visible
                     WaitUntil.the(WikipediaHistorialPage.RBT_UNO, isVisible()).forNoMoreThan(10).seconds(),
                     // Hace clic en el primer radio button
                     Click.on(WikipediaHistorialPage.RBT_UNO),
                     // Espera hasta que el segundo radio button sea visible
                     WaitUntil.the(WikipediaHistorialPage.RBT_DOS, isVisible()).forNoMoreThan(10).seconds(),
                     // Hace clic en el segundo radio button
                     Click.on(WikipediaHistorialPage.RBT_DOS)
             );

        } catch (Exception e) {
            // Si ocurre una excepción (error), la capturamos y lanzamos una nueva excepción personalizada
            throw new ErrorInfoException("Error no encuentra Radio button en Ver historial.", e);
        }

    }

    // Método estático para crear una instancia de SeleccionarRadioButtonTask
    public static SeleccionarRadioButtonTask enHistorial() {

        return instrumented(SeleccionarRadioButtonTask.class);
    }
}

