package billeterapagos;

public abstract class Pago {

    protected double valorPagado;

    public abstract void calcularValorPagado();

    public double obtenerValorPagado() {
        return valorPagado;
    }

    public abstract String obtenerDescripcion();
}
