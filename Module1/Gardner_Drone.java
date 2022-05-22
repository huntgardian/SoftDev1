//Author Name: Hunter D. Gardner
//Date: 5/15/2022
//Program Name: Gardner_Drone
//Purpose: Simulation using button, drone movement in x, y,z location
package Module1;
public class Gardner_Drone {
    //start main
    public static void main(String[] args) {
        //instantiate variables and objects
        Drone drone = new Drone();
        int userChoice = 0;
        MainMenu menu = new MainMenu();
        //iterate through the menu and its choices
        while (userChoice != 8) {
            //call the menu each time to retrieve the user's choice
            try{
                userChoice = menu.menu();
            }
            catch (Exception e){
                System.out.println("ERROR!! Please Enter One of the Selections Provided 1-8");
                userChoice = menu.menu();
            }
            switch (userChoice) {
                //move the drone higher
                case 1:
                    drone.zpos = drone.zpos + 1;
                    break;
                //move the drone lower
                case 2:
                    drone.zpos = drone.zpos - 1;
                    break;
                //move the drone in the direction its facing
                case 3:
                    System.out.println("Moving Forward...");
                    switch (drone.myDir){
                        case North:
                            drone.ypos = drone.ypos + 1;
                            break;
                        case West:
                            drone.xpos = drone.xpos - 1;
                            break;
                        case South:
                            drone.ypos = drone.ypos - 1;
                            break;
                        case East:
                            drone.xpos = drone.xpos + 1;
                            break;
                    }
                    break;
                //retreat the drone in the direction its facing
                case 4:
                    System.out.println("Moving Backward...");
                    switch (drone.myDir){
                        case North:
                            drone.ypos = drone.ypos - 1;
                            break;
                        case West:
                            drone.xpos = drone.xpos + 1;
                            break;
                        case South:
                            drone.ypos = drone.ypos + 1;
                            break;
                        case East:
                            drone.xpos = drone.xpos - 1;
                            break;
                    }
                    break;
                //change the orientation of the drone to the left
                case 5:
                    System.out.println("Turning Left...");
                    switch (drone.myDir){
                        case North:
                            drone.myDir = Drone.direction.West;
                            break;
                        case West:
                            drone.myDir = Drone.direction.South;
                            break;
                        case South:
                            drone.myDir = Drone.direction.East;
                            break;
                        case East:
                            drone.myDir = Drone.direction.North;
                            break;
                    }
                    break;
                //change the orientation of the drone to the right
                case 6:
                    System.out.println("Turning Right...");
                    switch (drone.myDir){
                        case North:
                            drone.myDir = Drone.direction.East;
                            break;
                        case West:
                            drone.myDir = Drone.direction.North;
                            break;
                        case South:
                            drone.myDir = Drone.direction.West;
                            break;
                        case East:
                            drone.myDir = Drone.direction.South;
                            break;
                    }
                    break;
                //display the current position and orientation of the drone
                case 7:
                    System.out.println(drone.position());
                    break;
            }
        }
    }
}