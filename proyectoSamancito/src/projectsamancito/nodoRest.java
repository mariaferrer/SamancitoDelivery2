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
public class nodoRest {
    private String nombre;
    private Object direccion;
    private nodoRest siguiente;

    public nodoRest(String nombre, Object direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Object getDireccion() {
        return direccion;
    }

    public void setDireccion(Object direccion) {
        this.direccion = direccion;
    }

    public nodoRest getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodoRest siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
