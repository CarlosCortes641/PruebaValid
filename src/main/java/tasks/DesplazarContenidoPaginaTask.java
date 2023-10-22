package tasks;

import interactions.ScrollToTarget;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.WikipediaResultadoBusquedaPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DesplazarContenidoPaginaTask implements Task {

    // Sobrescritura del método
    @Override
    public <T extends Actor> void performAs(T actor) {
            // El actor intenta realizar scroll en búsqueda del título Análisis CEEM
            actor.attemptsTo(
                    ScrollToTarget.to(WikipediaResultadoBusquedaPage.LBL_SUBTITULO_ANALISIS_CEEM),  // Utilizamos la interacción ScrollToTarget
                    WaitUntil.the(WikipediaResultadoBusquedaPage.LBL_SUBTITULO_ANALISIS_CEEM, isVisible()).forNoMoreThan(10).seconds()
            );
    }

    // Método estático para crear una instancia de la tarea
    public static DesplazarContenidoPaginaTask busquedaTitulo() {
        return Tasks.instrumented(DesplazarContenidoPaginaTask.class);
    }
}