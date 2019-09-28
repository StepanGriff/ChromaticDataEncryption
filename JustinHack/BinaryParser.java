import java.io.*;
import java.util.*;

public class BinaryParser
{
    String filename;
    String binary;
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

    public String toString()
    {
        return this.binary;
    }
}

 