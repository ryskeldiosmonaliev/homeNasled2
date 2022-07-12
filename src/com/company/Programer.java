package com.company;

public class Programer extends Person {
    private String componyName;
    void coding(){
        System.out.println("на каком язык кодит: java");
    }

    public String getComponyName() {
        return componyName;
    }


    public Programer(String name, String surName, String componyName) {
        super(name, surName);
        this.componyName = componyName;
    }

}
