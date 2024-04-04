import src.Pizza.BasePizza;
import src.Pizza.NonVegDelight;
import src.Toppings.ExtraCheese;
import src.Toppings.Mushroom;

public class Main {
    public static void main(String args[]){

        BasePizza pizza = new Mushroom(new ExtraCheese(new NonVegDelight()));
        System.out.println(pizza.cost());
    }
}
