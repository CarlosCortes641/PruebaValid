package stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.ValidarOpcionEscritorioQuestions;
import questions.ValidarTituloQuestions;
import tasks.CambiarVersionEscritorioTask;
import tasks.CambiarVersionMovilesTask;
import ui.WikipediaPortadaPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.CoreMatchers.equalTo;
import static utils.Constantes.ACTOR_NAME;

public class CambiarEntreVersionesSteps {

    @When("^el usuario desde la parte inferior de la página selecciona la opción Versión para móviles$")
    public void elUsuarioDesdeLaParteInferiorDeLaPaginaSeleccionaLaOpcionVersionParaMoviles() {
         theActorCalled(ACTOR_NAME).attemptsTo(CambiarVersionMovilesTask.versionMoviles());
    }

    @Then("^el usuario valida que se encuentre la opción Escritorio$")
    public void elUusuarioDeberiaVerLaOpcionEscritorio() {
            theActorCalled(ACTOR_NAME).should(seeThat(ValidarOpcionEscritorioQuestions.esVisible(), equalTo(true)));
    }

    @And("^el usuario regresa a esta versión$")
    public void elUsuarioRegresaAEstaVersion() {
        theActorCalled(ACTOR_NAME).attemptsTo(CambiarVersionEscritorioTask.versionEscritorio());
    }

}
