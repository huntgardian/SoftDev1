//Author Name: Hunter D. Gardner
//Date: 5/15/2022
//Program Name: Gardner_Drone
//Purpose: Simulation using button, drone movement in x, y,z location
package Module1;
public class Drone {
    //instantiate attributes of the drone
    int xpos = 3;
    int ypos = 3;
    int zpos = 3;

    enum direction {
        North, //North
        West,  //West
        South, //South
        East   //East
    }

    direction myDir = direction.North;
    String dirString = "North";
    //create a string that describes the position and orientation of the drone
    public String position(){
        switch(myDir) {
            case North:
                dirString = ("North");
                break;
            case West:
                dirString = ("West");
                break;
            case South:
                dirString = ("South");
                break;
            case East:
                dirString = ("East");
                break;
        }
        String outString = ("Student_Drone [x_pos="+xpos+", y_pos="+ypos+", z_pos="+zpos+", orientation="+dirString+"]");
        return outString;
    }
}
