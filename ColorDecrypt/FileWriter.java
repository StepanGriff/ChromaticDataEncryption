import java.io.*;
public class FileWriter
{
    String binary;
    String filename;
    final static String newline = "00000010";
    /**
     * Constructor for objects of class FileWriter
     */
    public FileWriter(String binary, String filename)
    {
        this.binary = binary;
        this.filename = filename;
    }

    public void write()
    {
        try
        {
            PrintWriter writer = new PrintWriter(this.filename);
            writer.println(this.binary);
            writer.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
            System.exit(1);
        }
    }
}
