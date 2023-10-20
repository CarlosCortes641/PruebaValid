package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;



public class WikipediaPortadaPage extends PageObject {
    public static Target LBL_TITULO = Target.the("Título página de inicio").located(By.id("Bienvenidos_a_Wikipedia,"));
    public static Target LNK_CREAR_CUENTA = Target.the("Link crear cuenta").located(By.id("pt-createaccount-2"));
    public static Target INPUT_BUSQUEDA = Target.the("Input de búsqueda").located(By.xpath("//input[@id='searchInput']"));
    public static Target BTN_BUSCAR = Target.the("Botón buscar").located(By.xpath("//*[@id=\"searchform\"]/div/button"));
    public static Target LNK_VER_HISTORIAL = Target.the("Link ver historial").located(By.xpath("//*[@id=\"ca-history\"]/a/span"));
    public static Target LNK_VERSION_MOVIL = Target.the("Link versión para móviles").located(By.xpath("//*[@id=\"footer-places-mobileview\"]/a"));
    public static Target LNK_VERSION_ESCRITORIO = Target.the("Link versión para Escritorio").located(By.xpath("//a[@id='mw-mf-display-toggle']"));

}
