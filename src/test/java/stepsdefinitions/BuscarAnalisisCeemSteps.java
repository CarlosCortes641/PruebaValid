package stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import questions.ValidarTituloQuestions;
import tasks.DesplazarContenidoPaginaTask;
import ui.WikipediaResultadoBusquedaPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class BuscarAnalisisCeemSteps {

    @And("^el usuario desplaza el contenido en busca de Análisis CEEM$")
    public void elUsuarioDesplazaElContenidoEnBuscaDeAnalisisCeem() {
        theActorInTheSpotlight().attemptsTo(DesplazarContenidoPaginaTask.busquedaTitulo());
    }

    @Then("^el usuario valida que en los resultados se encuentra (.*)$")
    public void elUsuarioValidaQueEnLosResultadosSeEncuentra(String titulo){
        theActorInTheSpotlight().should(seeThat(ValidarTituloQuestions.enTarget(WikipediaResultadoBusquedaPage.LBL_SUBTITULO_ANALISIS_CEEM), equalTo(titulo)));
    }

}
