package ru.mirea.eremin.task3;

import java.util.ArrayList;

public class Task_1 {
    public static int getRandomNumber(){
        return (int) (Math.random()*99)+10;
    }
    public static void inConsole(ArrayList<Integer> a){
        for(int i=0;i<4;i++) {
            System.out.print(a.get(i)+"  ");
        }
        System.out.println(" ");
    }
    public static void check(ArrayList<Integer> a){
        if((a.get(0)<a.get(1))&&(a.get(1)<a.get(2))&&(a.get(2)<a.get(3))){
            System.out.println("Ряд строго возрастающий");
        }else{
            System.out.println("Ряд не возрастающий");
        }
    }
}
