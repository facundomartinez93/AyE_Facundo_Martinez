package ucu.edu.uy.util;

import ucu.edu.uy.tda.IArbolBB;
import ucu.edu.uy.tda.IElementoAB;
import ucu.edu.uy.tda.TElementoAB;

/**
 *
 * @author Ernesto
 */
public class CalculadorMatricesOptimo implements ICalculadorMatricesOptimo{

    public final int[][] W;
    public final int[][] P;
    public final int[][] R;

    public CalculadorMatricesOptimo(int cantElem)
    {
        W = new int[cantElem + 1][cantElem + 1];
        P = new int[cantElem + 1][cantElem + 1];
        R = new int[cantElem + 1][cantElem + 1];
    }

    @Override
    public void encontrarOptimo(int cantElem, int[] frecExito, int[] frecNoExito)
    {
        //int i, j, k, kraiz, h;
        //int min, PesoSubArboles;
        int i;
        int j;
        int h;
        int min = Integer.MAX_VALUE; //Máximo calor posible para un entero
        int kraiz = 0;
          
        // wii = bii y pii = wii
        
        for(i=0;i<=cantElem;i++){  // Completamos diagonales de Matriz W y Matriz P.
            W[i][i] = frecNoExito[i];
            P[i][i] = frecNoExito[i];
        }
        System.out.println("Se completa la diagon de W y P.");
        imprimirMatriz(W);
        imprimirMatriz(P);
        System.out.println("--------------------------------\n");
        
        
        // wij = wii+ aj + bj

        for(i=0;i <= cantElem;i++){ // Completa la Matriz W
            for(j=i+1;j<=cantElem;j++){
                W[i][j] = W[i][j-1] + frecExito[j] + frecNoExito[j];
            }
        }
        System.out.println("Se completa MATRIZ W.");
        imprimirMatriz(W);
        System.out.println("--------------------------------\n");
        
        // h = 1 pij = wij + pii + pjj
        for(i=0;i < cantElem;i++){ // Completa la segunda diagonal de P
            P[i][i+1] = W[i][i+1] + P[i][i] + P[i+1][i+1];
            kraiz += 1;
            R[i][i+1] = kraiz;
            }
        System.out.println("Se completa la segunda diagonal de MATRIZ P.");
        imprimirMatriz(P);
        System.out.println("--------------------------------\n");
        
        //Para h >= 2 hasta h = n
        for(h = 2; h <= cantElem; h++) {
            System.out.println("--------------------------------");
            System.out.println("1ER FOR --> h: 2 HASTA 4");
            System.out.println("h "+h);
            System.out.println("--------------------------------\n");
            kraiz = 0;
            j = h;
            for (i = 0; i <= cantElem - h; i++) {
                
                System.out.println("--------------------------------");
                System.out.println("2DO FOR --> i: 0 HASTA 4-h, h="+h);
                System.out.println("i "+i);
                System.out.println("--------------------------------\n");
                for (int k = i+1; k <= j; k++) {
                    System.out.println("--------------------------------");
                    System.out.println("3ER FOR --> k: i+1, i="+i+" HASTA k=j, j="+j);
                    System.out.println("i "+i);
                    System.out.println("j "+j);
                    System.out.println("k "+k);
                    System.out.println("P[i][k-1] "+P[i][k-1]+"  P[k][j] "+P[k][j]);
                    System.out.println("--------------------------------\n");
                    
                    int peso = P[i][k-1] + P[k][j];
                    if (peso <= min) {
                        min = peso;
                        kraiz = k;
                    }
                    
                }
                System.out.println("--------------------------------");
                System.out.println("EL MINIMO ES: "+min);
                System.out.println("MATRIZ P: ("+i+","+j+")");
                System.out.println("W[i][j] + min: "+W[i][j]+"+"+min);
                System.out.println("--------------------------------\n");
                
                P[i][j] = min + W[i][j];
                R[i][j] = kraiz;
                min = Integer.MAX_VALUE;
                j++;
                kraiz = 0;
                          
            }
            
        }
        
        System.out.println("Se completa la MATRIZ P y R.");
        imprimirMatriz(P);
        imprimirMatriz(R);
        System.out.println("--------------------------------\n");
              
        /**
     *
     * @param i - 
     * @param j
     * @param Claves
     * @param elArbolBB
     */
        
    }
    
    
    @Override
    public void armarArbolBinario(int i, int j, Comparable[] elementos, IArbolBB elArbolBB ) {
        int unaraiz;
        if (i < j) {
            unaraiz = R[i][j];
            elArbolBB.insertar(new TElementoAB (elementos[unaraiz],null));
            armarArbolBinario(i, unaraiz-1, elementos, elArbolBB);
            armarArbolBinario(unaraiz, j, elementos, elArbolBB);
        }
    }
    
    public static void imprimirMatriz(int[][] matriz)
    {
        System.out.println();

        for (int[] matriz1 : matriz)
        {
            for (int j = 0; j < matriz.length; j++)
            {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();
        }
    }

    public void printR()
    {
        imprimirMatriz(R);
    }

    public void printW()
    {
        imprimirMatriz(W);
    }

    public void printP()
    {
        imprimirMatriz(P);
    } 

}
