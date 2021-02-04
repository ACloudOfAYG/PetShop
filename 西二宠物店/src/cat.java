public class cat extends animal {
    String kinds;

    public cat(){}

    public cat(String name, double price, boolean isVaccine, String kinds){
        super();
        this.kinds = kinds;
    }

    public String toString(){
        return "Name: "+this.name+"\n Price: "+this.price;
    }
}
