package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.model.constants.Discount;

public class Apple extends Food {

    private String colour;

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.COLOUR_RED)) { //исправлено: сравнение через equals
            return Discount.DISCOUNT_60;
        } else {
            return 0;
        }
    }

    public Apple (int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        isVegetarian = true;
        }
}


