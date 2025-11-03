package service; // пакет;

import model.Food;
import model.constants.Discount;

public class ShoppingCart { //класс для корзины;

    private Food[] foods; // массив элементов из объектов типа food;

    public ShoppingCart(Food[] foods) { // конструктор с одним параметром - массивом элементов Food;
        this.foods = foods;
    }

    public double totalSumWithoutDiscount() { // получить общую сумму товаров в корзине без скидки;
        double totalSum = 0;
        for (int i = 0; i < foods.length; i++) {
            totalSum += foods[i].getAmount() * foods[i].getPrice();
        }
        return totalSum;
    }

    public double totalSumWithDiscount() { // получить общую сумму товаров в корзине со скидкой;
        double totalSum = 0;
        for (int i = 0; i < foods.length; i++) {
            double discount = 1 - foods[i].getDiscount();
            totalSum += foods[i].getAmount() * foods[i].getPrice() * discount;
        }
        return totalSum;
    }

    public double totalSumVegetarianWithoutDiscount() { // получить общую сумму всех вегетарианских продуктов в корзине без скидки;
        double totalSum = 0;
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].isVegetarian()) {
                totalSum = totalSum + foods[i].getAmount() * foods[i].getPrice();
            }
        }
        return totalSum;
    }
}
