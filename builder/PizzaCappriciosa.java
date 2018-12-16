package wzorce.builder;

public class PizzaCappriciosa extends PizzaBuilder{
     
    @Override
    public void setNewCiasto(){
        pizza.setCiasto("cienkie");
    }
    
    @Override
    public void setNewSos(){
        pizza.setSos("łagodny");
    }
    
    @Override
    public void setNewZestawSkladnikow(){
        pizza.setZestawSkladnikow("sos pomidorowy + mozzarella + szynka + pieczarki + cebula");
    }
}
