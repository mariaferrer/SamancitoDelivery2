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

public class listaRest {
    private nodoRest inicio;
    private nodoRest ultimo;
    private int size;

    public listaRest() {
        this.inicio = null;
        this.ultimo = null;
        this.size = 0;
    }

    public nodoRest getInicio() {
        return inicio;
    }

    public void setInicio(nodoRest inicio) {
        this.inicio = inicio;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean itsEmpty(){
        return inicio == null;
    }
    
    public void agregar(nodoRest nodo){
        if(this.itsEmpty()){
            inicio = ultimo = nodo;
            size++;
        }
        else{
            nodoRest tempo = this.ultimo;
            tempo.setSiguiente(nodo);
            ultimo = nodo;
        }
        size ++;
    }
    
    public void addPlato(String nombre, Object direccion){
        nodoRest nodo = new nodoRest(nombre, direccion);
        this.agregar(nodo);
    }
}
