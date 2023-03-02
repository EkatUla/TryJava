package ru.cat;

public class Cats {

    final int eatForCat = 70;
    String name;
    int age;
    int weigh;
    int hunger;
    int thirst;
    static int count = 0;


    static void meow(){
        System.out.println("meow");
    }

    void whatToEatFromPlate(Plate plate){
        System.out.println("Хочу кушать из тарелки");
        plate.DecreaseEat(eatForCat);

    }


    public Cats(String name, int age, int weigh, int hunger, int thirst) {
        this.name = name;
        this.age = age;
        this.weigh = weigh;
        this.hunger = hunger;
        this.thirst = thirst;
        count++;

    }
}
