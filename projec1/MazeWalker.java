
/**
 * Write a description of class MazeWalker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MazeWalker
{
    // instance variables - replace the example below with your own
    private int x;
    private int varx;
    private int vary;

    /**
     * Constructor for objects of class MazeWalker
     */
    public MazeWalker()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }

    public void walkMaze(Maze maze, MazeBot mazeBot){
        for (varx=0;varx<2; varx+=1){
            mazeBot.moveForward();
        }
        mazeBot.turnRight();
        for (varx=0;varx<3; varx+=1){
            mazeBot.moveForward();
        }
        mazeBot.turnLeft();
        for (varx=0;varx<2; varx+=1){
            mazeBot.moveForward();
        }
        mazeBot.turnLeft();
        for (varx=0;varx<4; varx+=1){
            mazeBot.moveForward();
        }
        mazeBot.turnRight();
        for (varx=0;varx<3; varx+=1){
            mazeBot.moveForward();
        }
        mazeBot.turnRight();
        for (varx=0;varx<2; varx+=1){
            mazeBot.moveForward();
        }
        mazeBot.turnLeft();
        for (varx=0;varx<2; varx+=1){
            mazeBot.moveForward();
        }
        if(mazeBot.didReachGoal()){
            mazeBot.signalSuccess();

        }
        else{
            mazeBot.signalError();

        }
        
    }
}
