package stepdefinitions;
import cucumber.api.java.es.*;

import java.util.List;

public class EjemploGlobalSteps {
    @Dado("^que un nuevo cliente accede hasta la web de compras$")
    public void queUnNuevoClienteAccedeHastaLaWebDeCompras() {

    }

    @Cuando("^el agrega un producto al carro$")
    public void elAgregaUnProductoAlCarro() {

    }

    @Entonces("^el ve los productos listado en el carro de compras$")
    public void elVeLosProductosListadoEnElCarroDeCompras() {

    }

    @Cuando("^el agrega productos al carro$")
    public void elAgregaProductosAlCarro(List<String> datos) {

    }



}
