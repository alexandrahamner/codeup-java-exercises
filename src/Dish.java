public class Dish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public Dish(String name, int cost, boolean recommendation) {
        this.nameOfDish = name;
        this.costInCents = cost;
        this.wouldRecommend = recommendation;
    }

    public int getCost() {
        return this.costInCents;
    }

    public void setCost(int cost) {
        this.costInCents = cost;
    }

    public String getNameOfDish() {
        return this.nameOfDish;
    }

    public void setName(String name) {
        this.nameOfDish = name;
    }

    public boolean getRecommendation(){
        return this.wouldRecommend;
    }

    public void setRecommendation(boolean recommendation) {
        this.wouldRecommend = recommendation;
    }

    public void printSummary() {
        System.out.printf("Cost: %d cents \nName: %s \nRecommended: %b\n",
                this.costInCents,
                this.nameOfDish,
                this.wouldRecommend);
    }

}
/*
-- OOP SHORT ASSIGNMENT #1 --
Create a class called Dish. This class will represent various restaurant dishes.
Include an integer property called “costInCents”
Include a string property called “nameOfDish”
Include a boolean property called “wouldRecommend”
Include a method called “printSummary” with a void return type
    this method will use a single printf method to print out the values of each of the instance properties in the following format:
      Cost: COST_IN_CENTS_HERE
      Name: NAME_OF_DISH_HERE
      Recommended: BOOLEAN_VALUE_OF_WOULD_RECOMMEND_HERE
Create another class called DishTest
Add a main method and inside the method...
    1) instantiate a Dish object and assign to a variable called dish1
    2) assign creative values for each of the properties
    3) test the printSummary() method by invoking it and checking if all instance values are correctly printed
 */