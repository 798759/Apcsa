
/**
 * lab 820.
 *
 * @author (cspackman)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private int snumber;
    private boolean sActive;
    private double sGPA;
    private String sName;

    /**
     * Large Math problem is caculation of my gpa
     */
    public Student()
    {
        // initialise instance variables
        snumber = 3;
        sActive = true;
        sGPA = (4+4+4+4+4+4+3+4+4+4+4+5+5+4+4+4+4)/18;
        sName = "Connor";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setsnumber(int sn)
    {
        snumber = (sn);
    }
        // put your code here
        public int getsnumber(){
        return snumber;}
        
    public void setsActive(boolean Status)
    {
        sActive = (Status);
        
    }
        public boolean getsActive(){
            return sActive;}
    public void set sGPA(double GPA)
    {
        sGPA = (GPA);
    }
        public double getsGPA(){
            return sGPA;}
        
}
