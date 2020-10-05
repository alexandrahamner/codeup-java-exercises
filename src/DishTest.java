public class DishTest extends DishTools {
    public static void main(String[] args) {
        Dish rajas = new Dish();
        rajas.costInCents = 400;
        rajas.nameOfDish = "Rajas";
        rajas.wouldRecommend = true;

        rajas.printSummary();

        shoutDishName(rajas);
        analyzeDishCost(rajas);
        flipRecommendation(rajas);

    }
}
