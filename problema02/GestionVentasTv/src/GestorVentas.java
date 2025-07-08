
import java.util.ArrayList;

public class GestorVentas {

    private ArrayList<VentaTV> ventas;

    public GestorVentas() {
        ventas = new ArrayList<>();
    }

    public void agregarVenta(VentaTV venta) {
        ventas.add(venta);
    }

    public double obtenerTotalVentas() {
        double total = 0;
        for (VentaTV v : ventas) {
            total += v.calcularTotal();
        }
        return total;
    }

    public ArrayList<VentaTV> getVentas() {
        return ventas;
    }
}
