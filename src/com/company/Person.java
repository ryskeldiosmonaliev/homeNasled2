package com.company;

public class Person {
        private String name;
        private String surName;

        void learn(){
            System.out.println("что изучауть: пока неизвестно");
        }
        void walk (){
            System.out.println("сколько шагоф в день:"+10000);
        }
        void eat (){
            System.out.println("что ел на обед: бифтекс ");
        }
        public Person(String name, String surName) {
            this.name = name;
            this.surName = surName;

        }

        @Override
        public String toString() {
            return "name-> "+name+" "+"surName->  "+" "+surName;
        }
    }

