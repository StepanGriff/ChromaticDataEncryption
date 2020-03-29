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
    int[]color;
    /**
     * Constructor for objects of class HexaColor
     */
    public HexaColor(String binary)
    {
        this.binary = binary;
        this.split= new String[3];
        this.color = new int[3];
        split();
        hexa();
    }

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

    public void hexa(){
        int parse;
        String y;
        for (int i =0; i<split.length; i++){
            //y = "";
            parse= Integer.parseInt(split[i], 2);
            this.color[i] = parse;
        }
    }

    public int[] getColor(){
        return color;
    }
}
