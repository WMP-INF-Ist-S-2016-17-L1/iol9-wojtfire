package wzorce.builder;

public class Kelner {
    private PizzaBuilder pizzaBuilder;
    
    public void setPizza(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder = pizzaBuilder;
    }
    
    public Pizza getPizza(){
        return pizzaBuilder.pobierzPizze();
    }
    
    public void nowaPizza(){
        pizzaBuilder.nowaPizza();
        pizzaBuilder.setNewCiasto();
        pizzaBuilder.setNewSos();
        pizzaBuilder.setNewZestawSkladnikow();
    }
}
