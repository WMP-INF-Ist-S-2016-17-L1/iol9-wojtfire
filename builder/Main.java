package wzorce.builder;

public class Main {
    public static void main(String [] args){
        Kelner kelner = new Kelner();
        PizzaBuilder pizzaBuilder1 = new PizzaHawajska();
        PizzaBuilder pizzaBuilder2 = new PizzaCappriciosa();
        
        System.out.println("Pizza hawajska:");
        kelner.setPizza(pizzaBuilder1);
        kelner.nowaPizza();
        Pizza pizzaHawajska = kelner.getPizza();
        kelner.setPizza(pizzaBuilder2);
        kelner.nowaPizza();
        Pizza pizzaCappriciosa = kelner.getPizza();
        System.out.println(pizzaHawajska.toString());
        System.out.println("\nPizza cappriciosa:");
        System.out.println(pizzaCappriciosa.toString());
    }
}
