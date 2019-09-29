import java.util.*;
/**
 * Write a description of class DecimaltoBinary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DecimalToBinary
{
    ArrayList<int[]> parseColors;
    String original;
    final static int ESCAPESEQUENCE = 3;
    /**
     * Constructor for objects of class DecimaltoBinary
     */
    public DecimalToBinary(ArrayList<int[]> parseColors)
    {
        this.parseColors = parseColors;
        toBinary();
    }
    
    public void toBinary(){
        int[] currentElement;
        String currentValue;
        for (int i =0; i<parseColors.size()-ESCAPESEQUENCE; i++){
            currentElement = parseColors.get(i);
            for (int j = 0; j<currentElement.length;j++){
                currentValue = Integer.toBinaryString (currentElement[j]);
                original += reverseString(currentValue);
            }
        }
    
    }

    public String reverseString(String binary){
        String reversed = "";
        for (int i=0;i<binary.length();i++)
        {
            reversed = binary.charAt(i) + reversed;
        }
        return reversed;
    }
    
    public String getOriginal(){
        return this.original;
    }
}
