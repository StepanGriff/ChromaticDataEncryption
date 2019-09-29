import java.io.*;
import java.util.*;

public class BinaryParser
{
    String filename;
    String binary;

    /**
     *In this method, there may be cases where problems arise. It will throw the two that follows "throws" and
     *produces those errors. It will then take in and read a text file that will then be expected to be in binary 
     *format without spaces. 
     */
    public BinaryParser(String filename)
    throws FileNotFoundException, IOException
    {
        this.filename = filename;
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        char thisChar;
        this.binary = "";
        while ((line = reader.readLine()) != null)
        {
            for (int i = 0; i < line.length(); i++)
            {
                thisChar = line.charAt(i);
                if (thisChar == '0' || thisChar == '1')
                {
                    this.binary += thisChar;
                }
            }

        }

    }
    /**
     * This method takes a String and returns the specific binary seen before.
     */
    public String toString()
    {
        return this.binary;
    }
}

