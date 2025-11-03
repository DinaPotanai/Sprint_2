package model;

import model.constants.Discount;

public abstract class Food implements Discountable { // абстрактный класс с полями

    protected int amount; // количество продуктов в килограммах (целое число);
    protected double price; // цена за единицу (вещественное число);
    protected boolean isVegetarian; // флаг, который показывает, вегетарианский ли продукт;

    protected Food (int amount, double price, boolean isVegetarian) { // конструктор класса Food;
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public int getAmount() { // метод возвращает количество продуктов в кг;
        return amount;
    }

    public double getPrice() { // метод возвращает цену за  единицу;
        return price;
    }

    public boolean isVegetarian() { // метод возвращает инфо вегетарианский ли продукт;
        return isVegetarian;
    }

    @Override // переопределяет метод;
    public double getDiscount() {
        return Discount.DISCOUNT_OTHER;
    }

}
