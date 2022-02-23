package inheritance;

public class Restaurant extends Business {

    public Restaurant(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString(){
        String str = "";
        str += "Shop Name: " + this.name +  "Price: $" + this.price;
        return str;
    }

    public void addReview(){
        System.out.println("work in progress");
    }

}
