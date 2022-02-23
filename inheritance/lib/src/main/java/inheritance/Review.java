package inheritance;

public class Review {
    String body = "";
    String author = "";
    int stars = 0;

    public Review (String body, String author, int stars){
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    @Override
    public String toString(){
        String str = "";
        str += "Body: " + this.body + "Review: " + this.author + "Stars: " + this.stars;
        return str;
    }
}
