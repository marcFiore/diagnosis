package unit;

import com.softway.diagnosis.domain.AutoDiagnosticSystem;
import com.softway.diagnosis.domain.DiagnosticSystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests unitaires permettant de vérifier le fonctionnement de l'outil de diagnostic {@link com.mfisoftware.diagnosis.domain.service.DiagnosticSystem}
 */
public class DiagnosticSystemTest {
    DiagnosticSystem autoDiagnosticSystem;

    @BeforeEach
    public void setUp() {
        autoDiagnosticSystem = new AutoDiagnosticSystem();
    }

    /**
     * A heart problem should return "Cardiologie
     * @param healthIndex
     */
    @ParameterizedTest
    @ValueSource(ints = {33, 3, 99})
    public void shouldReturnHeartProblem(int healthIndex) {
        String diagnose = autoDiagnosticSystem.diagnose(healthIndex);
        assertEquals(diagnose, "Cardiologie");
    }

    /**
     * a traumatology problem should return Traumatologie
     * @param healthIndex
     */
    @ParameterizedTest
    @ValueSource(ints = {55, 25, 10, 5})
    public void shouldReturnTraumatologyProblem(int healthIndex) {
        String diagnose = autoDiagnosticSystem.diagnose(healthIndex);
        assertEquals(diagnose, "Traumatologie");
    }


    /**
     * Both problem should return Cardiologie, Traumatologie
     * @param healthIndex
     */
    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    public void shouldReturnBothProblem(int healthIndex) {
        String diagnose = autoDiagnosticSystem.diagnose(healthIndex);
        assertEquals(diagnose, "Cardiologie, Traumatologie");
    }

}
