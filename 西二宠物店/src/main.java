public class main implements petShop {
    double balance;

    @Override
    public void sellMeal() {

    }

    @Override
    public void purchase(animal animals) {
        if(animals instanceof cat){
            balance -= animals.price;
            System.out.println(animals.toString());
        }else if (animals instanceof bird){
            balance -= animals.price;
            System.out.println(animals.toString());
        }else{
            System.out.println("Sorry, don't need this");
        }
    }
}
