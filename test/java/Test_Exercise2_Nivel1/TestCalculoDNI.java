package Test_Exercise2_Nivel1;


import static org.junit.jupiter.api.Assertions.*;

import Exercise2_nivel1.CalculoDNI;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestCalculoDNI {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "87654321, X",
            "11111111, H",
            "22222222, J",
            "33333333, P",
            "44444444, A",
            "55555555, K",
            "66666666, Q",
            "77777777, B",
            "88888888, Y"
    })

    void testCalcularLetraDNI(int dni, char letraEsperada) {
        char letraCalculada = CalculoDNI.calculateDni(dni);
        assertEquals(letraEsperada, letraCalculada, "La letra calculada no coincide con la esperada para el DNI: " + dni);
    }

}
