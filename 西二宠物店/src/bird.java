public class bird extends animal {
    String color;

    public bird(){};

    public bird(String name, double price, boolean isVaccine, String color){
        super();
        this.color = color;
    }

    public String toString(){
        return "Name: "+this.name+"\n Price: "+this.price;
    }
}
