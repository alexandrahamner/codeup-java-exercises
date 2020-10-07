package movies;

import util.Input;

import java.util.Arrays;

import static movies.MoviesArray.findAll;

public class MoviesApplication {
    public static void main(String[] args) {

        System.out.println("What would you like to watch?");
        System.out.println();

        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println();

        displayMovieList();

    }

    public static void displayMovieList() {
        Input input = new Input();
            int userChoice = input.getInt("Enter your choice: ");
            if(userChoice != 0) {
                switch (userChoice) {
                    case 1:
                        getMovieList();
                        break;
                    case 2:
                        getMovieList("animated");
                        break;
                    case 3:
                        getMovieList("drama");
                        break;
                    case 4:
                        getMovieList("horror");
                        break;
                    case 5:
                        getMovieList("scifi");
                        break;
                }
                displayMovieList();
            }
        }


    public static void getMovieList() {
        Movie[] movieList = MoviesArray.findAll();
        for(Movie movie : movieList) {
            System.out.printf("%s -- %s\n", movie.getMovieName(), movie.getMovieCategory());
        }
        System.out.println();
    }

    public static void getMovieList(String category) {
        Movie[] movieList = MoviesArray.findAll();
        for(Movie movie : movieList) {
            String movieCategory = movie.getMovieCategory();
            if(movieCategory.equalsIgnoreCase(category)) {
                System.out.printf("%s -- %s\n", movie.getMovieName(), movie.getMovieCategory());
            }
        }
        System.out.println();
    }
}
