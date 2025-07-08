
public class PrincipalVentas {

    public static void main(String[] args) {
        ProductoTV tv1 = new ProductoTV("Samsung 55\"", 499.99);
        ProductoTV tv2 = new ProductoTV("LG 65\"", 649.50);

        VentaTV venta1 = new VentaTV(tv1, 2);
        VentaTV venta2 = new VentaTV(tv2, 1);

        GestorVentas gestor = new GestorVentas();
        gestor.agregarVenta(venta1);
        gestor.agregarVenta(venta2);

        ReporteVentas rep = new ReporteVentas();
        rep.imprimir(gestor);
    }
}
