package ru.mirea.eremin.task3;

import java.util.ArrayList;

public class Report {
    ArrayList<Employe> list=new ArrayList<>();

    public void generateReport(){
        for(int i=0;i<this.list.size();i++){
            String s=String.format("%.2f",this.list.get(i).getSalary());
            System.out.printf("%-15s %15s %n",this.list.get(i).getFullname(),s);
        }
    }

    public ArrayList<Employe> getList() {
        return list;
    }

    public void setList(ArrayList<Employe> list) {
        this.list = list;
    }
}
