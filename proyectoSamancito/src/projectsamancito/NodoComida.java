/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsamancito;

/**
 *
 * @author mkferrerteran
 */
public class NodoComida {
    private String nombre;
    private int precio;
    private String restaurante; 
    private NodoComida siguiente;

    public NodoComida(String nombre, int precio, String restaurante) {
        this.nombre = nombre;
        this.precio = precio;
        this.restaurante = restaurante;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public NodoComida getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoComida siguiente) {
        this.siguiente = siguiente;
    }

    
}
