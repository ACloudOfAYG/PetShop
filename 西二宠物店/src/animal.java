public class animal {
    protected String name;
    protected double price;
    protected boolean isVaccine;

    public animal(){}
    public animal(String name, double price, boolean isVaccine){
        this.isVaccine = isVaccine;
        this.name = name;
        this.price = price;
    }

}
