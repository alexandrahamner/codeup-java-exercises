import util.Input;

import java.util.ArrayList;

public class GroceryListApplication {

    public static Input input = new Input();

    public static void main(String[] args) {
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        System.out.println("Welcome to the Grocery List App!");
        boolean userInput = input.yesNo("Would you like to create a grocery list?");

        if(userInput) {
            displayCategories();
            String itemCategory = addGroceryCategory();
            System.out.println(itemCategory);
        } else {
            System.out.println("Alright, see you again soon!");
        }
    }


    public static void displayCategories(){
        System.out.println("Pick a category for your grocery item:");
        System.out.println();
        System.out.println("0 - View your Grocery List");
        System.out.println("1 - Dairy");
        System.out.println("2 - Meat");
        System.out.println("3 - Deli");
        System.out.println("4 - Frozen");
        System.out.println("5 - Produce");
        System.out.println("6 - Condiments & Spices");
        System.out.println("7 - Dry Foods");
        System.out.println("8 - Health Care");
        System.out.println("9 - Household Goods");
        System.out.println("10 - Other");
    }

    public static String addGroceryCategory() {
        int userChoice = input.getInt("Enter your choice: ");
            switch (userChoice) {
                case 1:
                    return "Dairy";
                case 2:
                    return "Meat";
                case 3:
                    return "Deli";
                case 4:
                    return "Frozen";
                case 5:
                    return "Produce";
                case 6:
                    return "Condiments & Spices";
                case 7:
                    return "Dry Foods";
                case 8:
                    return "Health Care";
                case 9:
                    return "Household Goods";
                case 10:
                    return "Other";
                default:
                    System.out.println("This is not a valid choice");
                    return addGroceryCategory();
            }
    }
}
