/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Javier
 */
public class ProductoTV {

    private String modelo;
    private double precio;

    public ProductoTV(String modelo, double precio) {
        this.modelo = modelo;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }
}
