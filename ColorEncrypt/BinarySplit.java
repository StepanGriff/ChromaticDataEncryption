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
    public String stringIn;
    ArrayList<String> listForStringIn;
    /**
     * Constructor for objects of class ImageStuff
     */
    public BinarySplit(String stringIn)
    {
        this.stringIn = stringIn;
        twenty4Chunk();
    }

    public ArrayList<String> getList()
    {
        return this.listForStringIn;
    }

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
