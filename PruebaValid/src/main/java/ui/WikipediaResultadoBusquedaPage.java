package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WikipediaResultadoBusquedaPage extends PageObject {
    public static Target LBL_TITULO_RESULTADO = Target.the("Titulo de la búsqueda").located(By.id("firstHeading"));
    public static Target LBL_SUBTITULO_ANALISIS_CEEM = Target.the("Subtitulo de Análisis CEEM").located(By.xpath("//span[@id='Análisis_CEEM']"));

}
