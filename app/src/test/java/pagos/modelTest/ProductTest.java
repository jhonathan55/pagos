package pagos.modelTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import pagos.model.Producto;

public class ProductTest {




    @Test
    void crearProducto_DeberiaGuardarNombreYPrecio() {
        Producto producto = new Producto("Mouse", 100);

        assertEquals("Mouse", producto.getNombre());
        assertEquals(100, producto.getPrecio());
    }

    @Test
    void crearProducto_ConPrecioNegativo_DeberiaLanzarExcepcion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Producto("Teclado", -50);
        });

        assertEquals("Precio inválido", exception.getMessage());
    }

}
