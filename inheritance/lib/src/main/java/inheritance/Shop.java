package inheritance;

public class Shop extends Business {

    public Shop(String name, int price){
        super(name, price);
    }

    @Override
    public String toString(){
        String str = "";
        str += "Name: " + this.name + "Price: $" + this.price;
        return str;
    }

    public String addReview(String name, double price) {
        String str = "";
        str += "Name: " + this.name + this.price;
        str = str.toString();
        return str;
    }
}

