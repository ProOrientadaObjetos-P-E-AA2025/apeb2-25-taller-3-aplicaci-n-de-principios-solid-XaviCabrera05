package billeterapagos;

public class PagoAguaPotable extends Pago {

    private double tarifaBase;
    private double metrosConsumidos;
    private double costoMetro;
    private String tipo;

    public PagoAguaPotable(double tarifaBase, double metros, double costo, String tipo) {
        this.tarifaBase = tarifaBase;
        this.metrosConsumidos = metros;
        this.costoMetro = costo;
        this.tipo = tipo;
    }

    @Override
    public void calcularValorPagado() {
        valorPagado = tarifaBase + (metrosConsumidos * costoMetro);
    }

    @Override
    public String obtenerDescripcion() {
        return "Pago Agua - Tipo: " + tipo;
    }
}
