package wzorce.builder;

abstract class PizzaBuilder {
    public Pizza pizza;
    
    public Pizza pobierzPizze(){
        return pizza;
    }
    
    public void nowaPizza(){
        pizza = new Pizza();
    }
    
    public abstract void setNewCiasto();
    public abstract void setNewSos();
    public abstract void setNewZestawSkladnikow();
}

