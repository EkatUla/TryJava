package ru.cat;

public class Bowl {
    int countWater = 0;


    void DecreaseWater(int oneTimeDrink) {
        countWater = countWater - oneTimeDrink;
    }


    public Bowl(int quantityWater) {
        this.countWater = quantityWater;
    }
}
