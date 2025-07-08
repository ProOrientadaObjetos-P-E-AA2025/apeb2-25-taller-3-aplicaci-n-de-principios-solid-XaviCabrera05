
package billeterapagos;

public class PagoTelefonoConvencional extends Pago {

    private double costoMinuto;
    private int minutos;

    public PagoTelefonoConvencional(double costo, int minutos) {
        costoMinuto = costo;
        this.minutos = minutos;
    }

    @Override
    public void calcularValorPagado() {
        valorPagado = costoMinuto * minutos;
    }

    @Override
    public String obtenerDescripcion() {
        return "Pago Telefono Convencional";
    }
}
