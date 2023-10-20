package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WikipediaResultadoComparacionRevisionPage extends PageObject {
    public static Target TXT_ELEMENTO_UNO = Target.the("Texto elemento uno del resultado comparación de revisión").located(By.xpath("//tbody/tr[1]/td[1]/div[3]/span[1]"));
    public static Target TXT_ELEMENTO_DOS = Target.the("Texto elemento dos del resultado comparación de revisión").located(By.xpath("//tbody/tr[1]/td[2]/div[3]/span[1]"));

}
