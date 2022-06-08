
package com.mycompany.UT4_PD1_PD2;

public interface IElementoAB<T> {
    
    /**
     * Obtiene el valor de la etiqueta del nodo.
     *
     * @return Etiqueta del nodo.
     */
    public Comparable getEtiqueta();

    /**
     * Obtiene el hijo izquierdo del nodo.
     *
     * @return Hijo Izquierdo del nodo.
     */
    public TElementoAB<T> getHijoIzq();

    /**
     * Obtiene el hijo derecho del nodo.
     *
     * @return Hijo derecho del nodo.
     */
    public TElementoAB<T> getHijoDer();

    /**
     * Asigna el hijo izquierdo del nodo.
     *
     * @return Elemento a ser asignado como hijo izquierdo.
     */
    public void setHijoIzq(TElementoAB<T> elemento);

    /**
     * Asigna el hijo derecho del nodo.
     *
     * @return Elemento a ser asignado como hijo derecho.
     */
    public void setHijoDer(TElementoAB<T> elemento);

    /**
     * Busca un elemento dentro del arbol con la etiqueta indicada.
     *
     * @param unaEtiqueta del nodo a buscar
     * @return Elemento encontrado. En caso de no encontrarlo, retorna nulo.
     */
    public TElementoAB<T> buscar(Comparable unaEtiqueta);

 

    /**
     * Inserta un elemento dentro del arbol.
     *
     * @param elemento Elemento a insertar.
     * @return Exito de la operaci�n.
     */
    public boolean insertar(TElementoAB<T> elemento);

    /**
     * Imprime en preorden el arbol separado por guiones.
     *
     * @return String conteniendo el PreOrden
     */
    public String preOrden();

    /**
     * Imprime en inorden el arbol separado por guiones.
     *
     * @return String conteniendo el InOrden
     */
    public String inOrden();

    /**
     * Imprime en postorden el arbol separado por guiones.
     *
     * @return String conteniendo el PostOrden
     */
    public String postOrden();

    /**
     * Retorna los datos contenidos en el elemento.
     *
     * @return
     */
    public T getDatos();
	
	 /**
     * Elimina un elemento dada una etiqueta.
     * @param unaEtiqueta
     * @return 
     */
    public TElementoAB<T> eliminar(Comparable unaEtiqueta);
    
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
     * retorna el nivel del arbol donde esta el nodo que contiene la etiqueta
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
    
    public ILista<T> listaHojas(ILista<T> lista);
    
    /**
     * retorna true si el arbol contiene los elementos ordenados, izq < der.
     * @return boolean representa si es ABB o no
     */
    
    public boolean esABB();
}
