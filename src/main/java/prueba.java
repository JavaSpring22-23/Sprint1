public class prueba {
    public static void main(String[] args) {
        Empresa misiontic = new Empresa("MisionTIC", "Medellín", 2797187, 3421234);
        Empleado Juan = new Empleado("Juan", "juan@gmail.com", misiontic.getNombre(), "Administrador");
        MovimientoDinero transaccion = new MovimientoDinero(10000, "Entrada", "Usuario666");

        System.out.println(transaccion);
        transaccion.setMontoMovimiento(4000);
        System.out.println(transaccion);
    }
}
