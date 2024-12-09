package cucumber.steps;

import com.softway.diagnosis.domain.service.AutoDiagnosticSystemService;
import com.softway.diagnosis.domain.service.DiagnosticSystemService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

/**
 * Classe implémentant les scénarii gherkin
 */
public class DiagnosisStep {

    DiagnosticSystemService diagnosticSystemService = new AutoDiagnosticSystemService();

    int healthIindex;

    String diagnose;

    @Given("the sensor provides a health index like {int}")
    public void the_sensor_provides_a_health_index_like(int healthIindex) {
        this.healthIindex = healthIindex;
    }

    @Given("the sensor provides a {int}")
    public void the_sensor_provides_a(Integer healthIindex) {
        this.healthIindex = healthIindex;
    }

    @When("the machine interprets the index as multiple of 3")
    public void the_machine_interprets_the_index_as_multiple_of_3() {
        this.diagnose = diagnosticSystemService.diagnose(healthIindex);
    }

    @When("the machine interprets the index as multiple of 5")
    public void the_machine_interprets_the_index_as_multiple_of_5() {
        this.diagnose = diagnosticSystemService.diagnose(healthIindex);
    }

    @When("the machine interprets the index as multiple of 3 and 5")
    public void the_machine_interprets_the_index_as_multiple_of_3_and_5() {
        this.diagnose = diagnosticSystemService.diagnose(healthIindex);
    }

    @When("the machine interprets the index as not multiple of 3 and 5")
    public void theMachineInterpretsTheIndexAsNotMultipleOfAnd() {
        this.diagnose = diagnosticSystemService.diagnose(healthIindex);
    }

    @Then("the screen should display {string}")
    public void theScreenShouldDisplay(String expectedResult) {
        Assertions.assertEquals(this.diagnose, expectedResult);
    }

}