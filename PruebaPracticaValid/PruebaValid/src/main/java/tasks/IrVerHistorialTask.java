package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.WikipediaPortadaPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IrVerHistorialTask implements Task {

    private String botonEsperado;

    // Constructor de la task que recibe el botón esperado como parámetro
    public IrVerHistorialTask(String botonEsperado) {

        this.botonEsperado = botonEsperado;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        // Obtiene el texto del botón encontrado
        String botonEncontrado = WikipediaPortadaPage.LNK_VER_HISTORIAL.resolveFor(actor).getText();
        // System.out.println(botonEncontrado); // Esta línea de código se utiliza solo para la creación de scripts de prueba

        // Compara el botón encontrado con el esperado
        if (botonEncontrado.equals(botonEsperado)) {
            // El actor intenta realizar la siguiente secuencia de acciones:
            actor.attemptsTo(
                    // Espera hasta que el enlace "Ver Historial" esté visible
                    WaitUntil.the(WikipediaPortadaPage.LNK_VER_HISTORIAL, isVisible()).forNoMoreThan(10).seconds(),
                    // Hace clic en el enlace "Ver Historial"
                    Click.on(WikipediaPortadaPage.LNK_VER_HISTORIAL)
            );
        }

    }

    // Método estático para crear una instancia de IrVerHistorialTask
    public static IrVerHistorialTask enWikipedia(String botonEsperado) {

        return instrumented(IrVerHistorialTask.class, botonEsperado);
    }
}
