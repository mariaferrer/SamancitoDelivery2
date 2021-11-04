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
public class listaClientes {
    private nodoClientes inicio;
    private nodoClientes ultimo;
    private int size;
    
    public void lista(){
        inicio = null;
        ultimo = null;
        size = 0;
    }

    public nodoClientes getInicio() {
        return inicio;
    }

    public void setInicio(nodoClientes inicio) {
        this.inicio = inicio;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public nodoClientes getUltimo() {
        return ultimo;
    }

    public void setUltimo(nodoClientes ultimo) {
        this.ultimo = ultimo;
    }
    
    
    public boolean itsEmpty(){
        return inicio == null;
    }
    
    public void agregar(nodoClientes nodo){
        if(this.itsEmpty()){
            inicio = ultimo = nodo;
            size++;
        }
        else{
            nodoClientes tempo = this.ultimo;
            tempo.setSiguiente(nodo);
            ultimo = nodo;
        }
        size ++;
    }
    
    public void addCliente(String nombre, String apellido, int cedula, Object direccion){
        nodoClientes nodo = new nodoClientes(nombre, apellido, cedula, direccion);
        this.agregar(nodo);
    }
}
