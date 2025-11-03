package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food { // класс для яблок

    private final String colour;

    public Apple(int amount, double price, String colour) { //конструктор
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        return colour.equals(Colour.RED_COLOUR) ? Discount.DISCOUNT_RED_APPLES : Discount.DISCOUNT_OTHER;
    }

}
