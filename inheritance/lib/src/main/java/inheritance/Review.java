package inheritance;

public class Review {
    String body;
    String author;
    float stars;
    String business;
    String movie;

    //////// DEFAULT CONSTRUCTOR ///////
    public Review (){
    }


    ///// REVIEW CONSTRUCTOR FOR BUSINESSES ///////
    public Review (String body, String author, int stars, Business business){
        this.body = body;
        this.author = author;
        this.stars = (float)stars;
        this.business = business.name;
    }

    //////// CONSTRUCTOR OVERLOADING/SECONDARY REVIEW - ADDS OPTIONAL MOVIE REVIEW FOR THEATER CLASS ///////
    public Review (String body, String author, int stars, Business business, String movie){
        this.body = body;
        this.author = author;
        this.stars = (float)stars;
        this.business = business.name;
        this.movie = movie;
    }

    ////////// TO STRING METHOD ////////
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
