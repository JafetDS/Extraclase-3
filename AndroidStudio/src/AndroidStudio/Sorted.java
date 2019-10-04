/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AndroidStudio;

//import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author User
 */
public class Sorted {
 
    public static void bubbleSort(Lista<Integer> lista) {
    boolean sorted = false;
    Integer temp;
    Integer dataA;
    Integer dataB;

    
    while(!sorted) {
        sorted = true;
        for (int i = 0; i < lista.len()-1; i++) {
           // System.out.println(Integer.toString(i)+"_");
            dataA=lista.getInfo(i);
            dataB=lista.getInfo(i+1);
           // System.out.println(lista.getInfo(i));
            if (dataA > dataB) {
                lista.swap(i, i+1);
                sorted = false;

                }           
        }
    } 
 } 

public static void insertionSort(Lista<Integer> lista) {
    for (int i = 1; i < lista.len(); i++) {
        Integer current =  lista.getInfo(i);
        Integer j = i - 1;
        while(j >= 0 && current < lista.getInfo(j)) {
          //  array[j+1] = array[j];
            lista.replace(j+1, lista.getInfo(j));
            j--;
        }
        // at this point we've exited, so j is either -1
        // or it's at the first element where current >= a[j]
        //array[j+1] = current;
        lista.replace(j+1, current);
    }
}


public static void selectionSort(Lista<Integer> lista) {
    for (int i = 0; i < lista.len(); i++) {
        Integer min = lista.getInfo(i);
        Integer minId = i;
        for (int j = i+1; j < lista.len(); j++) {
            if (lista.getInfo(j) < min) {
                min = lista.getInfo(j);
                minId = j;
            }
        }
        // swapping
        Integer temp = lista.getInfo(i);
        lista.replace(i, min);
        lista.replace(minId, temp);
    }
}

 
}
