
/**
 * StatTester finds loads an Array of int
 * and finds the sum, mean, median, and mode.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

// imports go here
import java.util.Arrays;
public class StatTester{
    //  Instance variables
    int nums[];
    int first = 0;

    // Constructor
    public StatTester(){
        nums= new int[100];

    }

    //  Methods
    public void loadArray(){
        for(int i=0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*10 +1) ;
        }

    }

    public void printArray(){
        //int[] intnums= {7, 9, 1, 3};
        System.out.println(Arrays.toString(nums));
    }

    public void getSum(){
        int sum =0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
        }
        System.out.println("sum="+sum);
    }

    public void getMean(){
        double mean = 0;
        int sum =0;
        for (int i=0; i<nums.length; i++){
        mean= sum + nums[i];
        mean = mean/100;
        
    }
    System.out.println("mean="+mean);
    //public double getMedian(){
        //arrayList.sort();
    }
    
    public void getMedian(){
        
        java.util.Arrays.sort(nums);
        first =nums[49];
        System.out.println("Median=" +first);
    }
}

