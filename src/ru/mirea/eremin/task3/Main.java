package ru.mirea.eremin.task3;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        Task_1 first = null;
        for(int i=0;i<4;i++) list.add(i,first.getRandomNumber());
        first.inConsole(list);
        first.check(list);
        Employe b = new Employe(),t=new Employe(),c=new Employe();
        t.setFullnameAndSalary("Liza",4672.00);
        b.setFullnameAndSalary("John",10.00);
        c.setFullnameAndSalary("Tom",5.37886);
        Report report=new Report();
        ArrayList<Employe> raport=new ArrayList<>();
        raport.add(t);
        raport.add(b);
        raport.add(c);
        report.setList(raport);
        report.generateReport();
    }

}
