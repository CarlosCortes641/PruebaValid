package tasks;

import interactions.ScrollToTarget;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.WikipediaResultadoBusquedaPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DesplazarContenidoPaginaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        // El actor intenta realizar la siguiente secuencia de acciones:
        actor.attemptsTo(

                // Desplaza la página hasta el elemento identificado por LBL_SUBTITULO_ANALISIS_CEEM.
                ScrollToTarget.to(WikipediaResultadoBusquedaPage.LBL_SUBTITULO_ANALISIS_CEEM),  // Utilizamos la interacción ScrollToTarget
                // Espera hasta que el elemento LBL_SUBTITULO_ANALISIS_CEEM esté visible por un máximo de 10 segundos.
                WaitUntil.the(WikipediaResultadoBusquedaPage.LBL_SUBTITULO_ANALISIS_CEEM, isVisible()).forNoMoreThan(10).seconds()
        );


    }

    // Método estático para crear una instancia de la tarea DesplazarContenidoPaginaTask
    public static DesplazarContenidoPaginaTask busquedaTitulo() {
        return Tasks.instrumented(DesplazarContenidoPaginaTask.class);
    }
}