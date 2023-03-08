package ru.cat;

public class Cats {

    final int eatForCat = 70;

    final int waterForCat = 50;
    String name;
    int age;
    int weigh;
    int hunger;
    int thirst;
    static int countCats = 0;



    static void meow(){
        System.out.println("meow");
    }

    void EatFromPlate(Plate plateWithFood){
        System.out.println("Хочу кушать из тарелки");
        plateWithFood.DecreaseEat(eatForCat);
    }

    void DrinkFromBowl(Bowl bowlWithWater){
        System.out.println("Хочу пить");
        bowlWithWater.DecreaseWater(waterForCat);
    }


    public Cats(String name, int age, int weigh, int hunger, int thirst) {
        this.name = name;
        this.age = age;
        this.weigh = weigh;
        this.hunger = hunger;
        this.thirst = thirst;
        countCats++;

    }
}
