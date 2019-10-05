package com.example.app_sort;

public class time {
    public static void timer(int s){
        int frameRate = s;
        float interval = 1000.0f / frameRate;
        float time = System.currentTimeMillis();



        time = System.currentTimeMillis() - time;
        if(time<interval){
            try{
                Thread.sleep((long)(interval-time));
            }catch(InterruptedException ignore){}

        }
    }
}
