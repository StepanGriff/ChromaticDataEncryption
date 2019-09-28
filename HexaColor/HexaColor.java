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
        hexa();
    }
    public static void main (String args[])
    {
        HexaColor hc = new HexaColor("101011011001110001010101");
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
            System.out.println (split[i].toString() + "\n");
        }
    }
    
    public String hexa(){
        int parse;
        String color = "";
        String y;
        for (int i =0; i<split.length; i++){
            y = "";
            parse= Integer.parseInt(split[i], 2);
            System.out.println(parse);
            color += Integer.toHexString(parse);
            y =Integer.toHexString(parse);
            System.out.println(y + "\n");
        }
        System.out.println(color+ "\n");
        return color;
    }
}
