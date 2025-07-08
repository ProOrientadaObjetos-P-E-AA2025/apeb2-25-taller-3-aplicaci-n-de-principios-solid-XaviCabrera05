
package billeterapagos;

public class PagoLuzElectrica extends Pago {
    private double tarifaBase;
    private double kwhConsumidos;
    private double costoKwh;
    private String tipo;

    public PagoLuzElectrica(double base, double kwh, double costo, String tipo){
        tarifaBase = base;
        kwhConsumidos = kwh;
        costoKwh = costo;
        this.tipo = tipo;
    }

    @Override
    public void calcularValorPagado(){
        valorPagado = tarifaBase + (kwhConsumidos * costoKwh);
    }

    @Override
    public String obtenerDescripcion(){
        return "Pago Luz - Tipo: " + tipo;
    }
}
