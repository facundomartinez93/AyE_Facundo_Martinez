
package com.mycompany.UT4_PD1_PD2;
/**
 *
 * @author facum
 * @param <T>
 */
public class TElementoAB<T> implements IElementoAB<T> {
    private TElementoAB<T> izq;
    private TElementoAB<T> der;
    private final Comparable etiqueta;
    private final T dato;
    
    /**
     *
     * @param <T>
     * @param etiqueta
     */
    TElementoAB(Comparable Unaetiqueta, T dato){
        this.etiqueta = Unaetiqueta;
        this.dato = dato;
    }
    
    @Override
    public Comparable getEtiqueta() {
        return etiqueta;
    }

    @Override
    public TElementoAB<T> getHijoIzq() {
        return izq;
    }

    @Override
    public TElementoAB<T> getHijoDer() {
        return der;
    }

    @Override
    public void setHijoIzq(TElementoAB<T> elemento) {
        izq = elemento;
    }

    @Override
    public void setHijoDer(TElementoAB<T> elemento) {
        der = elemento;
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean insertar(TElementoAB<T> elemento) {
        if (elemento.etiqueta.compareTo(etiqueta) < 0){
            if (izq==null){
                izq = elemento;
                return true;
            }
            izq.insertar(elemento);
            return true;
        }
        if (elemento.etiqueta.compareTo(etiqueta) > 0){
            if(der==null){
                der = elemento;
                return true;
            }
            der.insertar(elemento);
            return true;
        }
        return false;
        
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
    public T getDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TElementoAB eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int altura() {
        int alturaIzq = 0;
        int alturaDer = 0;
        
        if (izq!=null){
            alturaIzq = izq.altura();
        }
        if (der!=null){
            alturaDer = der.altura();
        }
        return Math.max(alturaIzq, alturaDer) + 1;
    }

    @Override
    public int tamaño() {
        int cantidadIzq = 0;
        int cantidadDer = 0;
        
        if (izq!=null){
            cantidadIzq = izq.tamaño();
        }
        if (der!=null){
            cantidadDer = der.tamaño();
        }
        return cantidadIzq + cantidadDer + 1;
    }

    @Override
    public int contarHojas() {
        int cantidadHojasDer = 0;
        int cantidadHojasIzq = 0;
        
        if (izq==null && der==null){
            return 1;
        }
        if (izq!=null){
            cantidadHojasIzq = izq.contarHojas();
        }
        if (der!=null){
            cantidadHojasDer = der.contarHojas();
        }
        return cantidadHojasIzq + cantidadHojasDer;
        
    }

    @Override
    public int contarNodosInternos() {
        int cantidadInternosDer = 0;
        int cantidadInternosIzq = 0;
        
        if (izq!=null){
            cantidadInternosIzq = izq.contarNodosInternos();
        }
        if (der!=null){
            cantidadInternosDer = der.contarNodosInternos();
        }
        if ((izq!=null && der==null) || (izq==null && der!=null)){
            return 1;
        }
        return cantidadInternosIzq + cantidadInternosDer;
        
    }

    @Override
    public int contarNodosCompletos() {
        int contidadCompletosIzq = 0;
        int cantidadCompletosDer = 0;
        
        if (izq!=null){
            contidadCompletosIzq = izq.contarNodosCompletos();
        }
        if (der!=null){
            cantidadCompletosDer = der.contarNodosCompletos();
        }
        if (izq!=null && der!=null){
            return 1;
        }
        return contidadCompletosIzq + cantidadCompletosDer; 
    }

    @Override
    public int nivelNodo(Comparable unaEtiqueta) {
        int nivel = 0;
        if (etiqueta.compareTo(unaEtiqueta) == 0){
            return 1;
        } else {
            if (etiqueta.compareTo(unaEtiqueta) > 0){
                if (izq!= null) {
                    nivel += 1 + izq.nivelNodo(unaEtiqueta);
                }
            } else if (etiqueta.compareTo(unaEtiqueta) < 0){
                if (der != null){
                    nivel += 1 + der.nivelNodo(unaEtiqueta);
                }
            }
        }
        if (nivel > 0) {
            return nivel;
        } else {
            return -1;
        }      
    }
    
    @Override
    public TElementoAB<T> menorClave() {
        if (izq!=null){
            return izq.menorClave();
        }
        return this;
    }

    @Override
    public IElementoAB<T> mayorClave() {
        if (der!=null){
            return der.mayorClave();
        }
        return this;
    }
    
    @Override
    public int cantNodosNivel(int nivel) {
        int cantNodosNivelIzq = 0;
        int cantNodosNivelDer = 0;
        
        if (nivel == 1){
            return 1;
        }
        if (izq != null){
            cantNodosNivelIzq = izq.cantNodosNivel(nivel-1);
        }
        if (der != null){
            cantNodosNivelDer = der.cantNodosNivel(nivel-1);
        }
        return cantNodosNivelIzq + cantNodosNivelDer;
    }
    
    @Override
    public ILista<T> listaHojas(ILista<T> lista) {
        
        if (izq==null && der==null){
            Integer nivel = this.nivelNodo(etiqueta);
            lista.insertarFinal(etiqueta, (T) nivel);
            return lista;
        }
        if (izq!=null){
            izq.listaHojas(lista);
        }
        if (der!=null){
            der.listaHojas(lista);
        }
        
        return lista;
        
    }

    @Override
    public boolean esABB() {
        boolean abbIzq = true;
        boolean abbDer = true;
                
        if (izq != null){
            if (izq.etiqueta.compareTo(etiqueta) < 0){
                izq.esABB();
            }else{
                abbIzq = false;
            }
              
        }
        if (der != null){
            if (der.etiqueta.compareTo(etiqueta) > 0){
                abbDer = der.esABB();
            }else{
                abbDer = false;
            }
        }
        return abbDer && abbDer;
    }
    
}
