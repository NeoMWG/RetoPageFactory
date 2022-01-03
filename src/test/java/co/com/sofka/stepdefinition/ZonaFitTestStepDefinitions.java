package co.com.sofka.stepdefinition;

import co.com.sofka.model.ZonaFitCoModel;
import co.com.sofka.setup.WebUI;
import com.tigervnc.rdr.Exception;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

public class ZonaFitTestStepDefinitions extends WebUI {

    private static final Logger LOGGER = Logger.getLogger(ZonaFitTestStepDefinitions.class);
    private static final String MESSAGE= "MESSAJE";


    @Given("El cliente se encuentra en el portal de compras de la página de zonafit")
    public void elClienteSeEncuentraEnElPortalDeComprasDeLaPaginaDeZonafit () {
        try {

        } catch (Exception exception) {
            LOGGER.warn(exception.getMessage());
            quiteDriver();
            Assertions.fail(MESSAGE);

    }

    @When("el cliente ingresa a la opción de ofertas, selecciona los productos que desea comprar")
    public void elClienteIngresaALaOpcionDeOfertasSeleccionaLosProductosQueDeseaComprar () {
        try {

        } catch (Exception exception) {
            LOGGER.warn(exception.getMessage());
            quiteDriver();
            Assertions.fail(MESSAGE);
    }

    @When("el cliente llena el formulario de detalles del pago y confirma su acción")
    public void elClienteLlenaElFormularioDeDetallesDelPagoYConfirmaSuAccion () {
        try {

        } catch (Exception exception) {
            LOGGER.warn(exception.getMessage());
            quiteDriver();
            Assertions.fail(MESSAGE);
        }
    }

    @Then("la página deberá mostrar un mensaje indicando pedido recibido")
    public void laPaginaDeberaMostrarUnMensajeIndicandoPedidoRecibido () {
                try {

                } catch (Exception exception) {
                    LOGGER.warn(exception.getMessage());
                    quiteDriver();
                    Assertions.fail(MESSAGE);
                }
            }



    private void generateClient () {
        searchClient = new ZonaFitCoModel();
        searchClient.setnameClient
        searchClient.setlastName("");
        searchClient.setemailClient("");

    }
}
