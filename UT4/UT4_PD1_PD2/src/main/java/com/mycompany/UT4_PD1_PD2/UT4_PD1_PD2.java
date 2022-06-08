
package com.mycompany.UT4_PD1_PD2;
import java.lang.Integer;
/**
 *
 * @author facum
 */
public class UT4_PD1_PD2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        IArbolBB arbolBB_0 = new TArbolBB<>();
        
        TElementoAB<Integer> elemento_0 = new TElementoAB<>(1,1);
        TElementoAB<String> elemento_1 = new TElementoAB<>(0,"dato1");
        TElementoAB<String> elemento_2 = new TElementoAB<>(2,"dato2");
        
        System.out.println("Insercion es "+arbolBB_0.insertar(elemento_0));
        System.out.println("Insercion es "+arbolBB_0.insertar(elemento_1));
        System.out.println("Insercion es "+arbolBB_0.insertar(elemento_2));
        
        System.out.println("La altura del arbol es: "+ arbolBB_0.altura()+"\n");
        
        System.out.println("Cantidad de Nodos del Arbol: "+arbolBB_0.tamaño()+"\n");
        
        System.out.println("Cantidad de Hojas del Arbol: "+arbolBB_0.contarHojas()+"\n");
        
        System.out.println("Cantidad de Nodos Internos del Arbol: "+arbolBB_0.contarNodosInternos()+"\n");
        
        System.out.println("Cantidad de Nodos Completos del Arbol: "+arbolBB_0.contarNodosCompletos()+"\n");

        System.out.println("el Nivel del Nodo buscado es: "+arbolBB_0.nivelNodo(elemento_2.getEtiqueta())+"\n");
        
        System.out.println("La cantidad de Nodos en ese Nivel es: "+arbolBB_0.cantNodosNivel(3)+"\n");
        
        System.out.println("El nodo con menor clave es: "+arbolBB_0.menorClave().getEtiqueta()+"\n");
        
        System.out.println("El nodo con mayor clave es: "+arbolBB_0.mayorClave().getEtiqueta()+"\n");
        
        ILista listaHojas = arbolBB_0.listaHojas();
        
        INodo nodoBuscado = listaHojas.buscar(2);
        
        if (nodoBuscado != null){
            System.out.println("NODO BUSCADO EN LA LISTA DE HOJAS DEL DEL ARNBOL :");
            nodoBuscado.imprimir();
        }
        
        INodo nodoBuscado_ = listaHojas.buscar(0);
        
        if (nodoBuscado_ != null){
            System.out.println("NODO BUSCADO EN LA LISTA DE HOJAS DEL DEL ARNBOL :");
            nodoBuscado_.imprimir();
        }
        
        System.out.println(arbolBB_0.esABB());


    }
    
}
