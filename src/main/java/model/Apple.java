package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food { // класс для яблок

    private String colour;

    public Apple(int amount, double price, String colour) { //конструктор
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.RED_COLOUR)) {
            return Discount.DISCOUNT_RED_APPLES;
        }
        return Discount.DISCOUNT_OTHER;
    }

}
