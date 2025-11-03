package service; // пакет;

import model.Food;

public class ShoppingCart { //класс для корзины;

    private final Food[] foods; // массив элементов из объектов типа food;

    public ShoppingCart(Food[] foods) { // конструктор с одним параметром - массивом элементов Food;
        this.foods = foods;
    }

    public double totalSumWithoutDiscount() { // получить общую сумму товаров в корзине без скидки;
        double totalSum = 0;
        for (Food food : foods) {
            totalSum += food.getAmount() * food.getPrice();
        }
        return totalSum;
    }

    public double totalSumWithDiscount() { // получить общую сумму товаров в корзине со скидкой;
        double totalSum = 0;
        for (Food food : foods) {
            double discount = 1 - food.getDiscount();
            totalSum += food.getAmount() * food.getPrice() * discount;
        }
        return totalSum;
    }

    public double totalSumVegetarianWithoutDiscount() { // получить общую сумму всех вегетарианских продуктов в корзине без скидки;
        double totalSum = 0;
        for (Food food : foods) {
            if (food.isVegetarian()) {
                totalSum = totalSum + food.getAmount() * food.getPrice();
            }
        }
        return totalSum;
    }
}
