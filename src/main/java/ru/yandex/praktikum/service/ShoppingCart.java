package ru.yandex.praktikum.service;
import ru.yandex.praktikum.model.Food;

public class ShoppingCart {

    private static Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    private double itemCost, itemCostWithDiscount, vegetarianCost, totalCost, totalCostWithDiscount, totalVegetarianCost;

    //Задача: В классе ShoppingCart реализуй методы для работы с корзиной:
    //получить общую сумму товаров в корзине без скидки


    public double getTotalItemsCost() {

        totalCost = 0;

        for (int i = 0; i < food.length; i++) {
            itemCost = food[i].getAmount() * food[i].getPrice();
            totalCost += itemCost;
        }

        return totalCost;
    }

    //получить общую сумму товаров в корзине со скидкой

    public double getTotalItemsCostWithDiscount() {

        totalCostWithDiscount = 0;

        for (int i = 0; i < food.length; i++) {
            itemCostWithDiscount = food[i].getAmount() * (food[i].getPrice() - (food[i].getPrice() * (food[i].getDiscount() / 100)));
            totalCostWithDiscount += itemCostWithDiscount;
        }

        return totalCostWithDiscount;
    }

    //получить общую сумму всех вегетарианских продуктов в корзине без скидки

    public double getTotalVegetarianCost() {

        totalVegetarianCost = 0;

        for (int i = 0; i < food.length; i++) {
            if (food[i].isVegetarian()) {
                vegetarianCost = food[i].getAmount() * food[i].getPrice();
                totalVegetarianCost += vegetarianCost;  //исправлено: убрано условие else
            }
        }
        return totalVegetarianCost;
    }
}

