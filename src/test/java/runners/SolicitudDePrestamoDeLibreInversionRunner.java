package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/solicitudPrestamoDeLibreInversion.feature",
        glue = {"stepDefinitions"},
        tags = "@smokeTest and @QA and @solicitudDePrestamoDeLibreInversion",
        plugin = {"pretty", "html:target/reporteSolicitudDePrestamoDeLibreInversion.html"}
)
public class SolicitudDePrestamoDeLibreInversionRunner {

}
