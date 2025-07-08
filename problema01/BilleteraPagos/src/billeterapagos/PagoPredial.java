
package billeterapagos;
public class PagoPredial extends Pago {
    private double valorInmueble;
    private double tasa;

    public PagoPredial(double valor, double tasa){
        valorInmueble = valor;
        this.tasa = tasa;
    }

    @Override
    public void calcularValorPagado(){
        valorPagado = valorInmueble * tasa;
    }

    @Override
    public String obtenerDescripcion(){
        return "Pago Predial por inmueble";
    }
}
