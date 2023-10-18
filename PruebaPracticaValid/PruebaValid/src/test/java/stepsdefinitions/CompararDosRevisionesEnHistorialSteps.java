package stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.ValidarCamposConTextosQuestions;
import tasks.CompararRevisionesSeleccionadasTask;
import tasks.IrVerHistorialTask;
import tasks.SeleccionarRadioButtonTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static utils.Constantes.ACTOR_NAME;

public class CompararDosRevisionesEnHistorialSteps {

    @When("^el usuario ingresa a la opción (.*)$")
    public void elUsuarioIngresaALaOpcionVerHistorial(String verHistorial) {
         theActorCalled(ACTOR_NAME).attemptsTo(IrVerHistorialTask.enWikipedia(verHistorial));
    }
    @And("^el usuario selecciona dos RADIO BUTTON$")
    public void elUsuarioSeleccionaDosRadioButton() {
        theActorCalled(ACTOR_NAME).attemptsTo(SeleccionarRadioButtonTask.enHistorial());
    }
    @When("^el usuario hace clic en el botón (.*)$")
    public void elUsuarioHaceClicEnElBoton(String botonEsperado) {
        theActorCalled(ACTOR_NAME).attemptsTo(CompararRevisionesSeleccionadasTask.enHistorial(botonEsperado));
    }
    @Then("^el usuario valida que existan dos campos de texto para comparar las revisiones$")
    public void elUsuarioDeberiaVerDosCamposDeTextoParaCompararLasRevisiones() {
        theActorCalled(ACTOR_NAME).should(seeThat(ValidarCamposConTextosQuestions.deLaRevisionComparadas()));
    }

}
