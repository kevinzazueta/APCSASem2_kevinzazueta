
import java.util.ArrayList;
/**
 * Write a description of class Cell here.
 * kevin Zazueta
 * Part 2/ Problem 5/ CW 415
 */
public class Cell
{
    //Instance Variables
    private boolean occupied;
    int id;
    ArrayList<Cell> neighbors = new ArrayList <Cell>();
    
    //Constructor
    public Cell(boolean o, int i){
        o = occupied;
        i = id;
    }

    //Methods
    public void loadNeighbors(){
        for(int c = 0; c<neighbors.size(); c++){
            
        }
    }
}