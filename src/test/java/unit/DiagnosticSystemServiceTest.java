package unit;

import com.softway.diagnosis.domain.service.AutoDiagnosticSystemService;
import com.softway.diagnosis.domain.service.DiagnosticSystemService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests unitaires permettant de vérifier le fonctionnement de l'outil de diagnostic {@link com.mfisoftware.diagnosis.domain.service.DiagnosticSystem}
 */
class DiagnosticSystemServiceTest {
    DiagnosticSystemService autoDiagnosticSystemService;

    @BeforeEach
    public void setUp() {
        autoDiagnosticSystemService = new AutoDiagnosticSystemService();
    }

    /**
     * A heart problem should return "Cardiologie
     * @param healthIndex
     */
    @ParameterizedTest
    @ValueSource(ints = {33, 3, 99})
    void shouldReturnHeartProblem(int healthIndex) {
        String diagnose = autoDiagnosticSystemService.diagnose(healthIndex);
        assertEquals("Cardiologie", diagnose);
    }

    /**
     * a traumatology problem should return Traumatologie
     * @param healthIndex
     */
    @ParameterizedTest
    @ValueSource(ints = {55, 25, 10, 5})
    void shouldReturnTraumatologyProblem(int healthIndex) {
        String diagnose = autoDiagnosticSystemService.diagnose(healthIndex);
        assertEquals("Traumatologie", diagnose);
    }

    /**
     * Both problem should return Cardiologie, Traumatologie
     * @param healthIndex
     */
    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    void shouldReturnBothProblem(int healthIndex) {
        String diagnose = autoDiagnosticSystemService.diagnose(healthIndex);
        assertEquals("Cardiologie, Traumatologie", diagnose);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 13, 28, 44})
    void shouldReturnNoProblem(int healthIndex) {
        String diagnose = autoDiagnosticSystemService.diagnose(healthIndex);
        assertEquals("pas de pathologie", diagnose);
    }

}
