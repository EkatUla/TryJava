package ru.cat;

public class Plate {
    int countEat;   // сколько еды осталось в тарелке


    void DecreaseEat(int eatFood){
        countEat = countEat - eatFood;
    }

    public Plate(int countEat) {
        this.countEat = countEat;
    }


}
