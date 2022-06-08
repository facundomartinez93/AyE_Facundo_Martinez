package com.mycompany.UT4_PD1_PD2;

public class TNodo<T> implements INodo<T> {
    Comparable etiqueta;
    INodo siguiente;
    T dato;
    
    
    public TNodo (Comparable etiqueta,T dato){
        this.etiqueta = etiqueta;
        this.dato = dato;
    }
    @Override
    public INodo getSiguiente(){
        return siguiente;
    }
    @Override
    public void setSiguiente(INodo nodo){
        siguiente = nodo;
    }
    @Override
    public Comparable getEtiqueta(){
        return etiqueta;
    }
    @Override
    public T getDato(){
        return dato;
    }

    @Override
    public void imprimir() {
        System.out.println(etiqueta);
    }

    @Override
    public int compareTo(Comparable etiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TNodo<T> clonar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
