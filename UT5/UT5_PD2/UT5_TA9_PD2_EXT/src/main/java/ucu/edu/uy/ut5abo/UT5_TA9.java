
/*
 * NO LICENCE 
 * Author: Ing. Nicolás Navarro Gutérrez
 */
package ucu.edu.uy.ut5abo;

import java.util.ArrayList;
import java.util.Collections;
import ucu.edu.uy.tda.IArbolBB;
import ucu.edu.uy.tda.INodo;
import ucu.edu.uy.tda.Lista;
import ucu.edu.uy.tda.TArbolBB;
import ucu.edu.uy.tda.*;
import ucu.edu.uy.util.CalculadorMatricesOptimo;
import ucu.edu.uy.util.ManejadorArchivosGenerico;

/**
 *
 * @author nnavarro
 */
public class UT5_TA9{

    public static void main(String[] args)
    {
        //ARMADO DE ARBOL CON LAS PALABRAS CLAVES
        TArbolBB arbolPalabrasClave = new TArbolBB();        
        String[] palabrasClave = ManejadorArchivosGenerico.leerArchivo("palabras.txt");
        for (String palabra : palabrasClave){
            //System.out.println(palabra.split(" ")[0]);
            IElementoAB elementoPalabraClave = new TElementoAB(palabra.split(" ")[0],null);
            arbolPalabrasClave.insertar(elementoPalabraClave);
        }
        System.out.println(arbolPalabrasClave.inOrden().imprimir("\n"));
        System.out.println(arbolPalabrasClave.cantNodosNivel(3));
        //MODIFICANDO FRECUENCIAS DE LAS PALABRAS CLAVE CON EL TXT DE CODIGO
        String[] codigo = ManejadorArchivosGenerico.leerArchivo("codigo.txt");
        for (String linea : codigo) {
            if (!"".equals(linea)){
                String[] palabras = linea.split(" ");
                for (String palabra : palabras){
                    if (!"".equals(palabra)){
                        //System.out.println("PALABRA DEL CODIGO : "+palabra);
                        arbolPalabrasClave.cuentaFrec(palabra.trim()); //MODIFICA LOS PARAMETROS FRECUENCIA DEL ELEMENTO
                    }
                }
            }
        }
        //IElementoAB elemento = arbolPalabrasClave.buscar("abstract");
        //System.out.println("ETIQUETA : "+elemento.getEtiqueta().toString()+"PARAMETRO FREC_EX : "+elemento.getFrecExito());
        
        //50 ELEMENOTOS EN ESTE ARBOL, LOS ARRAYS SERAN DE TAMAÑO DEL ARBOL + 1
        Comparable[] claves = new Comparable[arbolPalabrasClave.tamanio()+1]; 
        int[] frecExito = new int[arbolPalabrasClave.tamanio()+1];
        frecExito[0] = -1;
        int[] frecNoExito = new int[arbolPalabrasClave.tamanio()+1];
        frecNoExito[0] = 1;
        //VECTOR SE LLENARA CON LAS FRECUENCIAS DE LOS ELEMENTOS
        arbolPalabrasClave.completaVectores(claves, frecExito, frecNoExito);
        
               
        for (int frecuencia : frecExito){
            //System.out.println("\nFRECUENCIA EXITO : "+frecuencia);
        }
        for (int frecuencia : frecNoExito){
            //System.out.println("\nFRECUENCIA DE NO EXITO : "+frecuencia);
        }
        
        IArbolBB arbolOptimo = new TArbolBB();
        int cantPalabrasClave = arbolPalabrasClave.tamanio();
        CalculadorMatricesOptimo calMatOpt_1 = new CalculadorMatricesOptimo(cantPalabrasClave);
        calMatOpt_1.encontrarOptimo(cantPalabrasClave, frecExito, frecNoExito);
        calMatOpt_1.armarArbolBinario(0,cantPalabrasClave, claves, arbolOptimo);
        System.out.println(arbolOptimo.inOrden().imprimir("\n"));
        arbolOptimo.calcularCosto(frecExito, frecNoExito);
        
        
        
        
        
        /*
        int cantElem = palabras.length;
        String[] claves = new String[cantElem+1];
        
        for (int clave = 0; clave<=cantElem; clave++){
            claves[clave] = Integer.toString(clave);
        }
        
        int[] frecExito = new int[cantElem+1];
        int[] frecNoExito = new int[cantElem+1];

        int index = 1;
        for (String palabra : palabras){
                frecExito[index] = Integer.parseInt(palabra.split(" ")[1]);
                index++;
        }
        
        index = 0;
        for (String noPalabra : noPalabras){
                frecNoExito[index] = Integer.parseInt(noPalabra);
                index++;
        }
                
        
       
        int cantElem = 4;
        
        int[] frecExito = new int[5]; //Vector frecuencias de Exito.
        frecExito[1]=5;
        frecExito[2]=3;
        frecExito[3]=4;
        frecExito[4]=2;

        int[] frecNoExito = new int[5]; //Vector frecuencias de NO Exito.
        frecNoExito[0]=1;
        frecNoExito[1]=3;
        frecNoExito[2]=1;
        frecNoExito[3]=3;
        frecNoExito[4]=7;
       
        
        //UT5_TA15
        //Shuffle de claves
        ArrayList arrayClaves = new ArrayList();
        for (String clave : claves) {
            arrayClaves.add(clave); 
        }
        Collections.shuffle(arrayClaves);
        
        //Insertar en Arbol BB
        
        for (String linea : palabras) {
            String[] auxLinea = linea.split(",");
            IElementoAB elemento = new TElementoAB(auxLinea[0], auxLinea[0]);
            arbol.insertar(elemento);
        }
        
        System.out.println("Longitud de Trayectoria Interna ABB NO OPTIMO:");
        arbol.calcularCosto(frecExito, frecNoExito);
        arbol.listaDatosNivelMasProfundo();
        System.out.println(arbol.Lti());
        //armar arbol optimo
        TArbolBB arbolOptimo = new TArbolBB();
        
        CalculadorMatricesOptimo calMatOpt_1 = new CalculadorMatricesOptimo(cantElem);
        calMatOpt_1.encontrarOptimo(cantElem, frecExito, frecNoExito);
        calMatOpt_1.armarArbolBinario(0,cantElem, claves, arbolOptimo);
        
        //COSTO ABB OPTIMO
        System.out.println("COSTO ABB OPTIMO: "+arbolOptimo.calcularCosto(frecExito, frecNoExito));
        //COSTO ABB NO OPTIMO
        System.out.println("COSTO ABB NO OPTIMO: "+arbol.calcularCosto(frecExito, frecNoExito));
        
        //Probar listaDatosNivelMasProfundo
        System.out.println("Lista de Datos Nivel mas Profundo ABB OPTIMO:");
        arbolOptimo.listaDatosNivelMasProfundo().imprimir();
        System.out.println("-------------");

        System.out.println("Lista de Datos Nivel mas Profundo ABB NO OPTIMO:");
        arbol.listaDatosNivelMasProfundo().imprimir();
        System.out.println("-------------");
        
        //Probar Lti
        System.out.println("Longitud de Trayectoria Interna ABB NO OPTIMO:");
        System.out.println(arbol.Lti());
        System.out.println("-------------");
        
        System.out.println("Longitud de Trayectoria Interna ABB OPTIMO:");
        System.out.println(arbolOptimo.Lti());
        System.out.println("-------------");
         */
    }
}
