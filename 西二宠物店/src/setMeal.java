public class setMeal {
    String name;
    double price;
    animal animals;
    vaccine vaccines;

    public setMeal(String name, animal animals, vaccine vaccines, double price){
        this.name = name;
        this.animals = animals;
        this.vaccines = vaccines;
        this.price = price;
    }

    @Override
    public String toString() {
        return "SetMeal Name: "+this.name+"\nPrice: "+this.price;
    }

}
