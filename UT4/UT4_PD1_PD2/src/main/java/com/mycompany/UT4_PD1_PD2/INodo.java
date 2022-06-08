/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.UT4_PD1_PD2;

/**
 *
 * @author facum
 * @param <T>
 */
public interface INodo<T> {
    
    
    /**
     * devuelve el dato del nodo
     * @return 
     */
    public T getDato();
    
    /**
     * devuelve el siguiente del nodo
     * @return 
     */
    public INodo<T> getSiguiente();
    
    
    /**
     * "engancha" otro nodo a continuacion
     * 
     */
    public void setSiguiente(INodo<T> nodo);
    
    /**
     * Imprime los datos del nodo
     */
    
       
    public void imprimir();

    /**
     * Retorna la etiqueta del nodo
     *
     * @return etiqueta del nodo
     */
    public Comparable getEtiqueta();
//	/**
//	 *
//	 * @param unNodo
//	 * @return devueve -1 si this tiene una clave menor, 0 si son iguales, 1 si es mayor
//	 */
//	public int compareTo(INodo<E> unNodo);

    /**
     *
     * @param etiqueta
     * @return devueve -1 si this tiene una etiqueta menor, 0 si son iguales, 1
     * si es mayor
     */
    public int compareTo(Comparable etiqueta);
    
    public TNodo<T> clonar();
}

