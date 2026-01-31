package pagos.utils;

public class Validar {

    public static void validarMonto(int monto) {
        if(monto <= 0) {
            System.out.println("El monto debe ser mayor que cero.");
            throw new IllegalArgumentException("Monto inválido");
        }
        
    }

}
