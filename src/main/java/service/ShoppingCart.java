package service; // пакет;

import model.Food;
import model.constants.Discount;

public class ShoppingCart { //класс для корзины;

    public Food[] foods; // массив элементов из объектов типа food;

    public ShoppingCart(Food[] foods) { // конструктор с одним параметром - массивом элементов Food;
        this.foods = foods;
    }

    public double totalSumWithoutDiscount() { // получить общую сумму товаров в корзине без скидки;
        double totalSum = 0;
        for (int i = 0; i < foods.length; i++) {
            totalSum = totalSum + foods[i].getAmount() * foods[i].getPrice();
        }
        return totalSum;
    }

    public double totalSumWithDiscount() { // получить общую сумму товаров в корзине со скидкой;
        double totalSum = 0;
        for (int i = 0; i < foods.length; i++) {
            double discount = 1;
            if (foods[i].getDiscount() != Discount.DISCOUNT_OTHER) {
                discount = foods[i].getDiscount();
            }
            totalSum = totalSum + foods[i].getAmount() * foods[i].getPrice() * discount;
        }
        return totalSum;
    }

    public double totalSumVegetarianWithoutDiscount() { // получить общую сумму всех вегетарианских продуктов в корзине без скидки;
        double totalSum = 0;
        for (int i = 0; i < foods.length; i++) {
            double discount = 1;
            if (foods[i].getIsVegetarian()) {
                totalSum = totalSum + foods[i].getAmount() * foods[i].getPrice();
            }
        }
        return totalSum;
    }
}
