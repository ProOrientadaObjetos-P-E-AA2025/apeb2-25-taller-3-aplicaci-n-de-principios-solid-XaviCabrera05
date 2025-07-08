/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package billeterapagos;
import java.util.ArrayList;

public class BilleteraPagos {
    private ArrayList<Pago> listaPagos;

    public BilleteraPagos(){
        listaPagos = new ArrayList<>();
    }

    public void agregarPago(Pago pago){
        pago.calcularValorPagado();
        listaPagos.add(pago);
    }

    public void generarReporte(){
        double total = 0;
        for(Pago p : listaPagos){
            System.out.println(p.obtenerDescripcion() + ": " + p.obtenerValorPagado());
            total += p.obtenerValorPagado();
        }
        System.out.println("TOTAL A PAGAR: " + total);
    }
}
