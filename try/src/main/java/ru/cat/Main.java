package ru.cat;

public class Main {
    public static void main(String[] args) {
        Cats cat = new Cats("Фифа", 5, 3, 0, 0);
        Cats cat2 = new Cats("Зуля", 3, 10, 0,0);

        Plate plate = new Plate(2500);

        System.out.println(cat.name);
        //System.out.println(cat.count);
        System.out.println(cat2.name);
        //System.out.println(cat2.count);
        System.out.println("Количество кошек сейчас - " + Cats.count);
        Cats.meow();

        cat.whatToEatFromPlate(plate);
        cat2.whatToEatFromPlate(plate);

        System.out.println(plate.countEat);


    }
}
