import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(3);
        clock();
      
    }

    public static String pluralize(String word, int count) {
        if (count == 0 || count > 1 ) {
            return word + "s";
        } else {
            return word;
        }
    }

    public static void flipNHeads(int n) {
        Random rand = new Random();
        int flips = 0;
        int counter = 0;

        while (counter != n) {
            double number = rand.nextDouble();
            if (number > 0.5d) {
                System.out.println("Tails ");
                counter ++;
            } else if (number < 0.5d) {
                System.out.println("Heads ");
                counter = 0;
            }
            flips ++;
        }
        System.out.println("It took " + flips + " flips to flip " + n + " heads in a row. \n");
    }

    public static void clock() {
        Timer seconds = new Timer();
        seconds.schedule(new TimerTask() {
            @Override
            public void run(){
                LocalDateTime dateTime = LocalDateTime.now();
                String time = dateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(time);
            }
        }, 0, 1000);
    }
  }