package stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.ValidarOpcionEscritorioQuestions;
import tasks.CambiarVersionEscritorioTask;
import tasks.CambiarVersionMovilesTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class CambiarEntreVersionesSteps {

    @When("^el usuario desde la parte inferior de la página selecciona la opción Versión para móviles$")
    public void elUsuarioDesdeLaParteInferiorDeLaPaginaSeleccionaLaOpcionVersionParaMoviles() {
        theActorInTheSpotlight().attemptsTo(CambiarVersionMovilesTask.versionMoviles());
    }

    @Then("^el usuario valida que se encuentre la opción Escritorio$")
    public void elUusuarioDeberiaVerLaOpcionEscritorio() {
        theActorInTheSpotlight().should(seeThat(ValidarOpcionEscritorioQuestions.esVisible(), equalTo(true)));
    }

    @And("^el usuario regresa a esta versión$")
    public void elUsuarioRegresaAEstaVersion() {
        theActorInTheSpotlight().attemptsTo(CambiarVersionEscritorioTask.versionEscritorio());
    }

}
