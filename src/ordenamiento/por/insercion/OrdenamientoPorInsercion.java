/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento.por.insercion;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author osvaldo_trejo
 */
public class OrdenamientoPorInsercion {

    /**
     * @param args t//Metodo por insercion
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int arreglo[],pos,aux=0;
       int nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de elementos: "));
       arreglo = new int[nElementos];
       
        System.out.println("Ingrese los elementos a ordenar");
        
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i+1)+". Ingrese un numero: ");
            arreglo[i]= entrada.nextInt();
        }
       
        //metodo por inserción
        
        for (int i = 0; i < nElementos; i++) {
            pos = i;
            aux =arreglo[i];
            while((pos>0) && arreglo[pos-1]>aux){
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
        }
       
        System.out.println("\nOrdenamiento ascendente");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i]+" - ");
        }
      
        System.out.println("\nOrdenamiento descendetemente");
        for (int i = (nElementos-1); i >= 0; i--) {
            System.out.print(arreglo[i]+" - ");
        }
    }
    
}
