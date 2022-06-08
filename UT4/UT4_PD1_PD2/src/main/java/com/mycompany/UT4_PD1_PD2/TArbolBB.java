
package com.mycompany.UT4_PD1_PD2;

/**
 *
 * @author facum
 * @param <T>
 */
public class TArbolBB<T> implements IArbolBB<T> {
    private IElementoAB<T> raiz;
    
    @Override
    public boolean insertar(TElementoAB<T> unElemento) {
        if (raiz==null){
            raiz = unElemento;
            return true;
        }
        return raiz.insertar(unElemento);
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String preOrden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String inOrden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String postOrden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int altura() {
        if (raiz!=null){
            return raiz.altura();
        }
        return 0;
        
    }

    @Override
    public int tamaño() {
        if(raiz==null){
            return 0;
        }
        return raiz.tamaño();
    }

    @Override
    public int contarHojas() {
        if (raiz==null){
            return 0;
        }
        return raiz.contarHojas();
    }

    @Override
    public int contarNodosInternos() {
        if (raiz == null){
            return 0;
        }
        return raiz.contarNodosInternos();
        
    }

    @Override
    public int contarNodosCompletos() {
        if (raiz==null){
            return 0;
        }
        return raiz.contarNodosCompletos();
    }

    @Override
    public int nivelNodo(Comparable unaEtiqueta) {
        if (raiz==null){
            return 0;
        }
        return raiz.nivelNodo(unaEtiqueta);
    }

    @Override
    public int cantNodosNivel(int nivel) {
        if (raiz==null || nivel == 0){
            System.out.println("Un arbol vacio tiene nivel 0 !! \n");
            return 0;
        }
        return raiz.cantNodosNivel(nivel);
    }

    @Override
    public TElementoAB<T> menorClave() {
        if (raiz==null){
            System.out.println("Arbol vacio! \n");
            return null;
        }
        return raiz.menorClave();
    }

    @Override
    public IElementoAB<T> mayorClave() {
         if (raiz==null){
            System.out.println("Arbol vacio! \n");
            return null;
        }
        return raiz.mayorClave();
    }
    
    @Override
    public ILista<T> listaHojas(){
     ILista<T> lista = new TLista<>();
     if (raiz==null){
         System.out.println("Arbol vacio! \n");
         return lista;
     }
     return raiz.listaHojas(lista);
    }
    
    @Override
    public boolean esABB(){
        if (raiz==null){
            System.out.println("Arbol vacío! \n");
            return false;
        }
        return raiz.esABB();
    }
    
}
