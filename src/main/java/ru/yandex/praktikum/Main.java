package ru.yandex.praktikum;
import ru.yandex.praktikum.model.*;
import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        Food meat = new Meat(5, 100);
        Food redApple = new Apple (10, 50, Colour.COLOUR_RED);
        Food greenApple = new Apple (8, 60, Colour.COLOUR_GREEN);
        Food[] itemsAddedToCart = {redApple, greenApple, meat};
        ShoppingCart shoppingCart = new ShoppingCart (itemsAddedToCart);

        //Задача: Посчитай и выведи на экран значения для созданной корзины:
        //общую сумму всех товаров без скидки,
        System.out.println("Общая сумма всех товаров без скидки: " + shoppingCart.getTotalItemsCost() + " руб.");

        //сумму скидки для всей корзины,
        System.out.println("Общая сумма скидки для всей корзины: " + (shoppingCart.getTotalItemsCost() - shoppingCart.getTotalItemsCostWithDiscount()) + " руб.");

        //сумму всех вегетарианских продуктов без скидки.
        System.out.println("Общая сумма вегетарианских продуктов без скидки: " + shoppingCart.getTotalVegetarianCost() + " руб.");

    }
}
