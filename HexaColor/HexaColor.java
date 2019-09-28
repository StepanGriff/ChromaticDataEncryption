import java.util.*;
/**
 * Write a description of class HexaColor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HexaColor
{
    String binary;
    String [] split;
    /**
     * Constructor for objects of class HexaColor
     */
    public HexaColor(String x)
    {
        this.binary = x;
        this.split= new String[3];
        split();
    }

    public void split(){
        String x;
        int k=0;
        for (int i = 0; i<split.length; i++){
            x = "";
            for (int j=0; j<binary.length()/3; j++){
                x = binary.charAt(k)+x;
                k++;
            }
            split[i]= x;
            System.out.println (split[i].toString());
        }
        
    }
}
