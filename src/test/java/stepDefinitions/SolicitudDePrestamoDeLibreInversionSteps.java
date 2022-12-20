package stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

public class SolicitudDePrestamoDeLibreInversionSteps {
    @Dado("que soy un cliente registrado")
    public void queSoyUnClienteRegistrado() {
    }

    @Cuando("el cliente llena el formulario de solicitud de prestramo de libre inversion con todos los datos solicitados")
    public void elClienteLlenaElFormularioDeSolicitudDePrestramoDeLibreInversionConTodosLosDatosSolicitados() {
    }

    @Y("el cliente envia la solicitud")
    public void elClienteEnviaLaSolicitud() {
    }

    @Entonces("se le notifica al cliente que su solicitud ha sido aprobada")
    public void seLeNotificaAlClienteQueSuSolicitudHaSidoAprobada() {
    }

    @Y("se le proporciona informacion sobre el prestamo")
    public void seLeProporcionaInformacionSobreElPrestamo() {
    }

    @Entonces("se le notifica al cliente que su solicitud no ha sido aprobada debido a su historial crediticio negativo")
    public void seLeNotificaAlClienteQueSuSolicitudNoHaSidoAprobadaDebidoASuHistorialCrediticioNegativo() {
    }

    @Entonces("se le notifica al cliente que su solicitud no ha sido aprobada debido a que su capacidad de pago es insuficiente")
    public void seLeNotificaAlClienteQueSuSolicitudNoHaSidoAprobadaDebidoAQueSuCapacidadDePagoEsInsuficiente() {
    }

    @Cuando("el cliente llena el formulario de solicitud de prestamos en libre inversion dejando un campo obligatorio vacio")
    public void elClienteLlenaElFormularioDeSolicitudDePrestamosEnLibreInversionDejandoUnCampoObligatorioVacio() {
    }

    @Entonces("se le notifica al cliente que no puede enviar su solicitud debido ha que ha dejado campos obligatorios vacios")
    public void seLeNotificaAlClienteQueNoPuedeEnviarSuSolicitudDebidoHaQueHaDejadoCamposObligatoriosVacios() {
    }
}
