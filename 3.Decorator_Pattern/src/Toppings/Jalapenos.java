package src.Toppings;

import src.Pizza.BasePizza;

public class Jalapenos extends ToppingDecorator{

    BasePizza pizza;

    public Jalapenos(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost()+20;
    }
}
