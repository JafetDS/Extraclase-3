/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AndroidStudio;

/**
 *
 * @author User
 */
public class Sorted {
 public static void bubbleSort(Lista<Integer> lista) {
    boolean sorted = false;
    Integer temp;
    while(!sorted) {
        sorted = true;
        for (int i = 0; i < lista.len()-1; i++) {
            Integer dato1=lista.getInfo(i);
            Integer dato2=lista.getInfo(i+1);
            if (dato1 <= dato2) {
            } else {
                temp = lista.getInfo(i);
                lista.swap(i, i+1);
                sorted = false;
            }
        }
    } 
 } 

public static void insertionSort(Lista<Integer> lista) {
    for (int i = 1; i < lista.len(); i++) {
        Integer current =  lista.getInfo(i);
        int j = i - 1;
        while(j >= 0 && current < lista.getInfo(i)) {
          //  array[j+1] = array[j];
            lista.replace(j+1, lista.getNodo(j));
            j--;
        }
        // at this point we've exited, so j is either -1
        // or it's at the first element where current >= a[j]
        //array[j+1] = current;
        lista.replace(j+1, current);
    }
}




 
}
