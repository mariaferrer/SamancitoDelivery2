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
public class listaComida {
    private NodoComida inicio;
    private NodoComida ultimo;
    private int size;
    
    public void lista(){
        inicio = null;
        ultimo = null;
        size = 0;
    }

    public NodoComida getInicio() {
        return inicio;
    }

    public void setInicio(NodoComida inicio) {
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
    
    public void agregar(NodoComida nodo){
        if(this.itsEmpty()){
            inicio = ultimo = nodo;
            size++;
        }
        else{
            NodoComida tempo = this.ultimo;
            tempo.setSiguiente(nodo);
            ultimo = nodo;
        }
        size ++;
    }
    
    public void addPlato(String nombre, int precio, String restaurante){
        NodoComida nodo = new NodoComida(nombre, precio, restaurante);
        this.agregar(nodo);
    }
    
    public void eliminarNombre(String nombre){
        if(nombre.equals(this.inicio.getNombre())){
            this.inicio = this.inicio.getSiguiente();
        }
        else if(nombre.equals(this.ultimo.getNombre())){
            this.ultimo =null;
        }
        else{
            int contador =0;
            NodoComida nodoTmp = this.inicio;
            while(contador < size-1 && nodoTmp.getSiguiente() !=null){
                if(nombre.equals(nodoTmp.getSiguiente().getNombre())){
                    nodoTmp.setSiguiente(nodoTmp.getSiguiente().getSiguiente());
                }
                nodoTmp = nodoTmp.getSiguiente(); 
            }
        }
        size--;
    }
}
