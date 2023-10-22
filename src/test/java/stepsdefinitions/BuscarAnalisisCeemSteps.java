package stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import questions.ValidarTituloQuestions;
import tasks.DesplazarContenidoPaginaTask;
import ui.WikipediaResultadoBusquedaPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.CoreMatchers.equalTo;
import static utils.Constantes.ACTOR_NAME;

public class BuscarAnalisisCeemSteps {

    @And("^el usuario desplaza el contenido en busca de Análisis CEEM$")
    public void elUsuarioDesplazaElContenidoEnBuscaDeAnalisisCeem() {
        theActorCalled(ACTOR_NAME).attemptsTo(DesplazarContenidoPaginaTask.busquedaTitulo());
    }

    @Then("^el usuario valida que en los resultados se encuentra (.*)$")
    public void elUsuarioValidaQueEnLosResultadosSeEncuentra(String titulo){
        theActorCalled(ACTOR_NAME).should(seeThat(ValidarTituloQuestions.enTarget(WikipediaResultadoBusquedaPage.LBL_SUBTITULO_ANALISIS_CEEM), equalTo(titulo)));
    }

}
