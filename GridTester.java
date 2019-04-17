
/**
 * kevin zazueta
 * problem 5/CW 415
 */
public class GridTester{
    //Instance Variables
    private int rows;
    private int cols;
    private int[][] grid;
    
    //Constructor
    public GridTester(int r, int c)
    {
        // initialise instance variables
        r = rows;
        c = cols;
        
    }

    //Methods
    public void loadOccupied(){
        for(int r = 0; r< rows; r++){//traversing
            for(int c = 0; c<cols; c++){//traversing 
                int shuffler = (int) (Math.random()*3)+1;
                if(shuffler == 3){
                    //Cell.occupied(r,c) = true;
                }
            }
        }
    }
}
