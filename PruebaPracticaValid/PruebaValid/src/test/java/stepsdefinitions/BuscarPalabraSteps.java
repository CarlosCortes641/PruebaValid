package stepsdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.ValidarTituloResultadoBusquedaQuestions;
import tasks.BuscarPalabraTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static utils.Constantes.ACTOR_NAME;

public class BuscarPalabraSteps {

    @When("^el usuario realiza una búsqueda de la palabra (.*)$")
    public void elUsuarioRealizaUnaBusquedaDeLaPalabra(String palabraClave) {
        theActorCalled(ACTOR_NAME).attemptsTo(BuscarPalabraTask.conPalabra(palabraClave));
    }

    @Then("^el título de la búsqueda debe coincidir con (.*)$")
    public void elTituloDeLaBusquedaDebeCoincidirCon(String palabraClave) {
        theActorCalled(ACTOR_NAME).should(seeThat(ValidarTituloResultadoBusquedaQuestions.coincidaCon(palabraClave)));
    }
}
