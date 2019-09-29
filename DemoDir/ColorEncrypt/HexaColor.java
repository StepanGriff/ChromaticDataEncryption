import java.util.*;
/**
 * Write a description of class HexaColor here.
 *
 * @Steve, Justin
 * @version 9/29/19
 */
public class HexaColor
{
    String binary;
    String [] split;
    int[]color;
    /**
     * Constructor for objects of class HexaColor. The constructor is talking about specific binary, split, and color
     * within the methods. It then invokes two of the methods after initializing the amount of what the arrays hold.
     */
    public HexaColor(String binary)
    {
        this.binary = binary;
        this.split = new String[3];
        this.color = new int[3];
        split();
        hexa();
    }

    /**
     * This method begins with an empty String and making a variable equal 0 before the loops. If the length of the
     * binary is less than 24, it will add binary with 0, right to left. In the second loop and third loop, the loops
     * are adding the received values.
     */
    public void split(){
        String stringSection = "";
        int k=0;
        while (binary.length() < 24)
        {
            binary += "0";
        }
        for (int i = 0; i<split.length; i++){
            stringSection = "";
            for (int j=0; j<binary.length()/3; j++){
                stringSection = binary.charAt(k)+stringSection;
                k++;
            }
            this.split[i]= stringSection;
        }
    }

    /**
     * The method declares two variables that would be used in a for loop that would parse the String array into an 
     * integer array.
     */public void hexa(){
        int parse;
        String y;
        for (int i =0; i<split.length; i++){
            //y = "";
            parse= Integer.parseInt(split[i], 2);
            this.color[i] = parse;
        }
    }

    /**
     * This method takes an array and returns what color is now equal to.
     */public int[] getColor(){
        return color;
    }
}
