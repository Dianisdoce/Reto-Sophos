package co.com.sophos.certificacion.preguntas;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;

import static co.com.sophos.certificacion.iteraciones.PaginaInicial.VALIDAR_PRODUCTO;

public class ValidarProducto implements Question<Boolean> {

    public static ValidarProducto enCarrito() {
        return new ValidarProducto();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return VALIDAR_PRODUCTO.resolveFor(actor).isVisible();
    }
}
