
package com.mycompany.UT4_PD1_PD2;

public interface IArbolBB<T> {

    /**
     * Inserta un elemento en el arbol. En caso de ya existir un elemento con la
     * clave indicada en "unElemento", retorna falso.
     *
     * @param unElemento Elemento a insertar
     * @return Exito de la operacián
     */

    public boolean insertar(TElementoAB<T> unElemento);

     /**
     * Busca un elemento dentro del árbol.
     *
     *
     * @param unaEtiqueta Etiqueta identificadora del elemento a buscar.
     * .
     * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
     */
    public TElementoAB<T> buscar(Comparable unaEtiqueta);

    /**
     * Imprime en PreOrden los elementos del árbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    public String preOrden();

    /**
     * Imprime en InOrden los elementos del árbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    public String inOrden();

    /**
     * Imprime en PostOrden los elementos del árbol, separados por guiones.
     *
     * @return String conteniendo el preorden separado por guiones.
     */
    public String postOrden();

   
       /**
     * Elimina un elemento dada una etiqueta.
     * @param unaEtiqueta 
     */
    public void eliminar(Comparable unaEtiqueta);
    
    /**
     * calcula la altura del arbol
     * @return int representa la altura del arbol
     */
    public int altura();
    
    /**
     * calcula la cantidad de nodos del arbol
     * @return int representa la cantidad de nodos 
     */
    public int tamaño();
    
    /**
     * cuenta la cantidad de hojas del arbol
     * @return int representa la cantidad de hojas del arbol
     */
    public int contarHojas();
    
    /**
     * Cuenta la cantidad de nodos internos del arbol 
     * @return int representa la cantidad de nodos internos
     */
    
    public int contarNodosInternos();
    
    /**
     * cuenta los nodos que tienen hijo izq e hijo der
     * @return int representa la cantidad de nodos completos
     */

    public int contarNodosCompletos();
    
    /**
     * retorna el nivel del arbol donde esta el nodo que contiene sa etiqueta
     * @param etiqueta
     * @return int representa nivel donde se encuentra la etiqueta buscada
     */
    
    public int nivelNodo(Comparable etiqueta);
    
    /**
     * cuenta todos los nodos en un nivel dado por parametro
     * @param nivel 
     * @return int representa la cantidad de nodos en un nivel
     */
    
    public int cantNodosNivel(int nivel);
    
    /**
     * retorna el nodo con menor clave del arbol
     * @return TElementoAB<T>
     */
    
    public TElementoAB<T> menorClave();
    
    /**
     * retorna el nodo con mayor clave del arbol
     * @return IElementoAB<T>
     */
    
    public IElementoAB<T> mayorClave();
    
    /**
     * retorna un listado de la cantidad de hojas en una TLista
     * @return ILista<T>
     */
    
    public ILista<T> listaHojas();
    
    /**
     * retorna true si el arbol contiene los elementos ordenados, izq < der.
     * @return boolean representa si es ABB o no
     */
    
    public boolean esABB();
	
}

