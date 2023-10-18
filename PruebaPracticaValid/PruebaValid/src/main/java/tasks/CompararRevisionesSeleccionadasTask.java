package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.WikipediaHistorialPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompararRevisionesSeleccionadasTask implements Task {

    private String botonEsperado;

    // Constructor de la task que recibe el botón esperado como parámetro
    public CompararRevisionesSeleccionadasTask(String botonEsperado) {

        this.botonEsperado = botonEsperado;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Obtiene el texto del botón encontrado
        String botonEncontrado = WikipediaHistorialPage.BTN_COMPARAR.resolveFor(actor).getAttribute("value");
        // System.out.println(botonEncontrado); // Esta línea de código se utiliza solo para la creación de scripts de prueba

        // Compara el botón encontrado con el esperado
        if (botonEncontrado.equals(botonEsperado)) {
            // El actor intenta realizar la siguiente secuencia de acciones:
            actor.attemptsTo(
                    // Espera hasta que el botón de comparar sea visible
                    WaitUntil.the(WikipediaHistorialPage.BTN_COMPARAR, isVisible()).forNoMoreThan(10).seconds(),
                    // Hace clic en el botón de comparar
                    Click.on(WikipediaHistorialPage.BTN_COMPARAR)
            );
        }

    }

    // Método estático para crear una instancia de CompararRevisionesSeleccionadasTask con el botón esperado como parámetro
    public static CompararRevisionesSeleccionadasTask enHistorial(String botonEsperado) {
        return instrumented(CompararRevisionesSeleccionadasTask.class, botonEsperado);
    }
}

