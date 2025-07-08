/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Javier
 */

public class VentaTV {
    private ProductoTV producto;
    private int cantidad;

    public VentaTV(ProductoTV producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularTotal(){
        return producto.getPrecio() * cantidad;
    }

    public String descripcionVenta(){
        return cantidad + " x " + producto.getModelo();
    }
}
