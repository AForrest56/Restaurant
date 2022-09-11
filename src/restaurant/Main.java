package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        MenuItem spaghetti = new MenuItem("Spaghetti", 10.00, "Noodles covered in red, meat sauce",
                "Entree", false);
        MenuItem tRavs = new MenuItem("T. Ravs", 7.00, "Fried pockets, stuffed with your choice of " +
                "meat or cheese. Marinara included.", "Appetizer", false);
        MenuItem tiramisu = new MenuItem("Tiramisu", 7.00, "Coffee and cocoa flavoured dessert.",
                "Dessert", true);

        ArrayList<MenuItem> myMenuItems = new ArrayList<>();
        myMenuItems.add(spaghetti);
        myMenuItems.add(tRavs);
        myMenuItems.add(tiramisu);

        Menu ourMenu = new Menu(new Date(), myMenuItems);
        ourMenu.printMenu();
    }
}
