//Author Name: Hunter D. Gardner
//Date: 5/15/2022
//Program Name: Gardner_Drone
//Purpose: Simulation using button, drone movement in x, y,z location
package Module1;
import java.util.Scanner;

public class MainMenu {
    public int menu() {

        //instantiate any attributes
        int selection;
        Scanner input = new Scanner(System.in);

        /***************************************************/
        //print the menu
        System.out.println("Which direction would you like to move the drone?");
        System.out.println("1 - Move Up");
        System.out.println("2 - Move Down");
        System.out.println("3 - Move Forward");
        System.out.println("4 - Move Backward");
        System.out.println("5 - Turn Left");
        System.out.println("6 - Turn Right");
        System.out.println("7 - Display Position and Orientation");
        System.out.println("8 - Exit Navigation");

        //return the user's selection to main and execute decision
        selection = input.nextInt();
        return selection;
    }
}
