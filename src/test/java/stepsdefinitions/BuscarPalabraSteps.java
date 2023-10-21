package stepsdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.ValidarTituloQuestions;
import tasks.BuscarPalabraTask;
import ui.WikipediaResultadoBusquedaPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.CoreMatchers.equalTo;
import static utils.Constantes.ACTOR_NAME;

public class BuscarPalabraSteps {

    @When("^el usuario realiza búsqueda de la palabra (.*)$")
    public void elUsuarioRealizaBusquedaDeLaPalabra(String palabraClave) {
        theActorCalled(ACTOR_NAME).attemptsTo(BuscarPalabraTask.conPalabra(palabraClave));
    }

    @Then("^el título de la búsqueda debe coincidir con (.*)$")
    public void elTituloDeLaBusquedaDebeCoincidirCon(String palabraClave) {
        theActorCalled(ACTOR_NAME).should(seeThat(ValidarTituloQuestions.enTarget(WikipediaResultadoBusquedaPage.LBL_TITULO_RESULTADO), equalTo(palabraClave)));
    }

}
