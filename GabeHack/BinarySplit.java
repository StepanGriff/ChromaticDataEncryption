import java.io.*; 
import java.util.*;
import java.util.ArrayList;
/**
 * Write a description of class ImageStuff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinarySplit
{

    // instance variables - replace the example below with your own
    public String[][] firstBinaryBlock;

    public String stringIn;

    //public String[] secondBinaryBlock;
    //public String[] thirdBinaryBlock;
    /**
     * Constructor for objects of class ImageStuff
     */
    public BinarySplit(String stringIn)
    {

        this.stringIn = stringIn;
    }

    /*
     * Rename it to variable arraylist of binary. Something.
     * 
     */
    public void iHNC() {
        String chunk = "";
        int k;
        for(int i = 0; i < this.stringIn.length(); i += 24) {
            chunk = "";
            for(int j = 0; j <= 23; j++) {
                k =i+j;
                if (k >= stringIn.length()){ 
                    break;
                }
                chunk = chunk + this.stringIn.charAt((k));
            } 
            System.out.println(chunk);
        }
    }
}
