package co.com.sophos.certificacion.tasks;

import co.com.sophos.certificacion.iteraciones.PaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(WaitUntil.the(PaginaInicial.BTN_CERRAR_POPUP, isVisible()),
                Click.on(PaginaInicial.BTN_CERRAR_POPUP),
        Click.on(PaginaInicial.OBJETO_COMPRA_1),
           Click.on(PaginaInicial.VER_CARRITO));
    }

    public static SeleccionarProducto con(){
         return Tasks.instrumented(SeleccionarProducto.class);
    }
}
