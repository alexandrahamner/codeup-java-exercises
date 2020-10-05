public class DishTools {

    public static int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static void shoutDishName(Dish d) {
        System.out.printf("%s\n", d.nameOfDish.toUpperCase());

    }

    public static void analyzeDishCost(Dish d) {
        if(d.costInCents > AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.println("More expensive than average cost of a dish.");
        }
        else if(d.costInCents < AVERAGE_COST_OF_DISH_IN_CENTS) {
            System.out.println("Less expensive than average cost of a dish.");
        }
    }

    public static void flipRecommendation(Dish d) {
        d.wouldRecommend = !d.wouldRecommend;
        d.printSummary();
    }


}

/*
— OOP Mini Exercise #2 --
Create a class of static fields (properties and methods) called DishTools
      - AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 13000 (use the final keyword to make it a constant)
      - shoutDishName() - that takes in a Dish object and prints out the name in all caps
      - analyzeDishCost() - that takes in a Dish object and will print out either “More expensive than average” or “Less expensive than average”, depending on the value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS
      - flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value

 */