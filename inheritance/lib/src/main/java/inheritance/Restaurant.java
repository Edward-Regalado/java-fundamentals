package inheritance;

public class Restaurant {

    String name;
    int stars;
    double price;

    public Restaurant(String name, int stars, double price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    @Override
    public String toString(){
        String str = "";
        str += "Name: " + this.name + " Stars: " + this.stars + " Price: $" + this.price;
        return str;
    }


    public void addReview(){
        System.out.println("work in progress");
    }

}
