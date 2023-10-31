package stepsdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.ValidarMensajePopUpQuestions;
import tasks.CrearCuentaTask;
import tasks.DiligenciarFormularioRegistroTask;
import tasks.IrACrearCuentaTask;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class DiligenciarFormularioRegistroSinCaptchaSteps {

    @When("^el usuario selecciona la opción Crear una cuenta$")
    public void elUsuarioSeleccionaLaOpcionCrearUnaCuenta() {
        theActorInTheSpotlight().attemptsTo(IrACrearCuentaTask.enWikipedia());
    }

    @And("^el usuario diligencia el formulario de registro sin CAPTCHA$")
    public void elUsuarioDiligenciaElFormularioDeRegistroSinCAPTCHA(DataTable dataTable) {
        // Se obtienen los campos del formulario desde la tabla de datos
        List<String> campos = dataTable.asList();
        theActorInTheSpotlight().attemptsTo(
                DiligenciarFormularioRegistroTask.sinCaptcha(campos.get(0), campos.get(1), campos.get(2)),
                CrearCuentaTask.crearCuenta()
        );
    }

    @Then("^el usuario valida que se presente el pop up (.*) en el campo del CAPTCHA$")
    public void elUsuarioValidaQueSePresenteElPopUpEnElCampoDelCAPTCHA(String mensajeEsperado) {
        // Se utiliza la pregunta para obtener el mensaje actual en el campo CAPTCHA y se compara con el mensaje esperado.
        theActorInTheSpotlight().should(seeThat(ValidarMensajePopUpQuestions.enCaptcha(), equalTo(mensajeEsperado)));
    }

}
