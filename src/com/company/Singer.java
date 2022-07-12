package com.company;

public class Singer extends Person {
    private String bandName;
   void singing(){
       System.out.println("хорошо ли поет: поет отлично");
   };
    void playGitar(){
        System.out.println("умеат ли играт на гитаре: да он играет ");
    }

    public String getBandName() {
        return bandName;
    }


    public Singer(String name, String surName, String bandName) {
        super(name, surName);
        this.bandName = bandName;

    }
}
