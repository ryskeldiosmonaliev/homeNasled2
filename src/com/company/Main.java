package com.company;

public class Main {

    public static void main(String[] args) {
        Programer proramer = new Programer("Рыскелди", "Осмоналиев", "goole");
        System.out.println(proramer);
        System.out.println("в какой компонии работает-> " + proramer.getComponyName());
        proramer.coding();
        proramer.learn();
        proramer.eat();
        proramer.walk();
        System.out.println();

        Danser danser = new Danser("Вацлав", "Нижинский", "балные танцы");
        System.out.println(danser);
        System.out.println(" группа->" + danser.getGroupName());
        danser.learn();
        danser.eat();
        danser.walk();
        danser.dansing();
        System.out.println();

        Singer singer = new Singer("Виктор", "ЦоЙ", "группа крови");
        System.out.println(singer);
        System.out.println("Группа-> " + singer.getBandName());
        singer.learn();
        singer.eat();
        singer.walk();
        singer.playGitar();
        singer.singing();
    }
}
