package com.company;

public class Danser extends Person{
    private String groupName;
     void dansing(){
         System.out.println("что он танцует: балет");
     }

    public String getGroupName() {
        return groupName;
    }


    public Danser(String name, String surName,String groupName) {
        super(name, surName);
        this.groupName = groupName;

    }

}
