package co.com.sophos.certificacion.iteraciones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicial {

    public static Target BTN_CERRAR_POPUP= Target.the("Se da clic en el boton no gracias").located(By.xpath("//button[contains(text(),'no gracias')]"));
    public static  Target OBJETO_COMPRA_1= Target.the("Producto a comprar").located(By.xpath("(//div[@class='product-item__bottom']//div[5]/button)[1]"));
    public  static Target VER_CARRITO = Target.the ("Ver Carrito").located(By.xpath("//div[@class='minicart minicart--floating minicart--has-items minicart--single-category']//a[@class='btn primary minicart__action minicart__action--buy']"));
    public static Target VALIDAR_PRODUCTO= Target.the("validar producto en carrito").located(By.xpath("//a[@class='product-item__image-wrapper']//img"));


}
