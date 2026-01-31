package pagos.model;

import pagos.utils.Validar;

public class Producto {

    private String nombre;
    private int precio;

    public Producto(String nombre, int precio) {
        Validar.validarMonto(precio);
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
}
