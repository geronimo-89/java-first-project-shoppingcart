package ru.yandex.praktikum.model;
//исправлено: лишние импорты
public class Meat extends Food {

    public Meat (int amount, double price) {
        this.amount = amount;
        this.price = price;
        isVegetarian = false;
    }
}


