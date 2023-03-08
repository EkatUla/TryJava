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
        System.out.println("Количество кошек сейчас - " + Cats.countCats);
        Cats.meow();

        cat.EatFromPlate(plate);
        cat2.EatFromPlate(plate);

        System.out.println(plate.countEat);

        Bowl bowl = new Bowl(1000);
        System.out.println(bowl.countWater);
        cat.DrinkFromBowl(bowl);
        System.out.println(bowl.countWater);

    }
}
