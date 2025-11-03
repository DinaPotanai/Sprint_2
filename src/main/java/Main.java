import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;


public class Main { // класс main;
    public static void main(String[] args){ // метод main;


        Meat meat = new Meat (5,100);// инициализируем данные, создаем объект "мясо";

        Apple redApple = new Apple(10, 50, Colour.RED_COLOUR); // инициализируем данные, создаем объект "красные яблоки";

        Apple greenApple = new Apple(8, 60, Colour.GREEN_COLOUR); // инициализируем данные, создаем объект "зеленые яблоки";

        Food[] foods = {meat, redApple, greenApple}; // создаем массив продуктов из созданных элементов;

        ShoppingCart shoppingCart = new ShoppingCart(foods); // инициализируем корзину с помощью созданного массива;

    // вывод результатов:
    System.out.printf("Общая сумма товаров без скидки: " + shoppingCart.totalSumWithoutDiscount() + "руб.");
    System.out.printf("Общая сумма товаров со скидкой: " + shoppingCart.totalSumWithDiscount() + "руб.");
    System.out.printf("Cумма вегетарианских продуктов без скидки: " + shoppingCart.totalSumVegetarianWithoutDiscount() + "руб.");

    }
}
