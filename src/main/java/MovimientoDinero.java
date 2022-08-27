public class MovimientoDinero {
    private int montoMovimiento; // positivos y negativos
    private String conceptoMovimiento; // Entrada - Salida
    private Empleado encargado;

    public MovimientoDinero(int montoMovimiento, String conceptoMovimiento, String encargado) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.encargado = encargado;
    }

    public int getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(int montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(Empleado encargado) {
        this.encargado = encargado;
    }

    @Override
    public String toString() {
        return "Movimiento: " + this.montoMovimiento + " Concepto del movimiento: " + this.conceptoMovimiento + " Encargado: " + this.encargado;
    }
}


//if (this.montoMovimiento < 0) {
//            this.conceptoMovimiento = "Salida";
//        } else if(this.montoMovimiento > 0){
//            this.conceptoMovimiento = "Entrada";
//        }
