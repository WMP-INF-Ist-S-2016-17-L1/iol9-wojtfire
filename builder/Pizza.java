package wzorce.builder;

public class Pizza {
    private String ciasto;
    private String sos;
    private String zestawSkladnikow;
    
    public void setCiasto(String value){
        ciasto = value;
    }
    
    public void setSos(String value){
        sos = value;
    }
    
    public void setZestawSkladnikow(String value){
        zestawSkladnikow = value;
    }
    
    @Override
    public String toString(){
        return "Ciasto: " + ciasto + ", sos: " + sos + ", zestaw składników: " + zestawSkladnikow + "";
    }
}
