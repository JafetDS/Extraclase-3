/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AndroidStudio ;

import static AndroidStudio.Sorted.bubbleSort;

/**
 *
 * @author User
 */
public class AndroidStudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista<Integer> lista=new Lista<>();
        lista.addFirst(0);
        lista.addFirst(1);
        lista.addFirst(2);
        lista.addFirst(3);
        lista.addFirst(7);
        lista.addFirst(4);
        lista.addFirst(5);
        lista.addFirst(6);
        lista.print();
        System.out.println();
        //Sorted.bubbleSort(lista);
        Sorted.insertionSort(lista);
        //Sorted.selectionSort(lista);
       
       
       lista.print();

    } 
 } 
        
        
        
    
    

