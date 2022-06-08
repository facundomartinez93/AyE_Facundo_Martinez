/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.UT4_PD1_PD2;
/**
 *
 * @author anavalin
 * @param <T>
 */
public class TLista<T> implements ILista<T> {
    INodo<T> primero;
    
   public TLista(){
        this.primero = null;
    }
    
    @Override
    public boolean esVacia(){
        return primero == null;
    }
    
    @Override
    public void insertarDelante(Comparable etiqueta,T dato){
        
        INodo<T> nuevoNodo = new TNodo<>(etiqueta, dato);
        if (primero != null){
            nuevoNodo.setSiguiente(primero);
            
        }
        primero = (TNodo<T>)nuevoNodo;
        
    }
    @Override
    public void insertarFinal(Comparable etiqueta, T dato){
        INodo<T> nodo = new TNodo<>(etiqueta, dato);
        
        if(esVacia()){
            System.out.println("La LISTA esta VACÍA se inserta en PRIMERO");
            primero = nodo;
        }
        else{
            INodo<T> actual = primero;
            while(actual.getSiguiente() != null){
                System.out.println("Debe RECORRER la LISTA para insertar al final");
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nodo);
            System.out.println("EL SIGUIENTE DE ACTUAL ES NODO");
            
        }
    }
    
    @Override
    public INodo<T> buscar(Comparable etiqueta){
        if(esVacia()){
            return null;
        }
        else{
            INodo<T> actual = primero;
            while(actual != null){
                if(actual.getEtiqueta() == etiqueta){
                    return actual;
                }
                actual = actual.getSiguiente();
            }
            return actual;
        }
    }
    
    @Override
    public void insertarOrdenado(Comparable etiqueta, T dato){
        INodo<T> nodo = new TNodo<>(etiqueta, dato);
        
        if(esVacia()){
            primero = (TNodo<T>)nodo;
        }else{
             INodo<T> actual = primero;
             if((int) nodo.getEtiqueta() < (int) actual.getEtiqueta()){
                 actual = actual.getSiguiente();
                 this.primero = (TNodo<T>)nodo;
             }
             while(actual != null){
                 if ((int) nodo.getEtiqueta() < (int) actual.getEtiqueta()) {
                     actual = nodo.getSiguiente();
                 }
                 actual = actual.getSiguiente();
             }
             nodo = actual.getSiguiente();
        }
        
    }
    
    @Override
   public INodo<T>getPrimero(){
       return this.primero;
   }
    
    
}
