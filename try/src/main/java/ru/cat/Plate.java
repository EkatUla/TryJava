package ru.cat;

public class Plate {
    int countEat;   // сколько еды осталось в тарелке


    void DecreaseEat(int oneTimeEat){
        countEat = countEat - oneTimeEat;
    }

    public Plate(int quantityFood) {
        this.countEat = quantityFood;
    }


}
