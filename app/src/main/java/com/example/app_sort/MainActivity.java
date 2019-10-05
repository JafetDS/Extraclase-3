package com.example.app_sort;
import java.lang.String;
import java.util.EventListener;

import android.content.Context;
import android.os.Bundle;
import android.widget.AbsListView.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

@FunctionalInterface



public class MainActivity extends AppCompatActivity {
    public Button Bubble;
    public Button Insert;
    public Button Selec;
    public Button Ingresar;
    public TextView cont;
    public TextView swap;

    public Lista<Button> listaB;
    public Lista<Integer> ListaA;
    public EditText Inp;
    public TextView Caja;
    public LinearLayout row;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.ListaA=new Lista();
        this.ListaB=new Lista()
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        creacion_de_botones();
        ConstraintLayout parent=(ConstraintLayout) findViewById(R.id.parent);
        LayoutParams params=new LayoutParams(WRAP_CONTENT, WRAP_CONTENT);

        Context context = getApplicationContext();

        LinearLayout row = new LinearLayout(context);
        row.setLayoutParams(params);
        this.row=row;
        parent.addView(this.row);

    }

    public void creacion_de_botones(){






    }

    public  void bubbleSort(EventListener e) {
        Lista<Integer> lista= this.ListaA;
        int comp=0;
        int swapin=0;
        boolean sorted = false;
        Integer temp;
        Integer dataA;
        Integer dataB;


        while(!sorted) {
            sorted = true;
            for (int i = 0; i < lista.len()-1; i++) {
                System.out.println(lista.getInfo(i));
                time.timer(1);
                dataA=lista.getInfo(i);
                dataB=lista.getInfo(i+1);
                // System.out.println(lista.getInfo(i));
                comp++;
                if (dataA > dataB) {
                    this.Caja.setText(this.listaA.print());
                    swapin++;
                    lista.swap(i, i+1);
                    sorted = false;

                }
            }
        }
        this.cont.setText(comp);
        this.swap.setText(swapin);
    }

    public  void insertionSort(EventListener e) {
        Lista<Integer> lista= this.ListaA;
        int comp=0;
        int swapin=0;
        for (int i = 1; i < lista.len(); i++) {
            Integer current =  lista.getInfo(i);
            Integer j = i - 1;
            while(j >= 0 && current < lista.getInfo(j)) {
                //  array[j+1] = array[j];
                comp++;
                swapin++;
                lista.replace(j+1, lista.getInfo(j));
                j--;
                this.Caja.setText(this.listaA.print());
            }
            // at this point we've exited, so j is either -1
            // or it's at the first element where current >= a[j]
            //array[j+1] = current;
            swapin++;
            lista.replace(j+1, current);
            this.Caja.setText(this.listaA.print());
        }
        this.cont.setText(comp);
        this.swap.setText(swapin);
    }


    public  void selectionSort(EventListener e) {
        Lista<Integer> lista= this.ListaA;
        int comp = 0;
        int swapin = 0;
        for (int i = 0; i < lista.len(); i++) {
            Integer min = lista.getInfo(i);
            Integer minId = i;
            for (int j = i + 1; j < lista.len(); j++) {
                if (lista.getInfo(j) < min) {
                    this.Caja.setText(this.listaA.print());
                    comp++;
                    min = lista.getInfo(j);
                    minId = j;
                }
            }
            // swapping
            swapin++;
            Integer temp = lista.getInfo(i);
            lista.replace(i, min);
            lista.replace(minId, temp);
            this.Caja.setText(this.listaA.print());
        }
        this.cont.setText(comp);
        this.swap.setText(swapin);
    }

    public void Agregar(){
        String l=this.Inp.getText();
        this.ListaA.addFirst(l);
/*
        LayoutParams params=new LayoutParams(WRAP_CONTENT, WRAP_CONTENT);
        Context context = getApplicationContext();
        Button but = new Button(context);
        but.setTextSize(8);
        but.setLayoutParams(params);


        this.row.addView(but);
        this.listaB.addFirst(but);

 */
    }
}
