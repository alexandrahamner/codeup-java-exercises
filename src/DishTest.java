public class DishTest {
    public static void main(String[] args) {
//        Dish rajas = new Dish();
//        rajas.costInCents = 400;
//        rajas.nameOfDish = "Rajas";
//        rajas.wouldRecommend = true;



//        rajas.printSummary();
//
//        DishTools.shoutDishName(rajas);
//        DishTools.analyzeDishCost(rajas);
//        DishTools.flipRecommendation(rajas);

        Dish d1 = new Dish("rajas", 500, true);

        DishTools.shoutDishName(d1);
        DishTools.analyzeDishCost(d1);
        DishTools.flipRecommendation(d1);

    }
}

/*
-- SHORT ASSIGNMENT #3 --
    Refactor your Dish and DishTest classes...
      1) Change all properties in the Dish class to private visibility (printSummary should remain public)
      2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to write them quickly)
      3) Refactor code as needed in DishTest to access and modify dish object property values
      4) Add a constructor method to Dish that will assign all properties
      5) Refactor DishTest again to use the constructor to set all property values rather than setter methods
 */
