package stepsdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.ValidarMensajePopUpQuestions;
import tasks.*;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static utils.Constantes.ACTOR_NAME;

public class DiligenciarFormularioRegistroSinCaptchaSteps {


    @When("^el usuario selecciona la opción Crear una cuenta$")
    public void elUsuarioSeleccionaLaOpcionCrearUnaCuenta() {
        theActorCalled(ACTOR_NAME).attemptsTo(IrACrearCuentaTask.enWikipedia());
    }


    @And("^el usuario diligencia el formulario de registro sin CAPTCHA$")
    public void elUsuarioDiligenciaElFormularioDeRegistroSinCAPTCHA(DataTable dataTable) {
        // Se obtienen los campos del formulario desde la tabla de datos
        List<String> campos = dataTable.asList();
        theActorCalled(ACTOR_NAME).attemptsTo(DiligenciarFormularioRegistroTask.sinCaptcha(campos.get(0), campos.get(1), campos.get(2)));
    }

    @Then("^el usuario valida que se presente el pop up (.*) en el campo del CAPTCHA$")
    public void elUsuarioValidaQueSePresenteElPopUpEnElCampoDelCAPTCHA(String mensajeEsperado) {
        theActorCalled(ACTOR_NAME).attemptsTo(
                CrearCuentaTask.crearCuenta()

        );
        String mensajePopUp = theActorCalled(ACTOR_NAME).asksFor(ValidarMensajePopUpQuestions.enCaptcha());
        assertEquals(mensajeEsperado, mensajePopUp);
    }



}
