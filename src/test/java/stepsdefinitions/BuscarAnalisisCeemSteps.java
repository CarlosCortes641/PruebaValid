package stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import questions.ValidarSubtituloBuscadoQuestions;
import tasks.DesplazarContenidoPaginaTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static utils.Constantes.ACTOR_NAME;

public class BuscarAnalisisCeemSteps {

    @And("^el usuario desplaza el contenido en busca de Análisis CEEM$")
    public void elUsuarioDesplazaElContenidoEnBuscaDeAnalisisCeem() {
        theActorCalled(ACTOR_NAME).attemptsTo(DesplazarContenidoPaginaTask.aSubtitulo());
    }

    @Then("^el usuario valida que en los resultados se encuentra (.*)$")
    public void elUsuarioValidaQueEnLosResultadosSeEncuentra(String subtitulo){
        theActorCalled(ACTOR_NAME).should(seeThat(ValidarSubtituloBuscadoQuestions.igualA(subtitulo)));

    }
}
