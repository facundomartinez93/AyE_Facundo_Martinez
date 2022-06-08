/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.UT4_PD1_PD2;

/**
 *
 * @author facum
 */
public interface ILista<T> {
    
    /**
     * retorna true si la lista esta vacia y false si no
     * @return boolean 
     */
    public boolean esVacia();
    
    /**
     * retorna el primero elemento de la lista
     * @return TElementoAB<T>
     */
    
    public INodo<T> getPrimero();
    
    /**
     * Inserta un nodo delante de la lista
     * @param etiqueta 
     * @param dato 
     */
    
    public void insertarDelante(Comparable etiqueta, T dato);
    
    /**
     * Inserta un nodo al final de la lista
     * @param etiqueta
     * @param dato 
     */
    
    public void insertarFinal(Comparable etiqueta, T dato);
    
    /**
     * inserta un nodo en la lista ordenada por etiqueta de menor a mayor
     * @param etiqueta
     * @param dato 
     */
    
    public void insertarOrdenado(Comparable etiqueta, T dato);
    
    /**
     * busca un nodo en la lista por la etiqueta
     * @param etiqueta
     * @return 
     */
    
    public INodo<T> buscar(Comparable etiqueta);
    
  
    
}
