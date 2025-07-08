package billeterapagos;

public class Principal {

    public static void main(String[] args) {
        BilleteraPagos billetera = new BilleteraPagos();

        billetera.agregarPago(new PagoAguaPotable(5.0, 10, 0.5, "Casa"));
        billetera.agregarPago(new PagoAguaPotable(8.0, 20, 0.75, "Comercio"));
        billetera.agregarPago(new PagoLuzElectrica(4.0, 100, 0.15, "Casa"));
        billetera.agregarPago(new PagoLuzElectrica(6.0, 250, 0.12, "Comercio"));
        billetera.agregarPago(new PagoPredial(30000, 0.002));
        billetera.agregarPago(new PagoPredial(45000, 0.0018));
        billetera.agregarPago(new PagoTelefonoConvencional(0.1, 80));
        billetera.agregarPago(new PagoTelefonoConvencional(0.12, 50));

        billetera.generarReporte();
    }
}
