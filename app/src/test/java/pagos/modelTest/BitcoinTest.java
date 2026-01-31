package pagos.modelTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pagos.model.Bitcoin;

public class BitcoinTest {

    private Bitcoin bitcoin;

    @BeforeEach
    void setUp() {
        bitcoin = new Bitcoin("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa");
    }

    @Test
    void pago_conMontoValido_deberiaMostrarMensajeCorrecto() {
        // Guardar salida original
        PrintStream salidaOriginal = System.out;

        // Capturar la salida por consola
        ByteArrayOutputStream salidaConsola = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salidaConsola));

        try {
            bitcoin.pago(1000); // Ejecutar el método

            String salida = salidaConsola.toString().trim();
            assertTrue(salida.contains("Pagando 1000 con Bitcoin a la billetera 1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"),
                    "El mensaje debería contener el monto y referencia a Bitcoin");
        } finally {
            // Restaurar salida original, aunque haya fallos en el test
            System.setOut(salidaOriginal);
        }
    }

    

}
