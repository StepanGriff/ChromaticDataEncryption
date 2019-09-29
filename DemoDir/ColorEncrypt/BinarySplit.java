import java.io.*; 
import java.util.*;
import java.util.ArrayList;
/**
 * Splits chunks of binary.
 *
 * @Justin, Steve, Gabriel
 * @9/29/19
 */
public class BinarySplit
{
    public String stringIn;
    ArrayList<String> listForStringIn;
    /**
     * Constructor for objects of class ImageStuff. This constructor specifically talks about the stringIn in the 
     * method twenty4chunk. It then invokes the method. 
     */
    public BinarySplit(String stringIn)
    {
        this.stringIn = stringIn;
        twenty4Chunk();
    }
/**
 * This method will return an ArrayList of a String from what was initialized in the constructor BinarySplit. 
 */
    public ArrayList<String> getList()
    {
        return this.listForStringIn;
    }
/**
 * This method does not return a value, however, creates an ArrayList that would be used by different classes to get 
 * 24 bits of binary at a time. The "chunk", the empty String, would be given the String of whatever is getting passed.
 */
    public void twenty4Chunk() {
        this.listForStringIn = new ArrayList<String>();
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
            this.listForStringIn.add(chunk);
        }

    }
}
