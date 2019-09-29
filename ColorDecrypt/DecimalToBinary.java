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
    String currentValue;
    final static int ESCAPESEQUENCE = 3;
    final int MAX_LENGTH=8;
    /**
     * Constructor for objects of class DecimaltoBinary
     */
    public DecimalToBinary(ArrayList<int[]> parseColors)
    {
        this.parseColors = parseColors;
        this.original ="";
        this.currentValue="";
        toBinary();
    }
    
    public void toBinary(){
        int[] currentElement;
             for (int i =0; i<parseColors.size()-ESCAPESEQUENCE; i++){
            currentElement = parseColors.get(i);
            for (int j = 0; j<currentElement.length;j++){
                currentValue = Integer.toBinaryString (currentElement[j]);
                String reverse = reverseString(currentValue);
                if (reverse.length() < 8){
                    reverse = adjustSize(reverse);
                }
                original += reverse +" ";
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
    
    public String adjustSize(String adjusted){
        String currentValue = adjusted;
        for (int i = MAX_LENGTH; i>adjusted.length();i--){
            currentValue += "0";
        }
        return currentValue;
    }
    
    public String getOriginal(){
        return this.original;
    }
}
