
public class ReporteVentas {

    public void imprimir(GestorVentas gestor) {
        for (VentaTV v : gestor.getVentas()) {
            System.out.println(v.descripcionVenta() + " - Total: $" + v.calcularTotal());
        }
        System.out.println("Total Final: $" + gestor.obtenerTotalVentas());
    }
}
