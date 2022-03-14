package inheritance;

public class Review {
    String body;
    String author;
    int stars;
    String business;
    String movie;

    public Review (String body, String author, int stars, Business business){
        this.body = body;
        this.author = author;
        this.stars = stars;
        this.business = business.name;
    }

    public Review (String body, String author, int stars, Business business, String movie){
        this.body = body;
        this.author = author;
        this.stars =  stars;
        this.business = business.name;
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Review- " +
                "Body: " + body + '\'' +
                ", Author: '" + author + '\'' +
                ", Stars: " + stars +
                ", Business: '" + business + '\'' +
                ", Movie: '" + movie + '\'';
    }
}
